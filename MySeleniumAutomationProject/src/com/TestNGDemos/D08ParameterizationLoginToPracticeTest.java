package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import graphql.Assert;

public class D08ParameterizationLoginToPracticeTest {
	WebDriver driver;
	
	@Parameters({"userName", "password"})
	@Test
	public void loginToPraticeTest(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	@Parameters({"userName1", "password1"})
	@Test
	public void loginToPraticeTest2(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains("successfully"))
			driver.findElement(By.partialLinkText("Log")).click();
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		driver.close();
	}
}
