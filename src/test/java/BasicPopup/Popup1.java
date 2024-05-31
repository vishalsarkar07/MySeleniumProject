package BasicPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();

		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Dialog")).click();

		driver.findElement(By.id("accept")).click();
	
		driver.switchTo().alert().accept();
	
		
	
		
	
	
	
	
	
	}
}
