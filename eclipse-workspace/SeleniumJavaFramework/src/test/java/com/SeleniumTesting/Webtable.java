package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Webtable {
	 public static WebDriver driver;
		
		
		@BeforeMethod
		public void LaunchBrowser()  {
			 driver= new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
			driver.manage().window().maximize();		
			}
		
		
	     @Test
		public void validateLoginFunctionality() throws InterruptedException {
			String rowpath="//th[text()='Company']/ancestor::table/tbody/tr";
			List<WebElement> rows=driver.findElements(By.xpath(rowpath));
			
			for(int r=1;r<rows.size();r++) {
				String colxpath=rowpath+"["+r+"]/td";
				
				List<WebElement> cols=driver.findElements(By.xpath(colxpath));
				
				for(int c=1;c<cols.size();c++) {
					
					String col=colxpath+"["+c+"]";
					
					
					System.out.println(driver.findElement(By.xpath(col)).getText());
				}
				
			}	
			
			
					}
			

		
		@AfterMethod
		public void closingBrowser() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}	
		
}
