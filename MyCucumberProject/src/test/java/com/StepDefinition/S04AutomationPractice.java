package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04AutomationPractice {
	WebDriver driver;
	
	@Given("Open Automation Testing Practice Page")
	public void open_automation_testing_practice_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://testautomationpractice.blogspot.com/?m=1");
	}

	@When("Enter name as {string}")
	public void enter_name_as(String name) {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
	}

	@When("Enter email as {string}")
	public void enter_email_as(String email) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	}

	@When("Enter phone no as {string}")
	public void enter_phone_no_as(String phone) {
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
	}

	@When("Enter address as {string}")
	public void enter_address_as(String address) {
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys(address);
	}

	@When("Select gender as {string}")
	public void select_gender_as(String gender) {
		if(gender.equals("Male"))
			driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		else
			driver.findElement(By.xpath("//*[@id=\"female\"]")).click();
	}

	@Then("Testing successful")
	public void testing_successful() {
		System.out.println("Thank you");
	}
}
