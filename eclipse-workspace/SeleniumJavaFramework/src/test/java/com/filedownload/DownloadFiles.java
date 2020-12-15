package com.filedownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFiles {
	
@Test
public void validateFile() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    driver.get("http://demo.automationtesting.in/FileDownload.html");
    driver.manage().window().maximize();
    driver.findElement(By.id("textbox")).sendKeys("sunny");
	
    driver.findElement(By.id("createTxt")).click();//genartaes etxt file
	
   
    driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();//display download andlcilck
    
    
    Thread.sleep(5000);
    if(isFileExists("C://capture screen shots/sunny")) {
    	System.out.println("file exists"); 
    }else {
    	System.out.println("file not exist");
    }

    
}
//to check whether file is present or not in your system 
   static boolean isFileExists(String path) {
	   File f =new File(path);
	   if(f.exists()) {
		   return true;
	   }
	   else {
		 return false;  
		   
	   } 
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
