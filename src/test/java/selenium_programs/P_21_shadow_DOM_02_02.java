package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_21_shadow_DOM_02_02
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		//handle shadow DOM
		
		 SearchContext shadow1 =driver.findElement(By.cssSelector("book-app[apptitle=\"BOOKS\"]")).getShadowRoot();
		 Thread.sleep(2000);
		/*  SearchContext shadow2= shadow1.findElement(By.cssSelector("app-header[effects=\"waterfall\"]")).getShadowRoot();
			 Thread.sleep(2000);
	   SearchContext shadow3  =	  shadow2.findElement(By.cssSelector("app-toolbar[class=\"toolbar-bottom\"]")).getShadowRoot();
		 Thread.sleep(2000);*/
	   shadow1.findElement(By.cssSelector("#input")).sendKeys("Selenium...");
	}

}
