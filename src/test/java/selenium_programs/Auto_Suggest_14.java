package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggest_14 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		
       List<WebElement>	 sugg = driver.findElements(By.xpath("(//ul[@class='G43f7e'])//li"));
       
      int num =  sugg.size();
      System.out.println(num);
      
      for(int i=0;i<sugg.size();i++)
      {
    	 String names = sugg.get(i).getText();
    	 
    	 System.out.println(names);
      }


	}

}
