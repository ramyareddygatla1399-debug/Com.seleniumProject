package selenium_programs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods_06 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/"); //Accepts URL only in String format
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		/*URL myurl = new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myurl);*/
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().forward();
		
	     String url2 =	driver.getCurrentUrl();
         System.out.println(url2);
	            
	     driver.navigate().refresh();

	}

}
