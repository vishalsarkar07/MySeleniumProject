package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		List<WebElement> input = driver.findElements(By.xpath("//div[@class='form-fields']/div/input"));
		
		String  value [] = {"Shubham","Shejpure","shubhamshejpure123@gmail.com","Shubham@123","Shubham@123"};
		
		int i = 0 ;
		
		for (WebElement web : input) {
			web.sendKeys(value[i++]);
			Thread.sleep(1000);
		}
		
		driver.findElement(By.id("register-button")).click();
	}
}