package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mock2 {
	
	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
			
		   driver.manage().window().maximize();
				
		   driver.get("https://demowebshop.tricentis.com/");
		   WebElement multiple_checkbox = driver.findElement(By.xpath("//input[@type='radio']"));
			
			Select checkbox=new Select(multiple_checkbox);	
		
			int i=0;
			List<WebElement> options = checkbox.getOptions();
			
			for (WebElement web : options) {
				
				multiple_checkbox = driver.findElement(By.xpath("//input[@type='radio']"));
				checkbox.selectByIndex(i++);
				
				Thread.sleep(1000);
				System.out.println("multiple_checkbox");
				
			}
		   
//		   int i=0;
//		List<WebElement> Community_poll = driver.findElements(By.xpath("//input[@type='radio']"));
//		 
//		 for(WebElement web : Community_poll)
//		 {
//			 Community_poll = driver.findElements(By.xpath("//input[@type='radio']"));
//			web.click();
//			System.out.println("Community_poll");
//			
			 
		 }
	}

