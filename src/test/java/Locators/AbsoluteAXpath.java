package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteAXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		String given_data="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_data= driver.getCurrentUrl();
		if (given_data.equals(current_data)) {
			System.out.println("i am in demowebshop:");
			//driver.findElement(By.xpath("//a[text()='Register']")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a/span")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a/span")).click();
		}
		else {
			System.out.println("are check the page.....:");
		}
	}
	

}
