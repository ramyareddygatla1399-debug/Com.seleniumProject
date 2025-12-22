package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_19_ZOOM_03 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.body.style.zoom='50%'");
		
		Thread.sleep(5000);
		
		jse.executeScript("document.body.style.zoom='80%'");

	}

}
