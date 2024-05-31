package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		List<WebElement>add=driver.findElements(By.cssSelector("input[value='Add to cart']"));
		
		for (WebElement web :add) {
			web.click();
			
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		WebElement s1 = driver.findElement(By.xpath("//a[contains(text(),'Shopping cart')]"));
		Thread.sleep(1000);
		s1.click();
		List<WebElement>remove=driver.findElements(By.cssSelector("input[name='removefromcart']"));
		
		for (WebElement web1 :remove) {
			web1.click();
			
			Thread.sleep(1000);

			}
		driver.findElement(By.cssSelector("input[name='updatecart']")).click();
	}
		
}
		
	
