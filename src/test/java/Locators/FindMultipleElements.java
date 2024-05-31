package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> comunity_poll=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (WebElement web : comunity_poll) {
		
			web.click();
			Thread.sleep(2000);
			
		}
	}
}
