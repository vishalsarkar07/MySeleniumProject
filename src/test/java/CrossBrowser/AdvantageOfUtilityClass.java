package CrossBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdvantageOfUtilityClass extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	preCondition("chrome");
	dwsLogin();
	

	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	
	List<WebElement>add=driver.findElements(By.cssSelector("input[value='Add to cart']"));
	
	for (WebElement web :add) {
		web.click();
	
	}
	Thread.sleep(2000);
	postConditionClose();
	//postConditionQuite();
}
}
