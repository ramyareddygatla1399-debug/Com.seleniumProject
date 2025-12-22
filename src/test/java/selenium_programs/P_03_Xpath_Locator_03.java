package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_03_Xpath_Locator_03 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// xpath with single attribute   //tagname[@attribute='value'] or //*[@attribute='value']
		 driver.findElement(By.xpath("//button[@name='start']")).click();
		 
        //Xpath with multiple attributes   //input[@attribute='value'][@attribute='value']
		 driver.findElement(By.xpath("//button[@id='alertBtn'][@onclick='myFunctionAlert()']")).click();
		
		
		//tagname[@attribute='value' and @attribute='value'] //both attributes should true
		driver.findElement(By.xpath("//input[@id='field2' and @type='text']")).sendKeys("xpath using and");
		
		//tagname[@attribute='value' or @attribute='value'] //any one attribue should true
		driver.findElement(By.xpath("//input[@id='field2' or @type='te']")).sendKeys("Ramya");
		
		//xpath with innertext  -text()  //tagname[text()='textvalue']
		
		 boolean status= driver.findElement(By.xpath("//h2[text()='Upload Files']")).isDisplayed();
		System.out.println(status);
		
		 WebElement ele= driver.findElement(By.xpath("//h2[text()='Upload Files']"));
	    String text	= ele.getText();
	    System.out.println(text);
		
		//contains() and starts-with() both are used to find dynamic elements
		//xpath with contains()  //input[contains(@attribute,'val')]
		
		 WebElement ele1 = driver.findElement(By.xpath("(//input[contains(@class,'wikipedia')])[1]"));
	     ele1.sendKeys("contains..");
		
		//xpath with start-with()  //tagname[starts-with(@attributename,'wikipedia')]
		driver.findElement(By.xpath("//input[starts-with(@id,'Wikipedia1')]")).sendKeys("Starts-with");
		
		//chained xpath  //div[@id='HTML6']/h2
		
		 boolean status1= driver.findElement(By.xpath("//div[@id='HTML6']/h2")).isDisplayed();
         System.out.println(status1);
	}

}
