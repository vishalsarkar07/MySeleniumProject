package BasicJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //Upcasting
		
		//driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		
		//Step1:Downcast javascriptexecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//step2: call the executescript(String script,object)
		jse.executeScript("window.scrollBy(0,6000)");         //vertical top to bottom
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,-1000)");        //vertical bottom to tap
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(4000,0)");         //horizontal left to right
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-4000,0)");        //horizontal right to left
		
		
		
		
	}
}
