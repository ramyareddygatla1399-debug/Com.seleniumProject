package selenium_programs;
import java.util.List;

import org.openqa.selenium.By;
/*id
 * name
 * linktext
 * partiallinktext
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://testautomationpractice.blogspot.com/");
		//Maximize the page
		driver.manage().window().maximize();
		
		//id
        driver.findElement(By.id("name")).sendKeys("Ramya");
		
		//name
         boolean status =  driver.findElement(By.name("Header")).isDisplayed();
         System.out.println(status);
       
       //linktext
         driver.findElement(By.linkText("Udemy Courses")).click();
       
       //Partial linktext
         driver.findElement(By.partialLinkText("Online")).click();
			
		//Tagname  & classname - group of webelements
		
		List<WebElement> noOfLinks  =driver.findElements(By.tagName("a"));
	     int num  = 	noOfLinks.size();
	     System.out.println("Total number of links: "+num);     
		
		List<WebElement>  count= driver.findElements(By.className("widget-content"));
		System.out.println("Total number of header elements: "+count.size());   
		
		//css selector
		
		//tagname#id
		driver.findElement(By.cssSelector("input#name")).sendKeys("id");
		
		//tagname.classname
		driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("classname...");
		
		//tagname[attribute="Value"]
		driver.findElement(By.cssSelector("input[name='input1']")).sendKeys("attribute");
		
		//tagname.classname[attribute="Value"]
		driver.findElement(By.cssSelector("input.input-field[name='input1']")).sendKeys("class and attribute");
		
	}

}
