import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImages {

	@Test
	public void validateImage() throws IOException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    BufferedImage expectedimage=ImageIO.read(new File("C://capture screen shots/sunny.png"));
	    
	    
	    WebElement logoImageElement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	    
		   Screenshot logoimagescrrenshot= new AShot().takeScreenshot(driver, logoImageElement);
	    
		   BufferedImage  actualimage =logoimagescrrenshot.getImage();
		   
		   
		   ImageDiffer imgdiff=new ImageDiffer();
		   
		   
		   ImageDiff diff=imgdiff.makeDiff(expectedimage, actualimage);
		   if(diff.hasDiff()==true) {
			   System.out.println("images are not same ");
		   }else {
			   System.out.println("image are same");
			   
		   }
		   
		   driver.quit();
	    
	    
	    
	    
	}
}
