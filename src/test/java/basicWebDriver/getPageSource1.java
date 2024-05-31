package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource1 {
	
	public static void main(String[] args) {
		
		
		//to Launch empty Chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
				
		//Launch the application
		driver.get("https://www.ajio.com/");

		//to get source code of current webpage(htmlcode)
		String sourceCode=driver.getPageSource();
		
		//to print in console
		System.out.println(sourceCode);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
