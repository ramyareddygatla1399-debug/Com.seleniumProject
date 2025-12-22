package selenium_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_19_Upload_files_04 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		//1) Single file upload
		/* WebElement ele= driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		 String s1="C:\\Users\\LENOVO\\Documents\\Test1.txt";
		 ele.sendKeys(s1);
		 
		  String str="Test1.txt";
		  WebElement eles= driver.findElement(By.xpath("//ul[@id='fileList']"));
		  String doc= eles.getText();
		   
		 
		if(str.equals(doc))
		{
			System.out.println("File uploaded successfully...");
		}
		else
		{
			System.out.println("File not uploaded succeessfully...");
		}*/
		
		//Multiple files upload
		String file1 = "C:\\Users\\LENOVO\\Documents\\Test1.txt";
		String file2 = "C:\\Users\\LENOVO\\Documents\\Test2.txt";
		
	  WebElement eless =	driver.findElement(By.xpath("//input[@id='filesToUpload']"));
	  eless.sendKeys(file1+"\n"+file2);
	  
	 List<WebElement> docs = driver.findElements(By.xpath("(//ul[@id='fileList'])//li"));
	 int num =  docs.size();
	 System.out.println("Number of files uploaded: "+num);
	 
	 //Validation 1 - file names 
	 
	 /*   String str1 ="Test1.txt";
	    String str2 ="Test2.txt";
	    
	    WebElement f1 =  driver.findElement(By.xpath("(//ul[@id='fileList'])//li[1]"));
        String s1 = 	f1.getText();
         
        WebElement f2 =  driver.findElement(By.xpath("(//ul[@id='fileList'])//li[2]"));
        String s2 = 	f2.getText();
         
	 
	 if(str1.equals(s1)  && str2.equals(s2))
	 {
		 System.out.println("2 files uploaded successfully...");
	 }
	 else
	 {
		 System.out.println(" 2 files not uploaded successfully...");
	 }*/
	 
	 
	 //Validation 2 number of files 
	 
	 if(num==2)
	 {
		 System.out.println("all files uploaded successfully....");
	 }
	 else
	 {
		 System.out.println("all files not uploaded successfull....");
	 }
     
	}

}
