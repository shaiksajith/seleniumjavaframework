import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;



public class FileUpload {
	@Test
public void validateFiles() throws InterruptedException, FindFailed {
	
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='imagesrc']")).click();		
		
		
		
		 String imagesFilePath="C:\\capture screen shots\\sunny\\";
		 
		
		 String inputfilepath="C:\\capture screen shots\\sunny\\";
		 
		 Screen s=new Screen();//predefined class in sikuli
		 
		 Pattern fileInputTextBox=new Pattern(imagesFilePath+"FileTextBox.PNG") ;
		 
		 Pattern openButton=new Pattern(imagesFilePath+"OpenButton.PNG");
		 
		 Thread.sleep(5000);
		
		s.wait(fileInputTextBox,20);
		s.type(fileInputTextBox,inputfilepath+"rajiya.jpg");
		s.click(openButton);
		
		
		
		
}
}
