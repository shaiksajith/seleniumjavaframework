package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	@Test 
	public void validateDrop() {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();
	    
	    WebElement source=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
	    WebElement target=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
	    Actions act=new Actions(driver);
  act.clickAndHold(source).moveToElement(target).release().build().perform();	    
	    
	    
	    
	    
		
	}
	
	
}
