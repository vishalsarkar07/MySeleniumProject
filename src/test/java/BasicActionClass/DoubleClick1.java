package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
	public static void main(String[] args) {
		
		
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a=new Actions(driver);

		//step3:Identify the targeted Element in the webpage
		WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
				
		//step4)Call the non Static method
		//a.doubleClick();
		a.doubleClick(button);
		
		
		//step5: call perform
				a.perform();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}