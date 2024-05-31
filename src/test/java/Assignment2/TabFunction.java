package Assignment2;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver);
	
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-male")).click();
		
		Thread.sleep(1000);
		
		act.keyDown(Keys.TAB).build().perform();
		

		act.sendKeys("Vishal").keyDown(Keys.ENTER).build().perform();
	
		act.sendKeys("Thete").keyDown(Keys.ENTER).build().perform();
		
		act.sendKeys("Vishalthete1@gmail.com").keyDown(Keys.ENTER).build().perform();
		
		act.sendKeys("Vishal@123").keyDown(Keys.ENTER).build().perform();
		
		act.sendKeys("Vishal@123").keyDown(Keys.ENTER).build().perform();
		
		act.keyDown(Keys.ENTER).build().perform();
				
			
	}

}