package NewActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickWithPopVerify {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();     //Upcasting

	driver.manage().window().maximize();

	driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
	
	Actions act=new Actions(driver);
	
	WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
			
	act.moveToElement(button).build().perform();
	act.contextClick().build().perform();
	
	//click on edit
	Thread.sleep(2000);
	List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
	Thread.sleep(2000);
	
	for (WebElement str : options) {
		act.moveToElement(str).build().perform();
		
		Thread.sleep(2000);
		
	}
	try {
		Thread.sleep(1000);
		button.click();
		System.out.println("pop is not displayed...");
		
	} catch (Exception e) {
		System.out.println("pop is displayed...");
	}
	

	System.out.println("My scipt is successfull...");
	}
	
}