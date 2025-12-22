package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_19_Scrolling_page_02 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		//1) Scroll down page by pixel number
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	/*	jse.executeScript("window.scrollBy(0,3000)", "");
		System.out.println("page y pixel: "+jse.executeScript("return window.pageYOffset;"));*/
		
	    
		//2) Scroll down till element is visible
	/*	 WebElement ele= driver.findElement(By.xpath("//h2[text()='Footer Links']"));
		 jse.executeScript("arguments[0].scrollIntoView();",ele );
		 System.out.println(jse.executeScript("return window.pageYOffset;"));*/
		 
		 
		 //3) scroll till end 
	   jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    System.out.println(jse.executeScript("return window.pageYOffset;"));
	    
	    Thread.sleep(5000);
	    
	    
	    //4) scroll back to starting or initial  position
	    
	    jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
