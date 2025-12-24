package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class D10POM_Client {
	RediffUtility r1;
	WebDriver driver;
	
	@Test
	public void createUser() throws InterruptedException {
		r1.setFullName("Priyanka Sutar");
		r1.setRediffId("piyu123");
		r1.setPassword("priyanka!234");
		r1.setBirthDate("05", "MAR", "2000");
		String msg = r1.checkAvailablity();
		Assert.assertTrue(msg.contains("available"));
	}
	
	@Test
	public void createUser2() throws InterruptedException {
		r1.setFullName("Snehasmita Senapati");
		r1.setRediffId("snehasmita5dec");
		r1.setPassword("sneha123");
		r1.setBirthDate("05", "DEC", "2000");
		String msg = r1.checkAvailablity();
		Assert.assertTrue(msg.contains("available"));
	}
	@BeforeMethod
	public void refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
