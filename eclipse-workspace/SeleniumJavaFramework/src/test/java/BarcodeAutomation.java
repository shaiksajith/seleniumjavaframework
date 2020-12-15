import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeAutomation {

	
	@Test
	public void validateBarcode() throws IOException, NotFoundException {
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();	
		
		String barcodeurl=driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
		
		System.out.println(barcodeurl);
		
		URL url=new URL(barcodeurl);
		
		BufferedImage bufredimage=ImageIO.read(url);
		
		LuminanceSource luminanacesource=new BufferedImageLuminanceSource(bufredimage);
		
		BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminanacesource));
		
		Result result=new MultiFormatReader().decode(binarybitmap);
		
		System.out.println(result.getText());
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
