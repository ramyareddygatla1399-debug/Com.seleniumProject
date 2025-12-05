package selenium_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_specific_browser_window_08 
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
		
		for(String win:wids)
		{
			String title = driver.switchTo().window(win).getTitle();
			System.out.println(title);
			if(title.equals("W3Schools Online Web Tutorials") || title.equals("W3Schools Tryit Editor"))
			{
				driver.close();
			}
		}
		
	}

}
