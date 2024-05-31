package NewTrainer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUsingWEbElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
			
		WebElement dws_icon=driver.findElement(By.xpath("//div[@class='header-logo']"));
		if (dws_icon.isDisplayed()) {
			System.out.println("you are in demowebshop:");
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
		}
		else {
			System.out.println("you are not in demowebshop check the url:");
		}
	}
	
}
