package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D34RightClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(rightClick).contextClick().perform();
		act.contextClick(rightClick).perform();
		Thread.sleep(2000);
		
		//List<WebElement>subMenus = driver.findElements(By.cssSelector("ul[class=\"context-menu-list context-menu-root\"]>li>span"));
		//List<WebElement>subMenus = driver.findElements(By.cssSelector("ul[class=\"context-menu-list context-menu-root\"] span"));
		List<WebElement>subMenus = driver.findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]/li/span"));
		System.out.println("--------- Sub Menus -----------");
		for(WebElement s : subMenus)
			System.out.println(s.getText());
		
		//To disable the menu which is displayed after right click
		//driver.findElement(By.id("authentication")).click();
		//act.moveToElement(driver.findElement(By.id("authentication"))).click().perform();
		act.click(driver.findElement(By.id("authentication"))).perform();		
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		//act.moveToElement(doubleClickButton).doubleClick().perform();
		act.doubleClick(doubleClickButton).perform();
		
		System.out.println("------------- After Double click -------------");
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
