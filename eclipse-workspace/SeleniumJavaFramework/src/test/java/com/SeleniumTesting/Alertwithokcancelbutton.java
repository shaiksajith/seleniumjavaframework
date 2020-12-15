package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertwithokcancelbutton {

	@Test
public void validateOkCancel() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    
	  
	    driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	    
	    driver.switchTo().alert().accept();
	    
	    String exptext="You pressed Ok";
	  
	    
	   String acttextok=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	    
	    if(exptext.equals(acttextok)==true) {
	    	System.out.println("test is passed");
	    }
	    String exptextcancel="You Pressed Cancel";
	    driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	    driver.switchTo().alert().dismiss();
	     acttextok=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	    
	    
	    if(exptextcancel.equals(acttextok)==true) {
	    	System.out.println("test is passed");
	    }
	    
	    
	   // driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
}
