package com.Assignments;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class D09ForAssertion {
	@Test
	public void hardAssertionDemo() {
		System.out.println("------------------- Hard Assertion -----------------");
		System.out.println("Test started!!!");
		Assert.assertTrue(false); //Test case fail
		System.out.println("Test ended!!!");		
	}
	
	@Test
	public void softAssertionDemo() {
		System.out.println("------------------- Soft Assertion -----------------");
		System.out.println("Test started!!!");
		
		SoftAssert a1 = new SoftAssert();
		a1.assertTrue(false); //Test case fail
		
		System.out.println("Test ended!!!");	
		a1.assertAll();
	}
}
