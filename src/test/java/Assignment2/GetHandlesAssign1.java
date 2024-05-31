package Assignment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetHandlesAssign1 {

	public static void main(String[] args)throws InterruptedException {
		String givenDWS_url ="https://demowebshop.tricentis.com/";
		String givenFacebook_url="https://www.facebook.com/nopCommerce";
		 WebDriver driver=new ChromeDriver();
			
		   driver.manage().window().maximize();
			
		   driver.get("https://demowebshop.tricentis.com/");
		   
		   String parent_handle=driver.getWindowHandle();
		   
		   Actions act=new Actions(driver);
		   
		   act.keyDown(Keys.PAGE_DOWN).build().perform();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		   
		   Set<String> child = driver.getWindowHandles();
		   
		   for (String str : child) {
			   
			   driver.switchTo().window(str);
			   String current_data = driver.getCurrentUrl();
			   
			   Thread.sleep(2000);
			   
			if (givenDWS_url.equals(current_data)) {
			
				driver.findElement(By.id("small-searchterms")).sendKeys("Vishal");
			}
			
			else if (givenFacebook_url.equals(current_data)) {
				Thread.sleep(2000);
				 driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Adityalondhe@gmail.comm");
				   driver.findElement(By.xpath("(//input[@name='pass'])[2]")).sendKeys("aditya@@123");
				
			}
			
			else {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
			}
			Thread.sleep(2000);
		}   
	}
}