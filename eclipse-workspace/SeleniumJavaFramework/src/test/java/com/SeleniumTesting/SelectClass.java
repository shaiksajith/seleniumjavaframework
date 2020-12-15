package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClass {
	  public static WebDriver driver;
		
		
		@BeforeMethod
		public void LaunchBrowser()  {
			 driver= new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny\\eclipse-workspace\\sunnypractieprogramms\\drivers\\chromedriver.exe");
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();		
			}
		
		
	     @Test
		public void validateLoginFunctionality() throws InterruptedException {
			System.out.println("clicking on registartion");	
			driver.findElement( By.xpath("//a[normalize-space(text())='Register'])[1]")).click();
			
			WebElement dateofbirth=driver.findElement(By.cssSelector("select[name='DateOfBirthDay']"));
			
			Select dob=new Select(dateofbirth);//this selct class only applicable when html tag as selct
			
			dob.selectByIndex(5);
			 Thread.sleep(2000);
			dob.selectByValue("6");
			 Thread.sleep(2000);
			dob.selectByVisibleText("19");
			
			        	 
					}
			
		
		
		@AfterMethod
		public void closingBrowser() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}	
		
	}


