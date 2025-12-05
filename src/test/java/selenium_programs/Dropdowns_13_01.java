package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_13_01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
		Select s1 = new Select(ele);
		
		//select option from dropdown
		
		//s1.selectByValue("germany");
		//s1.selectByIndex(1);
		s1.selectByVisibleText("United Kingdom");
		
		
		//capture options from dropdown
		List<WebElement> num= s1.getOptions();
		System.out.println(num.size());
		
		/*for(int i=0;i<num.size();i++)
		{
		String countries	= num.get(i).getText();
		System.out.println(countries);
		}*/
		
		//using enhanced for loop 
		
		for( WebElement text:num)
		{
		System.out.println(text.getText());
		}
		

	}

}
