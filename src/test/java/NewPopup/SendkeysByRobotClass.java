package NewPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysByRobotClass {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);		
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_K);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_G);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	
	
	r.keyRelease(KeyEvent.VK_K);
	r.keyRelease(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_G);
	
	
	
	
}
}
