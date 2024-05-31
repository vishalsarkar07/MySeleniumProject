package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys1 {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("vishalthete50@gmail.com");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL,"v");
		
		
	}
}
