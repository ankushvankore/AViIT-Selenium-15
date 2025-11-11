package com.ArrayDemos;

public class D04StringDemo {

	public static void main(String[] args) {
		/*
		 * String: 
		 * It is 1D array of characters
		 * It is a class in Java
		 * It is not a built-in data type
		 * It is FIRST CLASS OBJECT in java
		 */
		String str1 = new String("Ravindra");
		String str2 = "Ravindra";
		
		System.out.println("Element at 3rd position: " + str1.charAt(3));
		System.out.println("Index of d: " + str1.indexOf('d'));
		System.out.println("Index of a: " + str1.indexOf('a'));
		
		if(str1.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		String browser1 = "Chrome";
		String browser2 = "chrome";
		
		if(browser1.equalsIgnoreCase(browser2))
			System.out.println("Launching chrome");
		else
			System.out.println("Invalid browser");
		
		String title1 = "ORANGE HRM";
		String expTitle = "Orange";
		System.out.println("Contains Orange: " + title1.contains("Orange"));
		System.out.println("Contains Orange: " + title1.contains(expTitle.toUpperCase()));
		
		System.out.println("Lower Case: " + title1.toLowerCase());
		
		String message = "Invalid username or password";
		String[] arr = message.split(" ");
		System.out.println(arr[0]);
		
		for(String s : arr)
			System.out.println(s);
		
		String newMessage = message.replace('a', 'A');
		System.out.println(newMessage);
	}

}
