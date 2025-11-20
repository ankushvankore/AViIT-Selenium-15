package com.CollectionDemos;

import java.util.HashSet;
import java.util.Set;

public class D03SetDemo {

	public static void main(String[] args) {
		Set<String>students = new HashSet<>();
		
		students.add("Snehasmita");
		students.add("Priyanka");
		students.add("Shraddha");
		students.add("Priyanka");
		
		System.out.println("Total elements: " + students.size());

		for(String s : students)
			System.out.println(s);
	}

}
