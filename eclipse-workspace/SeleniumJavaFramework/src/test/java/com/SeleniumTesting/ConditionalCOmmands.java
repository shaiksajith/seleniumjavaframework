package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConditionalCOmmands {

	
	@Test
	public void validateCommands() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
	     WebElement pass=driver.findElement(By.xpath("//*[@id='pass']"));
	     
	     if(email.isDisplayed()&& email.isEnabled()) {
	    	 email.sendKeys("sunnysajith@gmail.com");
	     }
	     Thread.sleep(3000);
	     if(pass.isDisplayed()&&pass.isEnabled()) {
	    	 pass.sendKeys("hwfoihosclka");
	     }
	     driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	     
	     driver.findElement(By.xpath("//*[@id=\"u_m_n\"]/div[1]"));
	     
	     
	     
	     
	     System.out.println(driver.findElement(By.xpath("//*[@id=\"u_1_o\"]/span[1]/label")).isSelected());
	     System.out.println(driver.findElement(By.xpath("//*[@id=\"u_d_o\"]/span[2]/label")).isSelected());
	     if(driver.findElement(By.xpath("//*[@id=\"u_1_o\"]/span[1]/label")).isSelected()==false) {
	    	 driver.findElement(By.xpath("//*[@id=\"u_1_o\"]/span[1]/label")).click();
	     }
	     if(driver.findElement(By.xpath("//*[@id=\"u_d_o\"]/span[2]/label")).isSelected()==false) {
	    	 driver.findElement(By.xpath("//*[@id=\"u_d_o\"]/span[2]/label")).click();
	     }
	     
	  
	
Thread.sleep(3000);
driver.close();
	}	
}
