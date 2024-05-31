package Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusOrDws {
	
	public static void main(String[] args) throws InterruptedException {
		
		String given_data="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		String current_data= driver.getCurrentUrl();
		if (given_data.equals(current_data)) {
			System.out.println("you are in demowebshop:");
			
		}
		else {
			System.out.println("you are not in demowebshop check the url:");
		}
		
		
	}

	
}
