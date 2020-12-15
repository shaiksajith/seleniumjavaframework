package com.SeleniumTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSorted {
@Test
	public void testDropDown() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://testautomationpractice.blogspot.com/");
	     driver.manage().window().maximize();
	     
WebElement element=driver.findElement(By.id("animals"));
Select se=new Select(element);
List originallsit=new ArrayList();
List templist=new ArrayList();

se.getOptions();
List<WebElement>options=se.getOptions();
for (WebElement e : options) {
	originallsit.add(e.getText());
	templist.add(e.getText());
	
}
System.out.println(originallsit);
System.out.println("before the sorting the originallist:"+originallsit);
System.out.println("before the sorting the templist:"+templist);
Collections.sort(templist);
System.out.println("after the sorting the templist:"+templist);
System.out.println("after the sorting the originallist:"+originallsit);
if(originallsit==templist) {
	System.out.println("dropdown is sorted");
}else {
	System.out.println("dropdown is not sorted");
}



//driver.close();




	}

}
