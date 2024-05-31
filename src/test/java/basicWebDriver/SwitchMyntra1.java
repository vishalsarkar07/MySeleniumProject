package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMyntra1 {

	public static void main(String[] args)  {
		
		       //to launch empty ChromeBrowser
				ChromeDriver driver = new ChromeDriver();
				
				//to maximize the window
				driver.manage().window().maximize();
				
				//to launch application
			    driver.get("https://www.myntra.com/");
			    
			    //enter Watches in search TextField
			    driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
			    
			  //Click on search icon
			    driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
//			    
//			  //x-path by text
//				driver.findElement(By.xpath("//label[text()='Men']")).click();
				
				
				//click on selected watch image
			  	driver.findElement(By.cssSelector("img[alt='Timex Pairs Blue Analogue Watch - TW00PR228']")).click();
			  
			    
				//to transfer the driver control from parent window to child window
			  	//step1:How many window/tab are there
			  	Set<String> ids = driver.getWindowHandles();
			  	System.out.println(ids);
			  	
			  //step2:for-each loop when we have multiple windows/tab
			  	for (String e : ids) {
					
			  		//System.out.println(e);
			  		
//			  	String url = driver.getCurrentUrl();
//			  	System.out.println(url);
			  		
			  		String allurl = driver.switchTo().window(e).getCurrentUrl();
			  		System.out.println(allurl);
			  		
			  		String childurl = "https://www.myntra.com/watch-gift-set/timex/timex-pairs-blue-analogue-watch---tw00pr228/13436510/buy";
			  		
			  		if (allurl.contains(childurl)) {
			  			break;
					}
				}
			  	
			  //click on add to bag button
			  	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
			  	
	}
}
