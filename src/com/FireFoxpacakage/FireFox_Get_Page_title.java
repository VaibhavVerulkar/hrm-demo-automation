package com.FireFoxpacakage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Get_Page_title {

	public static void main(String[] args) throws InterruptedException {

		// Creating a driver object referencing WebDriver interface
			WebDriver driver;

		// Setting webdriver.gecko.driver property
			System.setProperty("webdriver.gecko.driver", "C:\\AutoBatch18\\Driver\\geckodriver.exe");
				
		// Instantiating driver object and launching browser
			driver = new FirefoxDriver();

		//Launching sample website
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000L);
	
		// Verify Title of page 
			if (driver.getTitle().equals("OrangeHRM"))
		       {
		    	   System.out.println("Title mached");
		   	        }
		       else
		       {
		    	   System.out.println("Title not matched and expected title is="+ driver.getTitle());
		       }
			
		//To Enter Data in text
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
		
		}
}
