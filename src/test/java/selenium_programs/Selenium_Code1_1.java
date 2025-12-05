package selenium_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Code1_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch web browser 
		WebDriver driver = new ChromeDriver();
		
		//Launch the application 
		driver.get("https://www.google.com/");
		
       driver.manage().window().maximize();
       Thread.sleep(5000);
       
		//	Google
		String act = driver.getTitle();
		if(act.equals("Google"))
		{
		System.out.println("test passed");	
		}
		else
		{
			System.out.println("Test failed");
		}
	   // driver.close();
		
	}

}
