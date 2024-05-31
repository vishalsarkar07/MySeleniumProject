package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys1 {
	
	
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://ajio.com/");
		
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a= new Actions(driver);
		
		//step3:Identify the targeted Element in the webpage

	   WebElement searchtf=driver.findElement(By.name("searchVal"));
	
	 //step4 call non static method
		a.sendKeys(searchtf, "watches");
	   
	   //step5 call perform
	 	a.perform();
		
		
		
		
	}
}
