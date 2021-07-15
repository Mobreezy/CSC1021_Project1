package com.mobreezy;

/*
 * Name:Mohammed Ali
 * Student Number:18031009
 * Date:23/08/19
 * */
//The purpose of this class is to
public class TaxCalculator {

	// this is a list of tax rates that is required to calculate the tax
	private static final double  TAX_RATES1 = 0.05;
	private static final double  TAX_RATES2 = 0.1;
	private static final double  TAX_RATES3 = 0.15;
	private static final double  TAX_RATES4 = 0.20;
	private static final double  TAX_RATES5 = 1.5;
	// 
	private static final double   INCOME_RANGE1 = 50;
	private static final double   INCOME_RANGE2 = 100;
	private double output;
	private double roundedTax;

	//This method calculates the taxes and then rounds it up to the nearest integer
	public int calculator (int income) {
		/*The method takes in an integer and then attempts to allocate it to its respective tax bracket
		 *it then calculates the tax value and rounds it up to the nearest integer
		 * */

		if (income <= 100 && income >= 0){
			//if the input is in the range of 0 and 101 then the tax payable is 0
			return 0;
		}
		else if (income > 100 && income <= 150){
			output = (income - 100)*TAX_RATES1;
			roundedTax = Math.round(output);

			return (int) roundedTax;
		}
		else if (income > 150 && income <=  200){
			output = INCOME_RANGE1*TAX_RATES1 + (income-150)*TAX_RATES2;
			roundedTax = Math.round(output);

			return (int) roundedTax;
		}
		else if (income >= 201 && income <= 300){
			output = INCOME_RANGE1*TAX_RATES1 + INCOME_RANGE1*TAX_RATES2+ (income-200)*TAX_RATES3;
			roundedTax = Math.round(output);

			return (int) roundedTax;
		}
		else if (income >= 301 && income <= 400){
			output = INCOME_RANGE1*TAX_RATES1+ INCOME_RANGE1*TAX_RATES2 + INCOME_RANGE2*TAX_RATES3+ (income - 300)*TAX_RATES4;
			roundedTax = Math.round(output);

			return (int) roundedTax;
		}
		else if(income >= 401){
			output = INCOME_RANGE1*TAX_RATES1+ INCOME_RANGE1*TAX_RATES2 + INCOME_RANGE2*TAX_RATES3+ INCOME_RANGE2*TAX_RATES4 + (income - 400)*TAX_RATES5;
			roundedTax = Math.round(output);

			return (int) roundedTax;
		}
		else {
			//if the value from the input is less than zero the program returns 0
			return 0;
		}

	}

}

