package BasicSelectclass;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		 
		 driver.get("https://www.letCode.in/test");
		
		 driver.findElement(By.linkText("Drop-Down")).click();
		 
		 //step1: Identify the targeted element
		 WebElement multi=driver.findElement(By.id("superheros"));
		 
	 //step2: Create abject of File class
		 //step3:in select  constructor pass targeted dropdown
		 Select s= new Select(multi);
		 
		 
		 //step4: call non  static method
		 System.out.println(s.isMultiple());
		
		// s.selectByIndex(0);
		 //s.selectByValue("aq");
	     s.selectByVisibleText("The Avengers");
		 s.selectByVisibleText("Ant-Man");
		 s.selectByVisibleText("Black Panther");
		 s.selectByVisibleText("Batman");
		 s.selectByVisibleText("Aquaman");
		 
		 Thread.sleep(2000);
		 
		 //for deselect
		//s.deselectByIndex(0);
		// s.deselectByValue("am");
		// s.deselectByVisibleText("Ant-Man");
		// s.deselectAll();		
		//System.out.println(s.getFirstSelectedOption().getText());
		List<WebElement> all = s.getAllSelectedOptions();
		
		for (WebElement e : all) {
			System.out.println(e.getText());
		}
		
		
	}
}


