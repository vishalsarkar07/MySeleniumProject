package BasicPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3 {
	
	
public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();

		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Dialog")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("vishal");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

}
}