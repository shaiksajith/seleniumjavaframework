package com.actionclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollingwebpage {	
	
	@Test
	public void validateScroll() {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    
	    
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;//type casting the driver object into javascriptexecutor
	    js.executeScript("window.scrollBy(0,1000)", "");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
