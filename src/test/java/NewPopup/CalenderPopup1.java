package NewPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopup1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("-disable-notificaions");
		
		WebDriver driver =new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onwardCal")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 hVMWpe']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'10')]")).click();
}
}