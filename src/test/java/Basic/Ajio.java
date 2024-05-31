package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	
	 public static void main(String[] args) throws InterruptedException {
		
 
		 ChromeDriver driver=new ChromeDriver();
		
       //	To Launch the Application Call the non static method called get  method
	
	     driver.get("https://www.ajio.com/");

         // methods for nevigate the perticuler perfumes
	     
	   //  driver.findElement(By.name("searchVal")).sendKeys("perfume");
	   
         //click on search icon
	     
//          driver.findElement(By.className("ic-search")).click();
//
//	      driver.findElement(By.cssSelector("img[alt='Product image of AJMAL Aurum Edp - 75 ml']")).click();
	     
	     
       // methods for nevigate the perticuler watch    
	     
	     driver.findElement(By.name("searchVal")).sendKeys("Watches");
	     
	     driver.findElement(By.className("ic-search")).click();
	     driver.findElement(By.cssSelector("label[class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	     
	    
	   
	    //driver.findElement(By.cssSelector("img[alt='Product image of FOSSIL Men FS5664 Analogue Watch with Leather Strap']")).click();
	     
	     
	     
       //methods for nevigate the perticuler  	     
	     
//	     driver.findElement(By.name("searchVal")).sendKeys("Wallets");
//	     
//	     driver.findElement(By.className("ic-search")).click();
//	     
//	    driver.findElement(By.cssSelector("img[alt='Product image of Puma Logo Print Core Wallet']")).click();

	 
	 }

}

