package com.InheritanceDemos;

public class Client {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.displayData();
		System.out.println("Net Salary   : " + m1.calculateSalary());
		
		System.out.println("------------------------------");
		
		Manager m2 = new Manager(111, "Priyanka", 60000, "Banglore", 50000, 0.05);
		m2.displayData();
		System.out.println("Net Salary   : " + m2.calculateSalary());
	}
}
