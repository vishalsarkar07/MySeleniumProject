package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrect1 {
	
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Rectangle a= driver.findElement(By.xpath("//button[text()='Sign in']")).getRect();
		System.out.println(a.getWidth());
		System.out.println(a.getHeight());
		System.out.println(a.getX());
		System.out.println(a.getY());
 
		
}
}