package BasicActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement f=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(f);
		
		//step1:Create object of Actions class
		//step2:In Actions constructor pass webdriver reference as an argument constructor
		Actions a=new Actions(driver);
		
		//step3:Identify the targeted Element in the webpage
		WebElement box=driver.findElement(By.id("draggable"));
		
		

	    //step4)Call the non Static method
	   a.dragAndDropBy(box, 60, 70);
		
	   Thread.sleep(2000);
		
		//step5: call perform
		a.perform();
	
	
		
		
	}
}
