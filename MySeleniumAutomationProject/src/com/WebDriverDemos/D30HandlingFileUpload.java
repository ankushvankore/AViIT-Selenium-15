package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D30HandlingFileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.id("firstName")).sendKeys("Snehasmita");
		driver.findElement(By.id("lastName")).sendKeys("Senapati");
		driver.findElement(By.id("userEmail")).sendKeys("sneha123@gmail.com");
		
		WebElement gnFemale = driver.findElement(By.id("gender-radio-2"));
		js.executeScript("arguments[0].click()", gnFemale);
		
		driver.findElement(By.id("userNumber")).sendKeys("9898989898");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("03 Dec 2000");
		driver.findElement(By.id("subjectsInput")).sendKeys("H");
		driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]")).click();
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("hobbies-checkbox-1")));
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Downloads\\512710602_1791081391476439_378344098520922769_n.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("UAE");
		driver.findElement(By.xpath("//*[@id=\"state\"]/div[1]/div[2]/div")).click();
		driver.findElement(By.id("react-select-3-option-1")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div")).click();
		driver.findElement(By.id("react-select-4-option-0")).click();
	}

}
