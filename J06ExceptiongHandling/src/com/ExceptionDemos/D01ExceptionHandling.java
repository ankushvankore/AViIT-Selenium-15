package com.ExceptionDemos;

import java.security.InvalidParameterException;

public class D01ExceptionHandling {

	public static void main(String[] args) {
		int[] arr = {44, 33, 55, 22, 77, 11};
		int i = 8;
		
		try {
			System.out.println(arr[i]);
		}
		catch(NullPointerException ex) {
			System.out.println(ex);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(InvalidParameterException ex) {
			System.out.println(ex);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("Finally block get executed!!!");
		}
		
		System.out.println("Program ends!!!");
	}

}
