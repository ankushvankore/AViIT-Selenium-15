package com.MyTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener {
	public void onStart(ITestContext result) {
		System.out.println("Test started");
	}

	public void onFinish(ITestContext result) {
		System.out.println("Test Ends");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test " + result.getName() + " failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test " + result.getName() + " skipped");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test " + result.getName() + " Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test " + result.getName() + " passed");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
}
