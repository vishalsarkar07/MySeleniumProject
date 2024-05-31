package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();     //Upcasting
		driver.manage().window().maximize();
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		WebElement input_file = driver.findElement(By.xpath("//input[@type='file']"));
		input_file.sendKeys("C:\\Users\\Vishal\\Desktop\\Mr.Vishal thete Resume.docx");
	}
}
