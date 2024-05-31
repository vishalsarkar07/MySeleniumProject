package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddandMove
{
	public static void main(String[] args) throws InterruptedException  
	{
		String given_data="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String current_url=driver.getCurrentUrl();

		if(given_data.equals(current_url))
		{
			System.out.println("i am in dws page");
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			List<WebElement> addToCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			
			//System.out.println(addToCart);
			
			for (WebElement webElement : addToCart) 
			{
				 webElement.click();
				 Thread.sleep(2000);
			}
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			  List<WebElement> removefromcart = driver.findElements(By.xpath("//input[@name='removefromcart']"));
			  
			  for (WebElement webElement1 : removefromcart) 
			  {
				  webElement1 .click();	
			  }
			  driver.findElement(By.name("updatecart")).click();
			  driver.close();
			
			
			
		}
	
	}
		
}