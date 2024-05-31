package Task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Explore more']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//section[contains(text(),'Popups')]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
	
	Set<String> child = driver.getWindowHandles();
	
	String parent = driver.getWindowHandle();
	
	child.remove(parent);
	
	for (String str : child) {
		String signurl = "https://demoapps.qspiders.com/ui/browser/SignUp";
		String login = "https://demoapps.qspiders.com/ui/browser/Login";
		Thread.sleep(2000);
		driver.switchTo().window(str);
		if (signurl.equals(driver.getCurrentUrl())) {
			driver.close();
			
		}
		else if (login.equals(driver.getCurrentUrl())) {
			driver.close();
			Thread.sleep(2000);	
			
		}
		
	}
	driver.findElement(By.id("email")).sendKeys("vishal@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("vishal");
	Thread.sleep(2000);
	driver.findElement(By.id("confirm-password")).sendKeys("vishal");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
	
}
