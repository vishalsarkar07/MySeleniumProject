package BasicJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll3 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		//driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		
		//Step1:Downcast javascriptexecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//step2: call the executescript(String script,object)
		Thread.sleep(2000);
		jse.executeScript("window.ScrollTo(0,document.body.scrollHeight)");//complete scrolling from top to bottom
		Thread.sleep(2000);
		jse.executeScript("window.ScrollTo(0,-document.body.scrollHeight)");//complete scrolling from bottom to tp
		Thread.sleep(2000);
		jse.executeScript("window.ScrollTo(document.body.scrollWidth,0)");//coplete scrolling from left to right
		Thread.sleep(2000);
		jse.executeScript("window.ScrollTo(-document.body.scrollWidth,0)");//complete scrolling from right to left
	
	
	
	
	
	
	
	
	
	}
}
