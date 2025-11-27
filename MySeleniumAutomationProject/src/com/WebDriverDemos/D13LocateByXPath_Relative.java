package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.xpath("//form[@name=\"Form2\"]/fieldset/div[2]/fieldset/input[1]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("test");
		//driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/form/fieldset/div[3]/div[1]/input")).click();

		System.out.println(driver.findElement(By.xpath("//*[@id=\"lblMsg\"]")).getText());
		
		driver.close();
	}

}
