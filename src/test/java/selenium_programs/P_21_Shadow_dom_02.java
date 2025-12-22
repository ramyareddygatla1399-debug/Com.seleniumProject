package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_21_Shadow_dom_02 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://dev.automationtesting.in/shadow-dom");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	
	Thread.sleep(5000);
	
	//1) This element is inside single shadow DOM
	SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
	 Thread.sleep(2000);
	  String ele = shadow.findElement(By.cssSelector("#shadow-element")).getText();
	  System.out.println("Element is: "+ele);
	  Thread.sleep(2000);
	 
	//2) This element is inside nested shadow DOM
	 SearchContext root0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
	 Thread.sleep(2000);
	 SearchContext root1 =  root0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
	 Thread.sleep(2000);
	 String ele1 = root1.findElement(By.cssSelector("#nested-shadow-element")).getText();
	 System.out.println("Nested shadow element is : "+ele1);
	 Thread.sleep(2000);
	
	//3)This element is inside   multi nested shadow DOM
	 
	SearchContext mroot1 =  driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
	 Thread.sleep(2000);
	SearchContext mroot2 = mroot1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
	 Thread.sleep(2000);
	SearchContext mroot3= mroot2.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
	 Thread.sleep(2000);
	String ele2 = mroot3.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();  
	System.out.println("Multi nested shadow element is : "+ele2);
	 Thread.sleep(2000);
	 

	}

}
