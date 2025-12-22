package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_16_DatePicker_01 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//using sendkeys
		 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	     driver.switchTo().frame(frame);
	    /* WebElement ele = driver.findElement(By.xpath("//input[@id='datepicker']"));
	     ele.sendKeys("03/13/1999");*/
	     
	     //using date picker
	     
	     String year = "2023";
	     String month ="March";
	     String date = "13";
	     driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	     
	     while(true)
	     {
	    	 String  Cmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actmonth
	    	 String Cyear=  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actmonth
	    	 
	    	 if(Cmonth.equals(month) && Cyear.equals(year))
	    	 {
	    		 break;
	    		 
	    	 }
	    	//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
	    	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //previous
	    	 
	     }
	     
	     //select the date 
	     
	     List<WebElement>  days= driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])//tbody//tr//td//a"));
	     
	     for( WebElement dt:days)
	     {
	    	 if(dt.getText().equals(date))
	    	 {
	    		dt.click();
	    		break;
	    	 }
	     }
	     
	}

}
