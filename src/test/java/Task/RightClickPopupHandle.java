package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickPopupHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement right_click=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(right_click).build().perform();
		act.contextClick().build().perform();
		List<WebElement> Click_Elemenet=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		for (WebElement web : Click_Elemenet) {
			act.contextClick(web).build().perform();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			act.moveToElement(right_click).build().perform();
			Thread.sleep(2000);
			act.contextClick().build().perform();
			

			
			}
	}

}