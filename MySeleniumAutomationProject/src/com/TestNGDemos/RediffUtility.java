package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Enter your full name']")WebElement fullName;
	@FindBy(xpath = "//input[starts-with(@name, \"login\")]")WebElement rediffId;
	@FindBy(className = "day")WebElement dayDrp;
	@FindBy(className = "middle")WebElement monthDrp;
	@FindBy(className = "year")WebElement yearDrp;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[4]/input[1]")WebElement btnCheck;
	@FindBy(xpath = "//*[@id=\"check_availability\"]/div")WebElement infoMessage;
	
	public RediffUtility(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this); 		//Will initialize all the WebElements declared above
	}
	
	public void setFullName(String fn) {
		//driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	
	public void setRediffId(String rid) {
		//driver.findElement(By.xpath("//input[starts-with(@name, \"login\")]")).sendKeys(rid);
		rediffId.sendKeys(rid);
	}
	
	public void setPassword(String ps) {
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}
	
	public void setBirthDate(String day, String month, String year) {
		//Select dayDD = new Select(driver.findElement(By.className("day")));
		Select dayDD = new Select(dayDrp);
		dayDD.selectByVisibleText(day);
		
		//new Select(driver.findElement(By.className("middle"))).selectByVisibleText(month);
		new Select(monthDrp).selectByVisibleText(month);
		//new Select(driver.findElement(By.className("year"))).selectByVisibleText(year);
		new Select(yearDrp).selectByVisibleText(year);
	}
	
	public String checkAvailablity() throws InterruptedException {
		btnCheck.click();
		Thread.sleep(2000);
		//System.out.println(infoMessage.getText());
		return infoMessage.getText();
				
	}
}
