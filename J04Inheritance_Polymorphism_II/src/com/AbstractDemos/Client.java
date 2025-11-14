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
	}

}
