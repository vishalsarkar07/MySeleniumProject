package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle1 {

	public static void main(String[] args) {
		
		
		//to Launch empty Chrome browser
		ChromeDriver driver=new ChromeDriver();
				
		//to maximize the window
		driver.manage().window().maximize();
						
		//Launch the application
		driver.get("https://www.ajio.com/");

		//Enter perfumes in search textfield
		driver .findElement(By.name("searchVal")).sendKeys("Watches");
		 
		//click on search icon
		driver.findElement(By.className("ic-search")).click();
		
		driver.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCP41SM']")).click();
		
	
		
		//To capture the id of current window
		Set<String> id=driver.getWindowHandles();
		
		//print the id of current window in console
		System.out.println(id);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
