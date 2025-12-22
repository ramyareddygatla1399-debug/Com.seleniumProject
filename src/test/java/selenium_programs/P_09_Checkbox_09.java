package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_09_Checkbox_09 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//select specific checkbox
	// driver.findElement(By.xpath("//input[@id='wednesday']")).click();
	
	//select 
	
	 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 
	int num =  checkbox.size();
	
	/*for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}*/
	
	/*for(  WebElement check:checkbox)
	{
		check.click();
	}*/
	
	//last 3 checkboxes
	
	/*for(int i=4;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}*/
	
	//first 3 checkboxes
	
	/*for(int i=0;i<3;i++)
	{
		checkbox.get(i).click();
	}*/
	
	//unselect checkboxes if they are selected 
	for(int i=0;i<3;i++)
	{
		checkbox.get(i).click();
	}
	Thread.sleep(5000);
	
	for(int i=0;i<checkbox.size();i++)
	{
		if(checkbox.get(i).isSelected())
		{
			checkbox.get(i).click();	
		}
		
	}
	}

}
