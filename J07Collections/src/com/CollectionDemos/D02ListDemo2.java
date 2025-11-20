package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D02ListDemo2 {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(33);
		numbers.add(44);
		numbers.add(11);
		
		System.out.println("Total numbers: " + numbers.size());
		
		for(int n : numbers)
			System.out.println(n);

	}

}
