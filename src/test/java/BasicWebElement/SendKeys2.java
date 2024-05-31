package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys2 {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://tirabeauty.com/");
		
		WebElement searchtf=driver.findElement(By.id("search"));
		
		searchtf.sendKeys("perfumes");
		
		searchtf.sendKeys(Keys.BACK_SPACE);
		
		
		
		
		
		
		
		
		
	}
}
