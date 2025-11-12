package com.ClassDemos;

public class DateClient {

	public static void main(String[] args) {
		MyDate dtr;
		MyDate d1 = new MyDate();
		d1.setDay(10);
		d1.displayDate();
		int d = d1.getDay();
		System.out.println("Day is: " + d);
		
		MyDate d2 = new MyDate();
		//d2.setDate();
		d2.displayDate();
		
		MyDate d3 = new MyDate(5, "Mar", 1995);
		d3.displayDate();
		
		MyDate d4 = new MyDate(25, "Dec");
		d4.displayDate();
		
		MyDate d5 = new MyDate(3, "Dec");
		d5.displayDate();
		
		int dt = 11, y = 2025;
		String m = "Nov";
		
		MyDate d6 = new MyDate(dt, m, y);
		d6.displayDate();
		
	}

}
