package selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P_20_Headless_02 
{

	public static void main(String[] args)
	{
		//chromeoptions class
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new");
		options.addArguments("--incognito");
		
		
	   WebDriver driver = new ChromeDriver(options);
	   driver.get("https://www.opencart.com/index.php?route=cms/demo");
	   
	   String act_title = driver.getTitle();
	   
	   if(act_title.equals("OpenCart - Demo"))
	   {
		   System.out.println("Test passed again...");
	   }
	   else
	   {
		   System.out.println("Test failed...");
	   }
	   
	   // Advantages of headless - multitasking 
	   //fast execution 
	   
	   //dis adv -user cannot see what is happening on UI

	}

}
