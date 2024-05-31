package BasicScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {

	public static void main(String[] args) throws IOException {
		
		
 
		ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.myntra.com/");
		 
		 driver.findElement(By.className("desktop-searchBar")).sendKeys("perfumes");
		 
		 driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		 
		 //step1: Identify the webElement in the webpage-----perfumes
		 WebElement perfumes=driver.findElement(By.cssSelector("img[alt='Betty Barclay Women Transparent Perfume and Body Mist']"));
		 
		//step 2:call the getscreenshotAs() method & store the screenshot in file
		 File tempfile=perfumes.getScreenshotAs(OutputType.FILE);
	
		//step3: Create abject of File class
		 File destinationfile=new File("./images/perfumes.png");
		 
		//step4: call the copyfile() method from Fileutils class
		 FileUtils.copyFile(tempfile, destinationfile);
		 
		 
		 //step5: refresh the project
			
		


	}

}
