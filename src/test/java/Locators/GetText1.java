package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	Thread.sleep(2000);
	//WebElement price = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div[1]/span"));
	
	// sibling Traversing  to downward
	WebElement price = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]"));
	Thread.sleep(2000);
	System.out.println(price.getText());
}
}
