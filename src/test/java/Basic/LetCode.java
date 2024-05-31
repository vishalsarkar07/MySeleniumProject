package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LetCode {
	public static void main(String[] args) {
		
 
		ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.letCode.in/");
		 
		 driver.findElement(By.linkText("Sign up")).click();
		 
	     driver.findElement(By.id("name")).sendKeys("Vishal Sanjay Thete");
	     
	     driver.findElement(By.id("email")).sendKeys("vishalthete500@gmail.com");
	     
	     driver.findElement(By.id("pass")).sendKeys("abc123");
	     
	     driver.findElement(By.cssSelector("input[id='agree']")).click();

	     driver.findElement(By.cssSelector("button[class='button is-primary']")).click();


	     
	     
	     
	     
	     

		 
		
		
	}
	
	
}
