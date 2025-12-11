package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D38HandlingDatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.redbus.in/");

		//From
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[1]/div[1]/div[1]/div/div[1]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Kolh");
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();

		//To
		//driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[2]/div/div/div[1]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Ban");
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();

		//Calendar
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[3]/div[1]/i")).click();

		WebElement nextArrow = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[3]/div[3]/div[2]/div/div/i[2]"));
		WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[3]/div[3]/div[2]/div/div/div/p[1]"));

		/*for(int i = 1; i <= 3; i++) {
			Thread.sleep(1000);
			nextArrow.click();
		}*/
		
		String expMonth = "December 2026";
		String expDay = "25";
		
		while(!month.getText().contains(expMonth)) {
			Thread.sleep(500);
			nextArrow.click();
		}
		
		driver.findElement(By.xpath("//span[text()=\""+expDay+"\"]")).click();
	}

}
