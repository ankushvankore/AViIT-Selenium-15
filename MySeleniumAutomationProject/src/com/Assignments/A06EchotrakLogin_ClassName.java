package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06EchotrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("Snehasmita");
		WebElement password = driver.findElement(By.cssSelector("input[class=\"form-control\"][id=\"txtPassword\"]"));
		password.sendKeys("sneha123");
		WebElement loginBtn = driver.findElement(By.className("btn-block"));
		loginBtn.click();
		
		WebElement errMsg = driver.findElement(By.id("lblMsg"));
		String msg = errMsg.getText();
		System.out.println("Error Message: " + msg);
		
		driver.close();
	}

}
