package BasicPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4gettext {

	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();

		driver.get("https://licindia.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Login '")).click();
		System.out.println(driver.switchTo().alert().getText());
	}
}
