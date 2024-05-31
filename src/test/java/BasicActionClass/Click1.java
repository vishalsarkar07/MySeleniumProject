package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click1 {

	public static void main(String[] args) {
	


		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a= new Actions(driver);
		
		//step3:Identify the targeted Element in the webpage

		WebElement button=driver.findElement(By.xpath("//button[text()='Sign in']"));
		
		//step4 call non static method
		//a.click();
		a.click(button);
		//step5 call perform
		a.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
