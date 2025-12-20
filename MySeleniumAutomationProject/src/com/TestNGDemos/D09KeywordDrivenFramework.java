package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D09KeywordDrivenFramework {
	File file;
	FileInputStream fis;
	Properties prop;
	WebDriver driver;
	
	@Test
	public void automobileTest() {
		driver.findElement(By.linkText(prop.getProperty("autoLinkText"))).click();
		//Select make = new Select(driver.findElement(By.id(prop.getProperty("makeDDId"))));
		//make.selectByIndex(2);
		new Select(driver.findElement(By.id(prop.getProperty("makeDDId")))).selectByIndex(3);
		driver.findElement(By.xpath(prop.getProperty("epXP"))).sendKeys("1000");
		driver.findElement(By.name(prop.getProperty("domName"))).sendKeys("12/02/2025");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("src/com/TestNGDemos/MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);		//This will load all the properties in prop object
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));
		
	}

	@AfterTest
	public void afterTest() {
	}

}
