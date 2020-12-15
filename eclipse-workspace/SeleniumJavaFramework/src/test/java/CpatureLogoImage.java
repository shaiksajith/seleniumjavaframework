import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CpatureLogoImage {

	
	@Test
	public void validateLogo() throws IOException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    WebElement logoImageElement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	    
	   Screenshot logoimagescrrenshot= new AShot().takeScreenshot(driver, logoImageElement);
	   
	  ImageIO.write(logoimagescrrenshot.getImage(),"png",new File("C://capture screen shots/sunny.png"));
	   
		
	  File f=new File("C://capture screen shots/sunny.png");
	  if(f.exists()){
		  System.out.println("image captured");
	  }else {
		  System.out.println("image file exists");
	  }
	  
	  
	  
	  
	  
	  
	}
}
