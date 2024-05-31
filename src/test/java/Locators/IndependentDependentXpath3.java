package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath3{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		
		// sibling Traversing  to downward
		WebElement price = driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../../div[3]/div/span"));
		Thread.sleep(2000);
		System.out.println(price.getText());
	}
	}
