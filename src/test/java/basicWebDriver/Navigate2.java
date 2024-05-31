package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {

	public static void main(String[] args) {
		
		

		//to Launch empty Chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
       //Launch the application		
		driver.navigate().to("https://www.ajio.com/s/perfumes-4405-57701");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
