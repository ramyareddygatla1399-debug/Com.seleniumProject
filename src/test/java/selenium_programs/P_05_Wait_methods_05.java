package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P_05_Wait_methods_05 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		//	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ram123@gmail.com");
		
		//Explicit wait 
		
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement emailtext= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
	emailtext.sendKeys("ram123@gmail.com");
	
	     //Fluent wait
		
	/*	Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);  */	
	}

}
