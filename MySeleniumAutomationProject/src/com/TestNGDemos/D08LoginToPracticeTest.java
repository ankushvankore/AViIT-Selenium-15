package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D08LoginToPracticeTest {
	WebDriver driver;
	@Test
	public void loginToPraticeTest() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.close();
	}
}
