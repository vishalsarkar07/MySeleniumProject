package BasicSelectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	 public static void main(String[] args) {
		
		 

		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		 
		 driver.get("https://www.facebook.com/signup");
		
		 //step1: Identify the targeted element
		 WebElement month=driver.findElement(By.id("month"));
//		 WebElement day=driver.findElement(By.id("day"));
//		 WebElement year=driver.findElement(By.id("year"));
		
		 //step2: Create abject of File class
		 //step3:in select  constructor pass targeted dropdown
		 Select s= new Select(month);
//		 Select s1= new Select(day);
//		 Select s2= new Select(year);
	
		 //step4: call non  static method
		// s.selectByVisibleText("Jan");
//		 s1.selectByVisibleText("1");
//		 s2.selectByVisibleText("1998");
		 
		 s.selectByValue("11");
//		 s.selectByIndex(6);
		 System.out.println(s.isMultiple());

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
