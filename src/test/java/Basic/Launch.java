package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch {

	public static void main(String[] args) {
	

		//how to launch a Empty Crome Browser
		//Chrome Browser
		//Create a Object of CromeDriver class
		
	    ChromeDriver driver=new ChromeDriver();
		
//   	To Launch the Application Call the non static method called get  method
	
	     driver.get("http://www.facebook.com/");
		
	     //Enter Email address to emailtf
	     driver.findElement(By.id("email")).sendKeys("vishalthete50@gmail.com");
	     
	     //Enter password to passwordtf
	     driver.findElement(By.id("pass")).sendKeys("Vishalsarkar@007");
	     
	     //
		
		
	}

}








