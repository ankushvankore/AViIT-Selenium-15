package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	
	@Given("Open Google in Browser")
	public void open_google_in_browser() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://google.com");
	}

	@When("Enter the text to search in search box")
	public void enter_the_text_to_search_in_search_box() {
	    driver.findElement(By.name("q")).sendKeys("Maven Repository");
	}

	@When("Hit Enter")
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("a valid search result should display")
	public void a_valid_search_result_should_display() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Maven"));
		System.out.println(driver.getTitle());
	}
}
