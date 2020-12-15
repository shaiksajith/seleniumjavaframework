package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchingBrowser {
          public static WebDriver driver;
	
	
	@BeforeMethod
	public void LaunchBrowser()  {
		 driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();		
		}
	
	
     @Test
	public void validateLoginFunctionality() throws InterruptedException {
		System.out.println("clicking on registartion");	
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.xpath("//label[text()='First name:']/following-sibling::input")).sendKeys("sunny");
		Thread.sleep(2000);
		
		
		List<WebElement> alloptions=driver.findElements(By.xpath("//option[text()='Day']/following-sibling::*"));
		          System.out.println(alloptions.size());
		          
		          for (WebElement webElement : alloptions) {
		        	  System.out.println(webElement.getText());
		        	  
		        	  
		        	  driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]>option:nth-child(8)")).click();
		        	  Thread.sleep(2000);
		        	  driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]/option[6]")).click();
		        	  Thread.sleep(2000);
				}
		
	}
	
	@AfterMethod
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}	
	
}
