package com.ClassDemos;


public class EmployeeClient {

	public static void main(String[] args) {
		Employee.setCompany("Persistance");
		
		Employee e1 = new Employee();
		e1.displayData();
		double salary = e1.calculateSalary();
		System.out.println("Net Salary   : " + salary);
		
		System.out.println("------------------------------------------");
		
		Employee e2 = new Employee(111, "Priyanka", "Kolhapur", 60000);
		e2.displayData();
		System.out.println("Net Salary   : " + e2.calculateSalary());
		
		System.out.println("----------------------------------------");
		
		Employee.setCompany("Infosys");
		
		Employee e3 = new Employee();
		e3.displayData();
		System.out.println("Net Salary   : " + e2.calculateSalary());
		
		System.out.println("-----------------------------------------");
		e1.displayData();
	}

}
