package com.FireFoxpacakage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_KB_RC {
	public static void main(String arg[]) throws AWTException, InterruptedException {
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
		Thread.sleep(6000L);
		// Perform TAB & Enter uding Keyboard actions

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Pressing Tab on Login button using keyboard");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		System.out.println("Clicking Enter using Keyboard");
		System.out.println("Login Completed");
		Thread.sleep(6000);
		System.out.println("Finding a Web Element for logout ");
		WebElement element = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		element.click();
		Thread.sleep(3000L);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("clicking Logout & Completed");
		Thread.sleep(3000);
	}
}
