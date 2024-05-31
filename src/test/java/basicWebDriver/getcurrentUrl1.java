package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentUrl1 {

	public static void main(String[] args) {
		
		//to Launch empty Chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
				
		//Launch the application
		driver.get("https://www.ajio.com/");

		//Enter perfumes in search textfield
		driver .findElement(By.name("searchVal")).sendKeys("perfumes");
		 
		//click on search icon
		driver.findElement(By.className("ic-search")).click();
		
		//To capture the url of current webpage
	    String url=	driver.getCurrentUrl();
		//print in console
	    System.out.println(url);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
