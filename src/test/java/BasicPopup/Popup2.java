package BasicPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {


	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();

		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Dialog")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
	
		driver.switchTo().alert().dismiss();
	
}
}
