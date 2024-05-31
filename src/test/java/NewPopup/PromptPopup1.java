package NewPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup1 {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();

	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	Thread.sleep(2000);
	alert.sendKeys("Shrawani Wagh");
	Thread.sleep(2000);
	alert.accept();
}
}
