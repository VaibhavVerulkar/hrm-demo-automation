package com.FireFoxpacakage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class FireFox_Search_Website_URL {
	public static void main(String[] args) throws InterruptedException {

		// Creating a driver object referencing WebDriver interface
		WebDriver driver;

		// Setting webdriver.gecko.driver property
		System.setProperty("webdriver.gecko.driver", "C:\\AutoBatch18\\Driver\\geckodriver.exe");
		
		// Instantiating driver object and launching browser
		driver = new FirefoxDriver();

		// Using get() method to open a webpage
		driver.get("http://www.google.com");
		//Initializing webelement searchBox
		WebElement searchBox = driver.findElement(By.name("q"));
		//Writing a text "Software Testing jobs in pune" in the search box
		searchBox.sendKeys("Demo Orange HRM");
		searchBox.sendKeys(Keys.ENTER);
		searchBox.sendKeys(Keys.RETURN);
		Thread.sleep(3000L);
		driver.findElement(By.linkText("OrangeHRM Demo.")).click();
		driver.close();
	}
}
