package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_21_SVG_03
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		 boolean status= driver.findElement(By.xpath("(//*[@class='oxd-icon oxd-main-menu-item--icon'])[4]")).isDisplayed();
		 System.out.println("Element is present: "+status);

	}

}
