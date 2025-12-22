package selenium_programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P_22_Write_data_into_Excel_02_01 
{

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData_selenium\\Write_data_Dynamic.xlsx");
		
		XSSFWorkbook workbook  = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Dynamic_Data");
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter how many rows? ");
            int noOfrows = sc.nextInt();
            
            System.out.println("Enter how many cells? ");
            int noOfCells = sc.nextInt();
            
             for(int r=0;r<=noOfrows;r++)
             {
              XSSFRow curr_row =	 sheet.createRow(r);	 
            	 for(int c=0;c<noOfCells;c++)
            	 {
            		 XSSFCell curr_cell=  curr_row.createCell(c); 
            		 curr_cell.setCellValue(sc.next());
            	 }
             }
             workbook.write(file);  
             workbook.close();
             file.close();
             System.out.println("File is created....");
	}

}
