package com.InheritanceDemos;

public class Manager extends Employee
{
	private double sales;
	private double rate;
	
	public Manager() {
		sales = 0;
		rate = 0;
	}

	public Manager(int id, String nm, double bs, String ad, double sales, double rate) {
		this.sales = sales;
		this.rate = rate;
	}
	
	public double calculateInsentive() {
		return sales * rate;
	}
	
	public double calculateSalary() {
		return (super.calculateSalary() + calculateInsentive());
	}
	
	public void displayData() {
		super.displayData();
		System.out.println("Total Sales  : " + sales);
		System.out.println("Rate of Comm : " + rate);
	}
}
