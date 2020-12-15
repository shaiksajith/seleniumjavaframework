package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCommands {
@Test
public void validateCommands() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.nopcommerce.com/");
     System.out.println(driver.getTitle());
     
     
     driver.navigate().to("https://www.facebook.com/");
     System.out.println(driver.getTitle());
     
     driver.navigate().back();
     System.out.println(driver.getTitle());//it returns title of page
     //get.currenturl();return current url of that page
     driver.navigate().forward();
     System.out.println(driver.getTitle());
     
     driver.navigate().refresh();
     
     
     driver.manage().window().maximize();
     driver.close();

}
}
