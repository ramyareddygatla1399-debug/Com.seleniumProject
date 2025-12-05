package selenium_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods_04 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		//get()
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		//getTitle()
	   String title  =	driver.getTitle();
	   System.out.println(title);
	   
	   //getCurrentUrl 
	   String curl =  driver.getCurrentUrl();
	   System.out.println(curl);
	  
	  //getPageSource    
	  String psource =  driver.getPageSource();
	  System.out.println(psource);  
		
		//getWindowHandle()
	    String wid = 	driver.getWindowHandle();
	    System.out.println(wid);
		
		//getWindowHandles()
	     WebElement ele = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]"));
	     ele.click();
	
         Set<String> whds	 = driver.getWindowHandles();
         System.out.println(whds);
		
         /* driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//conditional methods
		//isDisplayed()
		WebElement ele = driver.findElement(By.xpath("//h1[@class='title']"));
		boolean status = ele.isDisplayed();
		System.out.println("text displayed : "+status);
		Thread.sleep(5000);
		
		//isEnabled()
		WebElement ele1 = driver.findElement(By.xpath("//button[text()='START']"));
	     boolean status1 = 	ele1.isEnabled();
		System.out.println("Button enabled: "+status1);
		Thread.sleep(5000);
		
		//isSelected()
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='monday']"));
		boolean status2 =ele2.isSelected();
		System.out.println("Checkbox before select :"+status2);
		Thread.sleep(5000);
		ele2.click();
		 boolean st= ele2.isSelected();
		System.out.println("Checkbox after select :"+st);  */ 
		
		//browser methods 
		
		driver.close(); //close current single browser 
		
		//driver.quit(); //close multiple browser windows   
		
	}

}
