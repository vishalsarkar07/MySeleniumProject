package BasicSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait2 {
public static void main(String[] args) {
	

	WebDriver driver= new ChromeDriver();	
	
	driver.manage().window().maximize();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	driver.get("https://omayo.blogspot.com/");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
	
	driver.findElement(By.id("timerButton")).click();
	driver.switchTo().alert().accept();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Dropdown']")));
	
	driver.findElement(By.xpath("//button[text()='Dropdown']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));
	driver.findElement(By.xpath("//a[text()='Flipkart']"));
	
	
	
}
}
