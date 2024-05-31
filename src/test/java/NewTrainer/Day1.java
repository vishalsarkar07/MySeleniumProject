package NewTrainer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		String given_data="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String current_data= driver.getCurrentUrl();
		if (given_data.equals(current_data)) {
			System.out.println("you are in demowebshop:");
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
		}
		else {
			System.out.println("you are not in demowebshop check the url:");
		}
	}
}
