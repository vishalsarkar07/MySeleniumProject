package Assignment2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplodingOnNaukari {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		driver.findElement(By.id("name")).sendKeys("omkar");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("omkar7@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Omkar@07");
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("9874563210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/form/div[2]/div[4]/div[2]/div/div[2]/h2[1]")).click();
		Thread.sleep(2000);
	     WebElement input = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		Thread.sleep(2000);
		input.sendKeys("‪C:\\Users\\Vishal\\Desktop\\Selenium\\DAY-2-1.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send me important updates & promotions via SMS, email, and]'")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
	}

}
