package com.ClassDemos;

public class Employee {
	private int empId;
	private String empName;
	private String address;
	private double basicSalary;
	private static String company;
	
	public void setCompany(String c) {
		company = c;
	}
	
	public Employee() {
		empId = 101;
		empName = "Snehasmita";
		address = "Dubai";
		basicSalary = 50000;
	}
	
	public Employee(int id, String nm, String ad, double bs) {
		this.empId = id;
		empName = nm;
		address = ad;
		basicSalary = bs;
	}
	
	public void displayData() {
		System.out.println("Employee Id  : " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Address      : " + this.address);
		System.out.println("Basic Salary : " + this.basicSalary);
		System.out.println("Company Name : " + company);
	}
	
	public double calculateSalary() {
		double da, hra, pf, net;
		
		da = basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = basicSalary + da + hra - pf;
		
		return net;
	}
}
