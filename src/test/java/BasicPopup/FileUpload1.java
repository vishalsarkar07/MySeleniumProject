package BasicPopup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver();     //Upcasting
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
	
		//step1: click on choose file
		driver.findElement(By.id("file_wraper0")).click();
		
		Thread.sleep(2000);
		
		//step2: AutoIT tool
		Runtime.getRuntime().exec("C:\\Users\\Vishal\\Desktop\\uploadfile.exe");
		
	}
}
