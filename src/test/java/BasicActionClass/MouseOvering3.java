package BasicActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOvering3 {

	
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://ajio.com/");
		
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a= new Actions(driver);
		
		
		a.moveByOffset(500, 50).contextClick();
		
		
		a.perform();
		
		
		
		
		
			
	}
}
