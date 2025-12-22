package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P_11_Alert_without_using_switchto_11 
{

	public static void main(String[] args) 
	{
		//Alert without using switchTo().alert()
				//using explicit wait
		
		/*WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
         WebElement ele = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
         ele.click();
         
         Alert a1 =wait.until(ExpectedConditions.alertIsPresent());
         String text = a1.getText();
         System.out.println(text);
		
         a1.accept();*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
