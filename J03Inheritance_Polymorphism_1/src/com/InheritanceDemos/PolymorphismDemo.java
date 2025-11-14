package com.InheritanceDemos;

public class PolymorphismDemo {

	public static void getDetails(Employee emp) {
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
	}
	
	public static void main(String[] args) {
		Employee emp;					//Reference of Employee
		Employee e1 = new Employee();	//Object of Employee
		Manager m1 = new Manager(222, "Shraddha", 50000, "Accenture", 50000, 0.05);	//Object of Manager
		//Manager m2 = new Manager();
		
		/*emp = e1;
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		//Generic Reference - A reference of base class, which can hold address of derived class object
		emp = m1;
		System.out.println("--------------------------");
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		*/
		getDetails(e1);
		System.out.println("--------------------------");
		getDetails(m1);
		
		final double pi = 3.142;
		//pi = 8.8;
	}

}
