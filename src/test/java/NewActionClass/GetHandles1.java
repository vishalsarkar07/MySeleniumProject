package NewActionClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetHandles1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	String parent_handle = driver.getWindowHandle();
	System.out.println("DWS page===>"+parent_handle);                             
	
	Actions act= new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	Thread.sleep(2000);
	
	 Set<String> childs = driver.getWindowHandles(); 
	 childs.remove(parent_handle);
	 System.out.println(childs);
	 
	 for (String str : childs) {

		 driver.switchTo().window(str);
	
	 driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("srakar123@gmail.com");
}
}
}