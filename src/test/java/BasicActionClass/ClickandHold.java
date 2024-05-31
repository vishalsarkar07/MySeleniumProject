package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {
	
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();     //Upcasting

		driver.manage().window().maximize();
	
		driver.get("https://webdriveruniversity.com/Actions/index.html");
			
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a=new Actions(driver);

		//step3:Identify the targeted Element in the webpage
		WebElement button=driver.findElement(By.id("click-box"));
						
				
			    //step4)Call the non Static method
				//a.clickAndHold();
				a.clickAndHold(button);
				a.release(button);
				
				//step5: call perform
				a.perform();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
