package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
 
	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		
		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		Select s = new Select(sort_by);
		List<WebElement> options = s.getOptions();
		int i =0;
		for (WebElement web : options) {
			
			sort_by = driver.findElement(By.id("products-orderby"));
			s = new Select(sort_by);
			s.selectByIndex(i++);
	
				
		}
		
			Thread.sleep(2000);
			
	    WebElement per_page = driver.findElement(By.id("products-pagesize"));
	    Select s1 = new Select(per_page);
	    List<WebElement> options11 = s1.getOptions();
	    int j =0;
	    for (WebElement web1 : options11) {
	    	
	    	per_page = driver.findElement(By.id("products-pagesize"));
	    	s1 = new Select(per_page);
	    	s1.selectByIndex(j++);
	    }
	    
	    	Thread.sleep(2000);
	    
		    WebElement view_as = driver.findElement(By.id("products-viewmode"));
		    Select s2 = new Select(view_as);
		    List<WebElement> options21 = s2.getOptions();
		    int k =0;
		    for (WebElement web2 : options21) {
		    	
		    	view_as = driver.findElement(By.id("products-viewmode"));
		    	s2 = new Select(view_as);
		    	s2.selectByIndex(k++);	
	
		}
	
	
	

	}
}