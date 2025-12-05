package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables_15_01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//static webtable 
		
		//1) find total number of rows in table 
		
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr"));
		 int num1= rows.size();
		 System.out.println("Total number of rows: "+num1);
		 
		//2) find total number of columns in table 
		List<WebElement> col =driver.findElements(By.xpath("(//table[@name='BookTable'])//tr//th"));
	    int num2 =	col.size();
	    System.out.println("total number of columns: "+num2);
	    
	    //3) Read specific data from table  
	     WebElement data = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr[4]//td[2]")); // r4 c2
	     String text = data.getText();
	     System.out.println(text);
	     
	/*     //4) read all the headers from webtable
	     
	   List<WebElement> heads =  driver.findElements(By.xpath("(//table[@name='BookTable'])//tbody//tr[1]"));
	  int num =  heads.size();
	  System.out.println(num);
	  
	  for(WebElement hd:heads)
	  {
		 System.out.println(hd.getText());  
	  }
	   
	   System.out.println();
	     
	     //5) read data from all the rows and columns
	     for(int r=2;r<=rows.size();r++)
	     {
	    	 for(int c=1;c<=col.size();c++)
	    	 {
	    		 String dataa = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+r+"]//td["+c+"]")).getText(); 
	    		 System.out.print(dataa+"\t");
	    	 }
	    	System.out.println(); 
	     }*/
	     
	     //6) Print book names whose author is mukesh
	     
	   /*  for(int rr=2;rr<=rows.size();rr++)
	     {
	     
	      String name= driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+rr+"]//td[2]")).getText();
	      if(name.equals("Mukesh"))
	      {
	    	String bookname =   driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+rr+"]//td[1]")).getText();
	    	System.out.println(bookname+"\t"+name);
	    	  
	      }
		
	     }*/
	     
	     //7) total price of all the books
	     int total=0;
	     for(int rr=2;rr<=rows.size();rr++)
	     { 
	      String price= driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+rr+"]//td[4]")).getText();
	      total =  total+Integer.parseInt(price);
		
	     }
	     System.out.println(total);
   	  

	}

}
