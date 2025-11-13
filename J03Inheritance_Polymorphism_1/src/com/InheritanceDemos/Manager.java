package com.InheritanceDemos;

public class Manager extends Employee
{
	private double sales;
	private double rate;
	
	public Manager() {
		super();
		sales = 0;
		rate = 0;
		System.out.println("Manager-->Plain");
	}

	public Manager(int id, String nm, double bs, String ad, double sales, double rate) {
		super(id, nm, ad, bs);	//Will call parameterized constructor of Employee class
		this.sales = sales;
		this.rate = rate;
		System.out.println("Manager-->Parameterized");
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
