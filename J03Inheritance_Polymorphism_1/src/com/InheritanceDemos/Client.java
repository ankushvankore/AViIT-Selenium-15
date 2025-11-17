package com.InheritanceDemos;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.displayData();
		System.out.println("Net Salary   : " + m1.calculateSalary());
		
		System.out.println("------------------------------");
		
		Manager m2 = new Manager(111, "Priyanka", 60000, "Banglore", 50000, 0.05);
		m2.displayData();
		System.out.println("Net Salary   : " + m2.calculateSalary());
		
		Employee[] employees = {
					new Employee(111, "Shraddha", "Pune", 48000), 
					new Employee(654, "Sneha", "Siligudi", 46000),
					new Employee(98, "Priyanka", "Banglore", 60000)};
		
		Arrays.sort(employees);
		
		for(Employee e1 : employees)
			e1.displayData();
	}
}
