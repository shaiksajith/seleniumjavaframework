package com.SeleniumTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



@Test
public class WIndowHandling {
	
	public void validateWindowHandling() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
    //click on youtube link
    driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[3]/a")).click();
    
         Set<String> windowsid = driver.getWindowHandles();
                        
         Iterator<String> itr = windowsid.iterator();
         
         String parentId = itr.next();
         
         String childId = itr.next();
         //switch to child window
         driver.switchTo().window(childId);
        //close te child window 
         driver.close();
         //siwth to parent apllication window
         driver.switchTo().window(parentId);
         
         driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[2]/div/div/ul/li/a")).click();
    
    
    
    
    
    
    
}
}