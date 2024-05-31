package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //Upcasting

		driver.manage().window().maximize();
	
		driver.get("https://jqueryui.com/slider/");
			
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a=new Actions(driver);

		WebElement f=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(f);
		
		//step3:Identify the targeted Element in the webpage
		WebElement button=driver.findElement(By.id("slider"));
						
				
			    //step4)Call the non Static method
				//a.clickAndHold();
		Thread.sleep(4000);
				a.clickAndHold(button);
				Thread.sleep(4000);
				
				a.moveToElement(button, 0, 40);
				Thread.sleep(4000);
				
				a.release(button);
				Thread.sleep(2000);
				
				//step5: call perform
				a.perform();

	}
}
