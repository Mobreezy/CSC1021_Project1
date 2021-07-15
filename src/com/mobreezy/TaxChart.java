package com.mobreezy;
/*
 * Name:Mohammed Ali
 * Student Number:18031009
 * Date:23/08/19
 * */
public class TaxChart {

	//A list of constant values used to change the size or change the position of the bars or axes	
	private int barWidth = 3;
	private int origin = 240;
	private int scalar = 3;
	private int moveXBar = -45;

	private TaxCalculator tax;
	private int [] incomeArray;
	private Bar [] netIncomeBar;
	private Bar [] taxPayableBar;

	private int arraySize;
	//private int compare;
	//This is a constructor that
	public TaxChart(int [] incomeArray){
		this.incomeArray = incomeArray;
		//compare =1;
	}
	//This method is used to draw the Axes  
	private void Axes() {
		//making the x-Axis
		Bar xAxis = new Bar();
		xAxis.makeVisible();
		xAxis.changeSize(285,1);
		xAxis.changeColour(Colour.BLUE);
		xAxis.moveHorizontal(-50);
		xAxis.moveVertical(origin);

		//making the y-axis
		Bar yAxis = new Bar();
		yAxis.makeVisible();
		yAxis.changeColour(Colour.BLUE);
		yAxis.changeSize(1, 285);
		yAxis.moveHorizontal(-45);
		yAxis.moveVertical(-40);
	}
	//This method produces 
	public void DrawChart() {

		arraySize = incomeArray.length;
		netIncomeBar = new Bar[arraySize];
		taxPayableBar = new Bar [arraySize];
		tax = new TaxCalculator();

		Axes();

		//this is a for loop that loops through an array of integers
		for (int i =0;i < arraySize; i++) {

			if (incomeArray[i] >0) {

				/*This creates a bar on the graph
				 * it represents the net income
				 * it is calculated by subtracting the tax from the gross income
				 * */ 
				netIncomeBar[i] = new Bar();
				netIncomeBar[i].changeSize(barWidth, (incomeArray[i] - tax.calculator(incomeArray[i]))/scalar);
				netIncomeBar[i].moveVertical(origin - (incomeArray[i] - tax.calculator(incomeArray[i]))/scalar);
				netIncomeBar[i].moveHorizontal(moveXBar+incomeArray[i]/scalar);
				netIncomeBar[i].changeColour(Colour.YELLOW);
				netIncomeBar[i].makeVisible();


				/*Here a tax payable bar is created 
				 * */
				taxPayableBar[i] = new Bar();
				taxPayableBar[i].changeSize(barWidth, tax.calculator(incomeArray[i])/scalar);
				taxPayableBar[i].moveVertical(origin-((incomeArray[i] - tax.calculator(incomeArray[i]))/scalar)-(tax.calculator(incomeArray[i])/scalar));
				taxPayableBar[i].moveHorizontal(moveXBar +incomeArray[i]/scalar);
				taxPayableBar[i].changeColour(Colour.RED);
				taxPayableBar[i].makeVisible();
			}
			else {

			}


		}	
	}

	/*This method prints a table with two columns 
	 * A net income column and its respective tax in the other column 
	 * */
	public void PrintTable() {

		System.out.println("Net Income                      Tax   ");
		/*A for loop that will iterate a number of times until the boolean condition is reached
		 * In this case the number of times it iterates through the array is proportional to the length of the array
		 * */
		for(int x = 0; x < incomeArray.length; x++) {
			System.out.format("%-32s %1s%n", incomeArray[x] - tax.calculator(incomeArray[x]), tax.calculator(incomeArray[x]));
		}
	}

}






