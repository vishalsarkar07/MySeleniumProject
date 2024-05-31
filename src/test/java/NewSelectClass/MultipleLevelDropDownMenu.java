package NewSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleLevelDropDownMenu {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal/Desktop/demo-1.html");
		
		WebElement multiple_dropdown = driver.findElement(By.id("multiple_cars"));
		
		Select car=new Select(multiple_dropdown);	
	
		int i=0;
		List<WebElement> options = car.getOptions();
		
		for (WebElement web : options) {
			
			car.selectByIndex(i++);
			
			Thread.sleep(1000);
			
		}
//		for (WebElement web : options) {
//			
//			car.deselectByIndex(i--);
//			Thread.sleep(1000);
//		}
		
		car.deselectAll();	
	
	
	
	}
}
