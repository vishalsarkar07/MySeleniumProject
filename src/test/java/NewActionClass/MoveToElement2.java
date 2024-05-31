package NewActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement2 {

public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		

		List<WebElement> links = driver.findElements(By.xpath("//div[@data-reactid='18']/div/div/a"));
		
		for (WebElement web : links) {
			
			act.moveToElement(web).build().perform();
					
			Thread.sleep(2000);
			
		
		}
		
		
}
}
