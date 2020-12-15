package com.SeleniumTesting;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ajaxcontrols {
	  public static WebDriver driver;
		
		
		@BeforeMethod
		public void LaunchBrowser()  {
			 driver= new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver.get("https://in.search.yahoo.com/");
			driver.manage().window().maximize();		
			}
		
		
	     @Test
		public void validateLoginFunctionality() throws InterruptedException {
	    	 driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("hello");;
	    	List<WebElement>searchResults= driver.findElements(By.xpath("//div[@id='sbq-wrap']/div//li"));
	    	
	    	
	    	for (WebElement result : searchResults) {
	    	System.out.println(result.getText());
				
			}
	    	
	    	
					}
			
		
		
		//@AfterMethod
		/*public void closingBrowser() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();*/
		}	
		
//}
