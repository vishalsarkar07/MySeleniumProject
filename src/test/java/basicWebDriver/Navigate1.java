 package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	
	public static void main(String[] args) throws InterruptedException {
		
	
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
			
		Thread.sleep(2000);
		
		//navigate to back
		driver.navigate().back();	//Home page
		
		Thread.sleep(2000);
		//navigate to forword
		driver.navigate().forward();  //perfume page
		
		Thread.sleep(2000);
		//navigate to refresh
		driver.navigate().refresh();   //perfume page
	}
}
