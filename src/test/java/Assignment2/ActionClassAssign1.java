package Assignment2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAssign1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		WebElement double_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.moveToElement(double_click).build().perform();
		act.doubleClick().build().perform();
		Thread.sleep(2000);
		
		try {
			double_click.click();
			System.out.println("pop up is not displayed");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("pop up is displayed");
		}
		
		driver.close();

	}

}