package BasicJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		//driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		
		//Step1:Downcast javascriptexecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//step2: call the executescript(String script,object)
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,4000)");
		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(0,-2000)");
		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(4000,0)");
		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(-2000,0)");
		
		
		
		
		
		
		
		
		
		
		
	}
}
