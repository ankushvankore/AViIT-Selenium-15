package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04SeleniumLinks {
	WebDriver driver;
	
	@Given("Open {string}")
	public void open(String url) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get(url);
	}

	@When("Click on Downloads link")
	public void click_on_downloads_link() {
		driver.findElement(By.partialLinkText("Down")).click();
	}

	@Then("Downloads page should open")
	public void downloads_page_should_open() {
		Assert.assertTrue(driver.getTitle().contains("Down"));
	}

	@When("Click on Documents link")
	public void click_on_documents_link() {
		driver.findElement(By.partialLinkText("Docu")).click();
	}

	@Then("Documents page should open")
	public void documents_page_should_open() {
		Assert.assertTrue(driver.getTitle().contains("Browser"));
	}

	@When("Click on Projects link")
	public void click_on_projects_link() {
		driver.findElement(By.partialLinkText("Proj")).click();
	}

	@Then("Projects page should open")
	public void projects_page_should_open() {
		Assert.assertTrue(driver.getTitle().contains("Proj"));
	}

	@When("Click on Support link")
	public void click_on_support_link() {
		driver.findElement(By.partialLinkText("Supp")).click();
	}

	@Then("Support page should open")
	public void support_page_should_open() {
		Assert.assertTrue(driver.getTitle().contains("Supp"));
	}
}
