import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EncodingAndDecodingStrings {

	
	/*public static void main(String args[]) {//dGVzdDEyMw==
		
		String str="test123";
		
		byte[] encodedstring=Base64.encodeBase64(str.getBytes());
		System.out.println("encoded string:"+new String(encodedstring));
		
		
		
		byte[] decodedstring=Base64.decodeBase64(encodedstring);
		System.out.println("encoded string:"+new String(decodedstring));
	}*/
	
	@Test
	public void validatepassword() {	
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/login");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.linkText("Log in")).click();;
	    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sunnysajith99@gmail.com"); 
	    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodedString("dGVzdDEyMw=="));
	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();
	    	
	}
	static String decodedString(String password) {
		

		byte[] decodedstring=Base64.decodeBase64(password);
		return (new String(decodedstring));
		
	}
	
	
	
	
	
	
}
