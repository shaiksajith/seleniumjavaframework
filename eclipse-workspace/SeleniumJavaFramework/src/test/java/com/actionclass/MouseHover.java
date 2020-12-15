package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
   @Test
	public void validateMouse() {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	    driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("admin");
	  
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  Actions act=new Actions(driver);
	  
	  WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	  WebElement userman=driver.findElement(By.xpath(" //*[@id=\"menu_admin_UserManagement\"]"));
	  WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	  
	  act.moveToElement(admin).build().perform();//hover to admin tab
	  
	  act.moveToElement(userman).build().perform();//hover to admin
	  
	  act.moveToElement(user).click().build().perform();
	  
	  
	  
	  
	  
	  
	  
	  
	    
	    
	}
	
	
	
	
	
	
	
}
