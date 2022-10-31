package com.FireFoxpacakage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {
		// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\AutoBatch18\\Driver\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
	//driver.findElement(By.name("username")).sendKeys("Admin");
	System.out.println("click on Alert Box");
	driver.findElement(By.name("alertbox")).click();
	Thread.sleep(3000);
	Alert a =  driver.switchTo().alert();
	// To Retrive Data from alert
	System.out.println(a.getText());
	System.out.println("Ok button Clicked");
	// To click on Ok Button
	a.accept();  
	
	System.out.println("click on confirm box");
	driver.findElement(By.name("confirmalertbox")).click();
	Thread.sleep(3000);
	System.out.println(a.getText());
	
	// To click on Cancel Button
	a.dismiss();
	System.out.println("cancel button clicked");
	/*
	 * Thread.sleep(3000);
	 * driver.findElement(By.name("username")).sendKeys("Admin");
	 * driver.findElement(By.name("password")).sendKeys("admin123"); WebElement
	 * submit = driver.findElement(By.xpath("//button[@type='submit']"));
	 * submit.click();
	 */
		
	
				
					
	}
 
}
