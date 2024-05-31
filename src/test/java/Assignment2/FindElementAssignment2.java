package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAssignment2 {
	
public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");

		List<WebElement> links = driver.findElements(By.xpath("//div[@class='listbox']/ul/li/a"));
		
		for (WebElement web : links) {
		
			web.click();
			driver.navigate().back();
					
			Thread.sleep(2000);
		}
		
		

}
}