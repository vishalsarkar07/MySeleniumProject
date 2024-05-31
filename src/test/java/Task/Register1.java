package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("vishal");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Thete");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Shriram park, pathare wasti ,lohgaon,pune");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("vishal123@gmail.com");
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("7894561230");
		driver.findElement(By.cssSelector("input[value=\"Male\"]")).click();
		driver.findElement(By.id("checkbox1")).click();
		
		Thread.sleep(2000);
		
//		WebElement langauge = driver.findElement(By.id("msdd"));
//		Select lang=new Select(langauge);
//		Thread.sleep(2000);
//		lang.selectByVisibleText("English");
		
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select skil = new Select(skill);
		skil.selectByVisibleText("Java");
		

		WebElement cuntry = driver.findElement(By.id("country"));
		Select desh = new Select(cuntry);
		desh.selectByVisibleText("India");
		

		WebElement birthyear = driver.findElement(By.id("yearbox"));
		Select year = new Select(birthyear);
		year.selectByVisibleText("1998");
		
		WebElement birthmonth = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select month = new Select(birthmonth);
		month.selectByVisibleText("January");
		
		WebElement birthday = driver.findElement(By.id("daybox"));
		Select day = new Select(birthday);
		day.selectByVisibleText("1");
		
		driver.findElement(By.id("firstpassword")).sendKeys("Vishal@07");
		driver.findElement(By.id("secondpassword")).sendKeys("Vishal@07");
		
		driver.findElement(By.id("submitbtn")).click();
		

		
		

		
		
		
		
		
	}
}
