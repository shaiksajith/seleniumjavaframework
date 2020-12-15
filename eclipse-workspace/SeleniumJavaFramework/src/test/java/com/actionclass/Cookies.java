package com.actionclass;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	
		@Test
public void validateCookie() {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    	    
	   Set<Cookie> cookies=driver.manage().getCookies();//capture all the cookies form browser
	    
	    System.out.println("size of cookies:"+cookies.size());//print size of cookies
	    
	   /*for (Cookie cookie : cookies) {//read and print all the cookies
	    	System.out.println(cookie.getName()+": "+cookie.getValue());
			
	   }*/
	  //System.out.println( driver.manage().getCookieNamed("session-id-time")); //prints specific cookie
	    Cookie cook=new Cookie("mycookie","1123456789");
	    driver.manage().addCookie(cook);
	    System.out.println("size of cookies:"+cookies.size());
	    
	}    
	    
}

