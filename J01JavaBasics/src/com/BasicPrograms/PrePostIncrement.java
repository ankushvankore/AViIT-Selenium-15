package com.BasicPrograms;

public class PrePostIncrement {

	public static void main(String[] args) {
		int no1 = 9, no2, no3;

		/*no2 = no1++;		//Post-increment
		no3 = ++no1;		//Pre-increment
		
		System.out.println("No1: " + no1);
		System.out.println("No2: " + no2);
		System.out.println("No3: " + no3);*/
		
		System.out.println(no1++);
		System.out.println(no1);
		System.out.println(++no1);
	}

}
