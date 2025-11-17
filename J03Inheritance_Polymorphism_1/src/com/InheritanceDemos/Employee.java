package com.InheritanceDemos;


public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private String address;
	protected double basicSalary;
	
	
	public Employee() {
		empId = 101;
		empName = "Snehasmita";
		address = "Dubai";
		basicSalary = 50000;
		//System.out.println("Employee-->Plain");
	}
	
	public Employee(int id, String nm, String ad, double bs) {
		this.empId = id;
		empName = nm;
		address = ad;
		basicSalary = bs;
		//System.out.println("Employee-->Parameterized");
	}
	
	public void displayData() {
		System.out.println("Employee Id  : " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Address      : " + this.address);
		System.out.println("Basic Salary : " + this.basicSalary);
	}
	
	public double calculateSalary() {
		double da, hra, pf, net;
		
		da = basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = basicSalary + da + hra - pf;
		
		return net;
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.empId, o.empId);
	}

}
