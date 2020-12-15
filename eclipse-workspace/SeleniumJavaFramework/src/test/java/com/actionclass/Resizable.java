package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizable {

	
	
	@Test
	public void validateSize() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/resizable/");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame(0);
		WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize, 200,140).build().perform();
		Thread.sleep(4000);
		
		
		
		
		
		
}
}