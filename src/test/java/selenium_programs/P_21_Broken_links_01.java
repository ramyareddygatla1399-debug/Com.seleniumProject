package selenium_programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_21_Broken_links_01 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//1) Capture all the links from application
		
		 List<WebElement> links= driver.findElements(By.tagName("a"));
		      System.out.println(links.size());
		     
		      int noOfbrokenLinks = 0;
		     for(WebElement linkelement:links)
		     {
		    	String hrefattriutevalue = linkelement.getAttribute("href"); 
		    	if(hrefattriutevalue ==null || hrefattriutevalue.isEmpty())
		    	{
		    		System.out.println("href value is null or empty. so not possible to check...");
		    		continue;
		    	}
		    	
		     
		    	//hit url to the server
		    	
		    	try 
		    	{
		    		//convert  attribute value into url
		    	URL linkURL = new URL(hrefattriutevalue);  
		    	
		    	//open connection or url
		       HttpURLConnection conn	= (HttpURLConnection)  linkURL.openConnection();
		       conn.connect();
		       if(conn.getResponseCode()>=400)
		       {
		    	System.out.println(hrefattriutevalue+"=====>Broken link...");
		    	noOfbrokenLinks++;
		       }
		       else
		        {
		    	System.out.println(hrefattriutevalue+"=======>Not a broken link....");
		        }
		    	}
		      catch(Exception e)
		      {
		    
		      }
		     
		     
		     }
		     System.out.println("Number of broken links : "+noOfbrokenLinks);
		
	}

}
