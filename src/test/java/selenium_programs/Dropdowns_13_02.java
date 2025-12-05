package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns_13_02 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		WebElement button  =driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		button.click();
		List<WebElement> options= driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		 int num= options.size();
		 System.out.println(num);
		 
		/* for(int i=0;i<options.size();i++)
		 {
			System.out.println(options.get(i).getText()); 
		 }*/
		 
		 
		 //using for each loop
		 for( WebElement item:options)
		 {
			System.out.println(item.getText());
		 }

	}

}
