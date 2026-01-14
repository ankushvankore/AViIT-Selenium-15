package com.MyTests;

import org.testng.annotations.Test;

public class D10InvocationTimeout {

	@Test(invocationTimeOut = 2000)
	public void myTest() throws InterruptedException {
		System.out.println("Test started!!!");
		
		Thread.sleep(3000);
		
		System.out.println("Test Ends");
	}
}
