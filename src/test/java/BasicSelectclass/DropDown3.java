package BasicSelectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {

	public static void main(String[] args) {
	
		
		ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		 
		 driver.get("https://www.letCode.in/test");
		
		 driver.findElement(By.linkText("Drop-Down")).click();
		 
		 //step1: Identify the targeted element
		WebElement single= driver.findElement(By.id("superheros"));
		 
		 //step2: Create abject of File class
		 //step3:in select  constructor pass targeted dropdown
		 Select s=new Select(single);
		 
		 //step4: call non  static method
		 List<WebElement> all = s.getOptions();
		 
			for (WebElement e : all) {
				System.out.println(e.getText());
			}	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
