package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderFormValidation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type something']")).sendKeys("shembdi");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Min 6 chars.']")).sendKeys("1 meter");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("tejus");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Re-Type Password']")).sendKeys("tejus");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Max 6 chars.']")).sendKeys("2 meter");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Text between 5 - 10 chars length']")).sendKeys("2 to 3");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter a valid e-mail']")).sendKeys("tejus@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Min value is 6']")).sendKeys("123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='URL']")).sendKeys("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Max value is 6']")).sendKeys("456");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter only digits']")).sendKeys("123456");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Max value is 6']")).sendKeys("chongya");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Number between 6 - 100']")).sendKeys("100 to 500");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys("tejus123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).sendKeys("tejus123");


		
	}
}
