package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05ExtentReportDemo {

	public static void main(String[] args) {
		WebDriver driver;
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MyFirstReport.html");
		//The file that stores the report
		ExtentReports report = new ExtentReports();
		//This object represents the report
		report.attachReporter(htmlReport);
		//The report will be stored in the above file
		ExtentTest test;
		//Represents the test cases
		
		//Add the environment details
		report.setSystemInfo("Tester Name", "Shraddha");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Machine", "Dell");
		report.setSystemInfo("OS", "Windows 10");
		
		//Configuration of look and feel of report
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Test Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");
		
		//Create a test for reporting
		test = report.createTest("Google Title Test");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
		
		test.log(Status.PASS, MarkupHelper.createLabel("Google Title", ExtentColor.GREEN));
		
		//Create one more test
		test = report.createTest("Google Search Test");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Extent Report", Keys.ENTER);
		
		driver.close();
		
		test.log(Status.FAIL, MarkupHelper.createLabel("Google Search", ExtentColor.ORANGE));
		
		report.flush();			//Generates the report
	}

}
