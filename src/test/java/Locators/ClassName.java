package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	
	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		
		//  driver.findElement(By.className("ico-login")).click();
		 
		//  driver.findElement(By.className("cart-label")).click();
		
		 
		//  driver.findElement(By.className("ico-wishlist")).click();
	}

}

