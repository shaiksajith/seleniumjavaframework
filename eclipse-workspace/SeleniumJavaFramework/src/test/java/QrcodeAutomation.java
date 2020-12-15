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




@Test
public class QrcodeAutomation {
	
	
	public void validateQrcode() throws IOException, NotFoundException {
	
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    String qrcodeurl=driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
		
	    URL url=new URL(qrcodeurl);
	    
	    BufferedImage bufferedimage=ImageIO.read(url);
	    LuminanceSource luminanacesource=new BufferedImageLuminanceSource(bufferedimage);
        BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminanacesource));
		
		Result result=new MultiFormatReader().decode(binarybitmap);
	    
	    System.out.println(result.getText());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
}
}