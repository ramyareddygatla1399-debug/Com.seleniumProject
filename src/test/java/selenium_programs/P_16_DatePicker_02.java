package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_16_DatePicker_02 
{

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
	
	driver.navigate().refresh();
	
	driver.findElement(By.xpath("//input[@id='datepicker2']")).click();

	}

}
