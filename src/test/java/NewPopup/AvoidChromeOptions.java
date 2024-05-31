package NewPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class AvoidChromeOptions {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("-disable-notifications");
	WebDriver driver= new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
}
}
