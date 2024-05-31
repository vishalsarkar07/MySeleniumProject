package BasicActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys2 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://ajio.com/");
		
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a= new Actions(driver);
		
		
		a.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(4000);
		
		a.sendKeys(Keys.PAGE_UP);
		
		
		a.perform();
		
		
		
	}
}
