package Basic;
import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("login_Layer")).click();
	    Thread.sleep(2000);	
//		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("tejasujagtap1818@gmail.com");
		 
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("tejasujagtap1818@gmail.com");
		
	
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Tejas2416");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		
	}

}




	