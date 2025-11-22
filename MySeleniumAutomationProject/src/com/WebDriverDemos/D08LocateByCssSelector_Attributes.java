package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector_Attributes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]"));
		userName.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"][data-testid=\"royal-pass\"]"));
		password.sendKeys("1234");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[data-testid=\"royal-login-button\"]"));
		loginBtn.click();
	}

}
