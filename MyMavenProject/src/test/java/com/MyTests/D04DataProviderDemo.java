package com.MyTests;

import org.testng.annotations.Test;

public class D04DataProviderDemo {
	@Test(dataProvider = "getData", dataProviderClass = com.MyTests.D03ReadFromExcel.class)
	public void myTest(String un, String ps, String rs, String ms) {
		System.out.println(un);
		System.out.println(ps);
		System.out.println(rs);
		System.out.println(ms);
	}
}
