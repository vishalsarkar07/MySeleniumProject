package NewSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal/Desktop/demo-1.html");
		
		WebElement targeted_element = driver.findElement(By.id("standard_cars"));
		
		Select car=new Select(targeted_element);
		Thread.sleep(2000);
		
		List<WebElement> options = car.getOptions();
		
		int i=0;
		for (WebElement web : options) {
			car.selectByIndex(i++);
			Thread.sleep(2000);
		}
		
		
		
//		car.selectByVisibleText("BMW");
//		car.selectByValue("jgr");
		
	}
}
