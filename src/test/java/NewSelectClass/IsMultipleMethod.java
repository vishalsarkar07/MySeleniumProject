package NewSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vishal/Desktop/demo-1.html");

		WebElement multiple_dropdown = driver.findElement(By.id("standard_cars"));
		Select car=new Select(multiple_dropdown);

		boolean result = car.isMultiple();
		System.out.println(result);
}
}