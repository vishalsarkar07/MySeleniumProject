package NewScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("file:///C:/Users/Vishal/AppData/Local/Microsoft/Windows/INetCache/IE/SD49DEP2/iframe-1[1].html");
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("small-searchterms")).sendKeys("Selenium007");
		 driver.findElement(By.xpath("input[value='Search']")).click();
		 driver.switchTo().parentFrame();
		 driver.findElement(By.xpath("//a[text()='Google']")).click();
		 
		 
	}
	
}
