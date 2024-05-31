package NewActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MoveToElement1 {
	
	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://www.myntra.com/");
		
		Actions act=new Actions(driver);
		
		WebElement men=driver.findElement(By.xpath("//a[text()='Men']"));
		
		
		act.moveToElement(men).build().perform();
	
		driver.findElement(By.xpath("//a[@data-reactid='41']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
