package selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P_20_SSL_CERT_03 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());

	}

}
