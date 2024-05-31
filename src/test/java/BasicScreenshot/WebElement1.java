package BasicScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws IOException {
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.ajio.com/");
		 
		 //step1: Identify the webElement in the webpage-----searchtf
		 WebElement searchtf=driver.findElement(By.name("searchVal"));

		//step 2:call the getscreenshotAs() method & store the screenshot in file
		 File tempfile=searchtf.getScreenshotAs(OutputType.FILE);
	
		//step3: Create abject of File class
		 File destinationfile=new File("./images/Ajio1.png");
		 
		//step4: call the copyfile() method from Fileutils class
		 FileUtils.copyFile(tempfile, destinationfile);
		 
		 
		 //step5: refresh the project
			

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
