package com.Functions;

public class D03ReturningValue {
	public static double calculateArea(int rd)	{
		double area = 3.142 * rd * rd;
		return area;
	}
	/*
	 * Points to be noted about return statement
	 * 1. return statement returns the value to the calling function
	 * 2. return statement terminates the function
	 * 3. return statement can return single value only 
	 *    but you many have multiple return statements in the function
	 */
	public static void main(String[] args) {
		int rd = 5;
		
		double area = calculateArea(rd);
		System.out.println("Area: " + area);

	}

}
