package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SwitchBetweenAlerts {
	
	@Test
	public void validateAlerts() {
		
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Alerts.html");
    driver.manage().window().maximize();
    //alert box with ok button example
    
    //alert with ok link
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
    //alert with o button
    driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
    //switch to alret box
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();//ok button clicked and close the alert
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}