package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected1 {
 public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();     //Upcasting
    driver.manage().window().maximize();
    
	driver.get("https://letcode.in/radio");
	
	boolean a=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
	System.out.println(a);
	
}
}
