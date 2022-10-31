package com.FireFoxpacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FireFox_Open_App_login {
	public static void main(String[] args) throws InterruptedException {

		// Creating a driver object referencing WebDriver interface
		WebDriver driver;

		// Setting webdriver.gecko.driver property
		System.setProperty("webdriver.gecko.driver", "C:\\AutoBatch18\\Driver\\geckodriver.exe");

		// Instantiating driver object and launching browser
		driver = new FirefoxDriver();

		// Launching sample website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// To Enter Data in text
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);

		// Click on Login button
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		System.out.println("Login Completed");

		// Mouse over to PIP main Menu
		WebElement element = driver.findElement(By.linkText("Leave"));
		Actions action = new Actions(driver);

		// We need to use perform() method excecuting the action object
		action.moveToElement(element).perform();
		element.click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Assign Leave")).click();
		// click add employee submenu
		// action.moveToElement(element).perform();
		// driver.findElement(By.linkText("Assign Leave")).click();

		// Thread.sleep just for user to notice the event
		Thread.sleep(3000);
	}
}
