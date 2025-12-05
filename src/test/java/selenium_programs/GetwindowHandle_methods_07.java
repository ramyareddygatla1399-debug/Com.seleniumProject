package selenium_programs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle_methods_07 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click(); 
		
		Set<String> wids = driver.getWindowHandles();
		System.out.println(wids);
		
		
		List<String> li = new ArrayList(wids);
		
		String parentid = li.get(0);
		String childid = li.get(1);
		
		//switch to child window
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		for( String win : wids)
		{
			String title = driver.switchTo().window(win).getTitle();
			if(title.equals("W3Schools Online Web Tutorials"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
