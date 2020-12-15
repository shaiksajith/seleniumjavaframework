package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableBhanu {
	
	
	@Test
	public void validateWebtable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://money.rediff.com/gainers");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	    int  rownumber=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
	    System.out.println("the row are:"+rownumber);
	    
	    int  colnumber=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();
	    System.out.println("the cols are:"+colnumber);
	    
	     
//for particlar row data
	  // String rowdata = driver.findElement(By.xpath("//a[contains(text(),  '	Rishabh Digha St')]/parent::*/following-sibling::td[3]")).getText();
	     
	     //System.out.println("the row data of:"+rowdata);
}
}