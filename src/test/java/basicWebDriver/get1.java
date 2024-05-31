package basicWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class get1 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//to get height and width of the window
//		Dimension a=driver.manage().window().getSize();
//		System.out.println(a.getWidth());
//		System.out.println(a.getHeight());
		
		//to set height and width of the window
//		Dimension d=new Dimension(300,600);
//		
//		driver.manage().window().setSize(d);
		
		//to set the position of the window when launching
		
		
//		Point p=driver.manage().window().getPosition();
//		System.out.println(p);
		
		Point p= new Point(50,60);
		
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
		
		
	}

}
