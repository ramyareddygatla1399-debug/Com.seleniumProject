package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_12 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame 1
		WebElement ele1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(ele1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//frame2
		WebElement ele2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(ele2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//frame3 
		
        WebElement ele3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(ele3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
        driver.switchTo().frame(0);
         driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]")).click();
         driver.switchTo().defaultContent();
     	Thread.sleep(5000);
         
         //frame4
         
          WebElement ele4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
          driver.switchTo().frame(ele4);
          driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("frame4");
          driver.switchTo().defaultContent();
      	   Thread.sleep(5000);
      	   
          //frame5 
          
          WebElement ele5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
          driver.switchTo().frame(ele5);
          driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("frame5"); 
          driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
          
          Thread.sleep(3000);
          
           boolean status =driver.findElement(By.xpath("(//img[@class='responsive-img'])[1]")).isDisplayed();
      	  System.out.println("logo present :"+status);

	}

}
