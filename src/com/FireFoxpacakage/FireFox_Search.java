package com.FireFoxpacakage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
public class FireFox_Search {
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
	//To Enter Data in text
			       Thread.sleep(3000);
			       driver.findElement(By.name("username")).sendKeys("Admin");
			       driver.findElement(By.name("password")).sendKeys("admin123");
			       Thread.sleep(3000);
			       WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			       submit.click();
				
	//Mouseover on submit button
			//Mouse over to PPIM main Menu	
				WebElement element = driver.findElement(By.linkText("PIM"));
				Actions action = new Actions(driver);
				// We need to use perform() method excecuting the action object
				action.moveToElement(element).perform();
				Thread.sleep(3000L);
				//click add employee submenu
				driver.findElement(By.linkText("Add Employee")).click();
				
				//Thread.sleep just for user to notice the event
				Thread.sleep(3000);
				
				//Closing the driver instance
				//driver.quit();
		
		
	
				/*
				 * // Using get() method to open a webpage driver.get("http://www.google.com");
				 * //Initializing webelement searchBox WebElement searchBox =
				 * driver.findElement(By.name("q")); //Writing a text
				 * "Software Testing jobs in pune" in the search box
				 * searchBox.sendKeys("Demo Orange HRM");
				 */
		// Perform Mouse over action for serached keyword
		//Mouseover on submit button
		/*
		 * Actions action = new Actions(driver); WebElement btn =
		 * driver.findElement(By.id("idOfButton")); action.moveToElement(btn).perform();
		 * //Thread.sleep just for user to notice the event Thread.sleep(3000);
		 */
		// Closing the browser
		//driver.quit();	
	}
}
