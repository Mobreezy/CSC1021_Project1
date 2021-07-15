package com.mobreezy;

/*
 * Name:Mohammed Ali
 * Student Number:18031009
 * Date:23/08/19
 * */
public class Test {


	//This method calculates the smallest salary (>0) where the tax paid is so great that the net pay is calculated to be zero.
	public static void SmallestInt() {
		TaxCalculator tax1 = new TaxCalculator();
		int compare = 1;
		while (compare != tax1.calculator(compare)) {
			compare ++;
		}
		System.out.println("The smallest salary (>0) where the tax paid is so great that the net pay is calculated to be zero is = £" + compare);
	}

	//This is a method that initialises an array of integers with increasing incomes
	public static void taxTables () {

		//test data set
		int [] incomeArray =  {0,25, 50, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 500, 550}; 

		//creates instance of the tax chart and calls the methods
		TaxChart taxChart = new TaxChart(incomeArray);

		taxChart.DrawChart();
		taxChart.PrintTable();

	}

	public static void main(String[] args) {

		taxTables();
		SmallestInt();

	}


}