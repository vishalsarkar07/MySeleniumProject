package NewScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {
	public static void main(String[] args) throws IOException {
		
		//open the Browser
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.get("https://www.redbus.in/");
	 
	WebElement allu = driver.findElement(By.id("homeV2-root"));
	 File from = allu.getScreenshotAs(OutputType.FILE);
	File to=new File("./images/Allu.png");
	FileHandler.copy(from,to);
	 
	}

}
