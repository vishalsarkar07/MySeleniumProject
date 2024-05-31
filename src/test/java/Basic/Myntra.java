package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
	
		 driver.get("https://www.myntra.com/");
		 
		
		 driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("Watches");
		
		 driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();	
	
		 driver.findElement(By.cssSelector("label[class='common-customRadio gender-label']")).click();
		 
		// driver.findElement(By.cssSelector("div[class='common-checkboxIndicator']")).click();
		 
		
		 driver.findElement(By.cssSelector("span[class='myntraweb-sprite filter-search-iconSearch sprites-search']")).click();	
		 
		 driver.findElement(By.cssSelector("input[class='filter-search-inputBox']")).sendKeys("Titan");
		 
	
		 
		driver.findElement(By.cssSelector("label[class='vertical-filters-label common-customCheckbox']")).click();
		 


	}

}
