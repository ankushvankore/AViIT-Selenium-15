package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D02TrialTestNGClass {
	WebDriver driver;
	@Test(priority = 1)
	public void clickOnGmail() {
		driver.findElement(By.linkText("Gmail")).click();
	}
	
	@Test(priority = 2)
	public void clickOnImages() {
		driver.findElement(By.linkText("Images")).click();
	}
	
	@Test(priority = 3)
	public void clickOnAdvt() {
		driver.findElement(By.partialLinkText("Adve")).click();
	}
	
	@Test(priority = 4)
	public void clickOnAbout() {
		driver.findElement(By.partialLinkText("About")).click();
	}

	@BeforeMethod 
	public void beforeMethod() {
		driver.get("https://google.com");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
