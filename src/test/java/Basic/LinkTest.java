package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
	
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
	 
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 driver.findElement(By.partialLinkText("Forgotten password?")).click();
		 
		
	}
	

}
