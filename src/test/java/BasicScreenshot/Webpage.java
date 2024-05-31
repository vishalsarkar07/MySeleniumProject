package BasicScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {

	public static void main(String[] args) throws IOException {
		
			
		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://www.ajio.com/");
		
		
		//Step 1: downcast TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//step 2:call the getscreenshotAs() method & store the screenshot in file
		File tempfile=ts.getScreenshotAs(OutputType.FILE);
		
		//step3: Create abject of File class
		File destinationfile=new File("./images/Ajio.png");
		
		//step4: call the copyfile() method from Fileutils class
	
		FileUtils.copyFile(tempfile, destinationfile);
		
		//step5: refresh the project
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
