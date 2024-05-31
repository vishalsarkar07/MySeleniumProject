package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeXpath2 {
public static void main(String[] args) throws InterruptedException {
	
	
	//open the browser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("watches");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
			
}
}
