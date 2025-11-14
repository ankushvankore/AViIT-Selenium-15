package com.AbstractDemos;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int length, int height) {
		super();
		this.base = length;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		double area = 0.5 * base * height;
		System.out.println("Area of Circle: " + area);		
	}
	
	
}
