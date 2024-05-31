package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari1 {

	
	public static void main(String[] args) {
		
		//create ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				
				//Launch the Application
				 driver.get("https://www.naukri.com/");
				
			//	 driver.findElement(By.xpath("//input[contains(@placeholder,'Enter skills / designations / companies')]")).sendKeys("JAVA");
	
	
				 driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("JAVA");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
