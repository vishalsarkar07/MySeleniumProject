package BasicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Upcasting
				
				driver.manage().window().maximize();
			
				driver.get("https://demo.vtiger.com/vtigercrm/");
				boolean a= driver.findElement(By.xpath("//button[text()='Sign in']")).isEnabled();
				System.out.println(a);
			}
			
		}

