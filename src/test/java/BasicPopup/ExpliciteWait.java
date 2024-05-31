package BasicPopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();     //Upcasting
		
		//driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		
	
		
		/*if (actualurl.equals(expectedurl)) {
			System.out.println("url is matched");
		}
		else {
			System.out.println("url is not matched");
			
		}
		System.out.println("Good Morning");*/
		
		//step1
	
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(2));
		
		//step2: call until method
	    //step3:pass predicate function(cndition method)as an argument to until()
		w.until(ExpectedConditions.urlToBe("https://www.ajio.com/pune"));
		System.out.println("Good Morning");
	
		
		
		
		
		
		
		

	
	}
}
