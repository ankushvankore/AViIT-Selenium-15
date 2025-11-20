package com.CollectionDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D01ListDemo {

	public static void main(String[] args) {
		List<String>days = new ArrayList<>();

		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		
		System.out.println("Total days: " + days.size());
		
		//System.out.println(days.get(1));
		//System.out.println(days.get(2));
		
		//for(int i = 0; i < days.size(); i++)
			//System.out.println(days.get(i));
		
		for(String d : days)
			System.out.println(d);

		Collections.sort(days);
		
		System.out.println("----------After Sorting-----------");
		
		for(String d : days)
			System.out.println(d);
		
		//days.remove(1);
		days.remove("Sunday");
		
		System.out.println("----------After Deleting-----------");
		
		for(String d : days)
			System.out.println(d);
	}

}
