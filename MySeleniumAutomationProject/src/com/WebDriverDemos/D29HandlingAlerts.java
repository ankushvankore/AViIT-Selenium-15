package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D29HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Alert alt;
		
		WebElement button1 = driver.findElement(By.id("alertButton"));
		js.executeScript("arguments[0].click()", button1);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();				//Will click on the Ok button
		
		WebElement button2 = driver.findElement(By.id("timerAlertButton"));
		js.executeScript("arguments[0].click()", button2);
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("confirmButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.dismiss();				//Will click on Cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		alt = driver.switchTo().alert();
		alt.sendKeys("Shraddha");
		Thread.sleep(2000);
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.close();
	}

}
