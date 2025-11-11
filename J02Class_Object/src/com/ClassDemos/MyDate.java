package com.ClassDemos;

public class MyDate {
	private int day;
	private String month;
	private int year;

	public MyDate() {
		day = 1;
		month = "Jan";
		year = 2025;
		System.out.println("Plain / Default / No Parameter Constructor Called!!!");
	}
	public MyDate(int d, String m, int y) {
		day = d;
		month = m;
		year = y;
		System.out.println("Parameterized Constructor called!!!");
	}
	public MyDate(int d, String m) {
		day = d;
		month = m;
		year = 2000;
		System.out.println("Second type of parameterized constructor called!!!");
	}
	
	public void setDay(int d) 			//Mutator / Setter Function
	{
		day = d;
	}
	public int getDay()					//Accessor / Getter Function
	{
		return day;
	}
	public void displayDate() 			//Facilitator Function
	{
		System.out.println("Date is: " + this.day + "-" + month + "-" + year);
	}
}
