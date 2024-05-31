package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed1 {

public static void main(String[] args) {
	
	
	
	WebDriver driver=new ChromeDriver();     //Upcasting
    driver.manage().window().maximize();
    
	driver.get("https://demoapp.skillrary.com/login.php?type=register");
	
	boolean a=driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
	System.out.println(a);
	
}	
	
	
	
}
