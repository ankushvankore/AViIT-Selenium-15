package com.Functions;

import java.util.Scanner;

public class D02PassingArguments {

	public static void calculateSum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {
		int no1, no2;

		Scanner scn = new Scanner(System.in);
		// Scanner is a class used to accept the values from the user
		System.out.println("Enter 1st number: ");
		no1 = scn.nextInt();
		System.out.println("Enter 2nd number: ");
		no2 = scn.nextInt();

		calculateSum(no1, no2);
		calculateSum(6, 7);
	}

}
