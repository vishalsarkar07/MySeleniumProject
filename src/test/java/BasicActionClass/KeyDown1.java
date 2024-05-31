package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown1 {
	
	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://ajio.com/");
		

		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a= new Actions(driver);
		
		
		//step3:Identify the targeted Element in the webpage
		WebElement beauty=driver.findElement(By.xpath("//span[text()='BEAUTY']"));
		
		
		//step4 call non static method
		a.keyDown(Keys.CONTROL);        //press control button
		
		a.click(beauty);                //click on beauty
		
		a.keyUp(Keys.CONTROL);          //release control button
		
		//step5 call perform
		a.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
