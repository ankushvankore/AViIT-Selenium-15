package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05AjioAssignment {
	WebDriver driver;
	@Test(priority = 1)
	public void clickOnMenLink() {
		driver.findElement(By.linkText("MEN")).click();
	}
	
	@Test(priority = 2)
	public void clickOnWomenLink() {
		driver.findElement(By.linkText("WOMEN")).click();
	}
	
	@Test(priority = 3)
	public void clickOnKidsLink() {
		driver.findElement(By.linkText("KIDS")).click();
	}
	
	@Test(priority = 4)
	public void clickOnBeautyLink() {
		driver.findElement(By.linkText("BEAUTY")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.ajio.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
