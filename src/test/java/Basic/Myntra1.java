package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//create ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Launch the Application
		 driver.get("https://www.myntra.com/");
		
		 //Search the Element Watches
		 Thread.sleep(2000);
		 driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
		 
		 //click on Search Button
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		 
		 //click on the Gender Men
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		 
		 //Click on the  brand
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[contains(text(),'Titan')]")).click();
		 
		
	}

}
