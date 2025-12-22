package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P_19_JavascriptExecutor_01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		WebElement field = driver.findElement(By.xpath("//input[@name='principal']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','100000')",field );
		
		driver.findElement(By.xpath("//input[@name='interest']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='tenure']")).sendKeys("6");
		
		WebElement drop  = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
		 Select s1 = new Select(drop);
		 s1.selectByVisibleText("month(s)");
		 
		// driver.findElement(By.xpath("//a[@onclick='return getfdMatVal(this);']")).click();
		WebElement btn =  driver.findElement(By.xpath("//a[@onclick='return getfdMatVal(this);']"));
		js.executeScript("arguments[0].click()", btn);

	}

}
