package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S07DataDrivenTesting {
	WebDriver driver;
	
	@Given("Open Orange HRM application")
	public void open_orange_hrm_application() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter valid username as {string} and valid password as {string}")
	public void enter_valid_username_as_and_valid_password_as(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Dashboard page should display")
	public void dashboard_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
}
