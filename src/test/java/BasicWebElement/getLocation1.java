package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Upcasting
				
				driver.manage().window().maximize();
			
				driver.get("https://demo.vtiger.com/vtigercrm/");
				Point a= driver.findElement(By.xpath("//button[text()='Sign in']")).getLocation();
				System.out.println(a);
			}
			
}
