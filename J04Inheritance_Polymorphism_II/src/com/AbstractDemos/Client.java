package com.AbstractDemos;

public class Client {

	public static void main(String[] args) {
		//Shape s1 = new Shape();
		Shape s1 = new Circle(5);
		s1.calculateArea();
		
		s1 = new Triangle(6, 5);
		s1.calculateArea();
		
		Circle c1 = new Circle(6);
		c1.calculateArea();
		
		s1.trialMethod();
		c1.trialMethod();
		
		c1.print();
		//s1.print();
		
		//PrintInfo p1 = new PrintInfo();
		PrintInfo p1 = new Triangle(8, 9);
		p1.print();
	}

}
