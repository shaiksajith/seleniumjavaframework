package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	
	
	@Test
public void validateSlider() {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    driver.get("https://jqueryui.com/slider/");
    driver.manage().window().maximize();
    
    driver.switchTo().frame(0);
    
   WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
   
   Actions act=new Actions(driver);
   act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();//drag the slider based on the value
    
    
    
    
    
    
    
    
    
}
}