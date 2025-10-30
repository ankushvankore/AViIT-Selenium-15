package com.BasicPrograms;

import java.util.Scanner;

public class D04CalculateDiscount {
	public static void main(String[] args) {
		int amount;
		double discount, net;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		amount = scn.nextInt();
		
		discount = amount * 0.10;
		net = amount - discount;
		
		System.out.println("Discount: " + discount);
		System.out.println("Net Amount: " + net);
	}
}
