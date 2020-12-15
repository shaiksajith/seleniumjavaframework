package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {	
	
	@Test
public void validateLink() {


	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/test/newtours/");
    driver.manage().window().maximize();
    List<WebElement >links=driver.findElements(By.linkText("a "));//capturing links from a webpage
       System.out.println(links.size());




    }

}
