import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Readproperties {
public static WebDriver driver;


	public static void main(String[] args) throws IOException {
		 WebDriver driver = null;
		//how to read properteis
		
		Properties prop=new Properties();//is it predefines class in jV.utill pacakge
		
		FileInputStream ip=new FileInputStream("C:/Users/Sunny/eclipse-workspace/SeleniumJavaFramework/config.properties");
		
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("browser")); 
		
	      
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Sunny/eclipse-workspace/SeleniumJavaFramework/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browsername.equals("ff")) {
			driver=new FirefoxDriver();
		}else if(browsername.equals("ff")) {
			driver=new SafariDriver();
		}else
			System.out.println("no browser value is given");		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("")).sendKeys(prop.getProperty("username"));//we are reading this form properties file
		
		driver.findElement(By.xpath("")).sendKeys(prop.getProperty("password"));
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
   
}
