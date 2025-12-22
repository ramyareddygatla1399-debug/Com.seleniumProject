package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_10_Alerts_10 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//Normal Alert
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert a1 = driver.switchTo().alert();
		String text = a1.getText();
		System.out.println(text);
		a1.accept();*/
		
		//Confirmation alert
		
		/* WebElement ele= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		 ele.click();
		 Thread.sleep(5000);
		 Alert a2 =  driver.switchTo().alert();
		 a2.dismiss();
		 //a2.accept();*/
		
		//prompt alert
		
	 WebElement ele2= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		 ele2.click();
		 
	  Alert a3  = 	 driver.switchTo().alert();
	  a3.sendKeys("test..");
	  
	  System.out.println(a3.getText());
	  a3.accept();
	  
	  String exp = "You entered: test..";
	  
	  WebElement ele=  driver.findElement(By.xpath("//p[@id='result']"));
	 String act_text =  ele.getText();
	  
	  if(exp.equals(act_text))
	  {
		 System.out.println("alert handled successfully.."); 
	  }
		
		
       
	}

}
