package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P_17_Mouse_Actions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	   
	    Actions Act = new Actions(driver);
	    Thread.sleep(5000);
	    
	    //Mouse hover action -moveToElement()
	/*  WebElement point =   driver.findElement(By.xpath("//button[text()='Point Me']"));
	  
	  Act.moveToElement(point).build().perform();
	  Thread.sleep(5000);  
	  
	 WebElement lap =  driver.findElement(By.xpath("//a[text()='Laptops']"));
	 Act.moveToElement(lap).build().perform();
	 Thread.sleep(2000);
	 
	// Act.moveToElement(point).moveToElement(lap).build().perform()
	 Act.moveToElement(point).moveToElement(lap).click().build().perform();
	
	 
	    List<WebElement> li	= driver.findElements(By.xpath("(//div[@class='dropdown-content'])//a")); 
	   int num = li.size();
	   System.out.println(num);
	   for(WebElement item:li)
	   {
		System.out.println( item.getText());  
	   }*/
	   
	    
	   //RightClick   -contextclick()
	   
     /*	  WebElement name  =  driver.findElement(By.xpath("//input[@id='name']"));  
	  Act.contextClick(name).build().perform();*/
	    
	    //double click     -doubleclick
	    
	 /*     WebElement field1 =driver.findElement(By.xpath("//input[@id='field1']"));
	      field1.clear();
	      field1.sendKeys("Ramya");
	      
	      WebElement field2 =  driver.findElement(By.xpath("//input[@id='field2']"));
	     
	     WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
	     Act.doubleClick(button).build().perform();
	     
	     String s2 = field2.getAttribute("value");
	     System.out.println(s2);
	     
	     String s1="Ramya";
	     
	     if(s1.equals(s2))
	     {
	    	 System.out.println("both text are same...");
	     }
	     else
	     {
	    	 System.out.println("both text are not same...");
	     }*/
	     
	     //Drag and drop 
	    
	         WebElement drag =   driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	         WebElement drop =  driver.findElement(By.xpath("//p[text()='Drop here']"));
	         Act.dragAndDrop(drag, drop).build().perform();
	     
	     
	
	}

}
