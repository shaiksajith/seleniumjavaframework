package com.SeleniumTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessTesting {

	
	@Test
	public static void validateHead(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeOptions options=new ChromeOptions();//this is class for headless browser
	options.setHeadless(true);//we need to set it to true//it headless tetsing so we cannot see ui
			
ChromeDriver driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://demo.nopcommerce.com/");
System.out.println(" titile ofthe page is:"+driver.getTitle());
System.out.println(" the url of the page is:"+driver.getCurrentUrl());
driver.close();
	}	
	
	

}
