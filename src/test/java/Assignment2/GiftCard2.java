package Assignment2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GiftCard2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.cssSelector("img[alt='Picture of $5 Virtual Gift Card']")).click();
		
		 String[] value= {"virat","virat@gmail.com","Rohit","Rohit@gmail.com"};
			

		 WebElement web =driver.findElement(By.xpath("//div[@class='giftcard']/div[1]/input"));
		
	
		 for (String WebElement : value) {
			 
			
		}
	}
	
}

