package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D08DependsOnMethod {
	@Test
	public void login() {
		System.out.println("Login test");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout Test");
	}
}
