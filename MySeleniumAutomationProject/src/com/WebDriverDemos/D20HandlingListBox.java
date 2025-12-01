package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D20HandlingListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// WebElement lstBox = driver.findElement(By.name("multiselect1"));
		// Select cars = new Select(lstBox);
		Select cars = new Select(driver.findElement(By.id("multiselect1")));

		List<WebElement> carList = cars.getOptions();
		System.out.println("All cars in the list are");
		for (WebElement car : carList)
			System.out.println(car.getText());

		if (cars.isMultiple()) {
			// cars.selectByIndex(1);
			// cars.selectByIndex(2);
			cars.selectByContainsVisibleText("Aud");
			cars.selectByContainsVisibleText("Hyu");

			List<WebElement> selectedCars = cars.getAllSelectedOptions();
			System.out.println("\nSelected Cars are: ");
			// for(WebElement sc : selectedCars)

			// System.out.println(sc.getText());

			System.out.println(selectedCars.get(0).getText() + " and " + selectedCars.get(1).getText());
		}

		// cars.deSelectByContainsVisibleText("Hyu");
		// cars.deselectByIndex(2);
		// cars.deselectByValue("Hyundaix");
		// cars.deselectByVisibleText("Hyundai");
		cars.deselectAll();
	}

}
