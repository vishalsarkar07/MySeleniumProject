package BasicJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement1 {

	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		//driver.manage().window().maximize();

		driver.get("https://letcode.in/test");
		
		//click on edit
		driver.findElement(By.linkText("Edit")).click();
		
		//Identify disable textfield
		WebElement disabletf=driver.findElement(By.id("noEdit"));
		
		
		//Step1:Downcast javascriptexecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
				
		//step2: call the executescript(String script,object)
         jse.executeScript("arguments[0].value='pune'",disabletf);
		
		
		
		
		
		
	
		
	}
}
