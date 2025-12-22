package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P_18_slider_01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
	/* WebElement min= 	driver.findElement(By.xpath("(//span[@tabindex='0'])[1]"));
	 
	 System.out.println("Location of min slider: "+min.getLocation());
	 
	 Actions act = new Actions(driver);
	 act.dragAndDropBy(min, 100, 250).build().perform();
	 
	 System.out.println("Location after sliding :"+min.getLocation());*/
	 
	  WebElement max= driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));
	  
	  System.out.println("Location of max slider:"+max.getLocation());
	  
	  Actions act = new Actions(driver);
	  act.dragAndDropBy(max, -100, 251).build().perform();
	  System.out.println("Location after sliding :"+max.getLocation());
		

	}

}
