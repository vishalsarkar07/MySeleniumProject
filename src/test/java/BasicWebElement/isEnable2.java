package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Upcasting
				
				driver.manage().window().maximize();
			
				driver.get("https://demoapp.skillrary.com/");
				boolean a= driver.findElement(By.cssSelector("input[class='form-control']")).isEnabled();
				System.out.println(a);
			}
			
		}

