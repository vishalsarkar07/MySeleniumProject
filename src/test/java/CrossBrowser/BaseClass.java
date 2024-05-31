package CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void preCondition(String value) {
		if ("chrome".equalsIgnoreCase(value)) {
			driver=new ChromeDriver();
		}	
		else if ("firefox".equalsIgnoreCase(value)) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new EdgeDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public static void dwsLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	public static void postConditionClose() {
		System.out.println("my script is successfull...");
		driver.close();
	}
	public static void postConditionQuite() {
		System.out.println("my script is successfull...");
		driver.quit();
	}
}
