package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P_18_Keyboard_Actions_02 
{

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://text-compare.com/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	
	Thread.sleep(5000);
	
     WebElement textarea1  = 	driver.findElement(By.xpath("//textarea[@name='text1']"));
     textarea1.sendKeys("sending some data to perform keyboard actions...");
     
     Actions Act = new Actions(driver);
     Act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
     Act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
     Thread.sleep(3000);
     Act.keyDown(Keys.TAB).keyUp(Keys.TAB);
     Thread.sleep(3000);
     Act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
    
     WebElement textarea2  = 	driver.findElement(By.xpath("//textarea[@name='text2']"));
     String str =  textarea2.getText();
     System.out.println(str);
    /* String text = textarea2.getAttribute("name");
     System.out.println("Entered text is: "+text);*/

     }

}
