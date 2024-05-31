package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {

	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		//driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.name("searchVal")).sendKeys("perfumes");
		
		driver.findElement(By.className("ic-search")).click();
		//Step1:Downcast javascriptexecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		
		
		for(;;) {
			try {
				driver.findElement(By.cssSelector("img[alt='Product image of Dorall Collection Romantique Eau de Toilette - 100 ml']")).click();
				break;
			} 
			catch (Exception e) 
			{
				jse.executeScript("window.scrollBy(0,900)");
			}
		}
	}
}
