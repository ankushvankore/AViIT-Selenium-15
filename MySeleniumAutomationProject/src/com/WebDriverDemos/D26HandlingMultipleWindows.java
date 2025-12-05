package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 200)", "");
		
		driver.findElement(By.xpath("//span[contains(text(), \"Remote\")]")).click();
		System.out.println("Title: " + driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		//System.out.println(windows);

		Iterator<String>itr = windows.iterator();
		String win1 = itr.next();		//will return 1st element / id of 1st window
		String win2 = itr.next();		//will return 2nd element / id of 2nd window
		
		driver.switchTo().window(win2);
		Thread.sleep(3000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//label[@for='chk-Work from office-wfhType-']//i[@class='ni-icon-unchecked']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(win1);
		driver.findElement(By.linkText("Login")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
