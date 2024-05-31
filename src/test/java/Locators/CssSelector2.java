package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//open the browser
		String given_data="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_data= driver.getCurrentUrl();
		if (given_data.equals(current_data)) {
			System.out.println("you are in demowebshop:");
		}
		else {
			System.out.println("you are not in demowebshop check the url:");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("yash");
	
		driver.findElement(By.id("LastName")).sendKeys("birje");
		
		driver.findElement(By.id("Email")).sendKeys("yashbirje12@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("yash123");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("yash123");
	
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
