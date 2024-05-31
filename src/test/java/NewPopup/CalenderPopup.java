package NewPopup;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.agoda.com/");
	
	driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-30']")).click();
	Thread.sleep(1000);

	for (;;) {
	try {
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-10-02']")).click();
		break;
	} catch (Exception e) {
	
		driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
	}
}
}
}
