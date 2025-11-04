package com.Functions;

public class D05ReturnValueWithoutPassing {
	public static int calculateSqure() {
		int no = 8;
		int ans = no * no;
		
		return ans;
	}
	public static void main(String[] args) {
		int sq = calculateSqure();
		System.out.println("Squre: " + sq);
	}
	/*
	public static void calculateArea() {}
	public static void calculateArea(int r) {}
	public static double calculateArea(int r) {}
	public static double calculateArea() {}
	*/
}
