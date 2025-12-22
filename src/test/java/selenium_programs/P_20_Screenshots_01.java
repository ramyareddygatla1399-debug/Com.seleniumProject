package selenium_programs;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_20_Screenshots_01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);	
		
		//1) Full page screenshot 
		
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\Fullpage.png");
		sourcefile.renameTo(target);*/
		
		//2) Specific section screenshot
		
	/*	WebElement elem= driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		File Source = elem.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\Screenshots\\section.png");
		Source.renameTo(dest); */
		
		
		//3) Capture the screenshot of specific webElement 
		 
		   WebElement logo = driver.findElement(By.xpath("//section[@class='home-page-polls']"));
		   File source1 =logo.getScreenshotAs(OutputType.FILE);
		   File target = new File(System.getProperty("user.dir")+"\\Screenshots\\specific.png");
		   source1.renameTo(target);
				   
				 
		
		
		
		    
	}

}
