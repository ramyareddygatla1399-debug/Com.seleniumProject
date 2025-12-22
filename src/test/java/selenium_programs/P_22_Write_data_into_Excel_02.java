package selenium_programs;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File-->Workbook-->Sheets-->Rows-->Cells
public class P_22_Write_data_into_Excel_02
{

	public static void main(String[] args) throws IOException 
	{
		
	   FileOutputStream file = new  FileOutputStream(System.getProperty("user.dir")+"\\TestData_selenium\\Write_data_sheet2.xlsx");
	   XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet sheet= workbook.createSheet("Data");
	    
	     XSSFRow row1= sheet.createRow(0);
	   row1.createCell(0).setCellValue("Job");
	   row1.createCell(1).setCellValue(987);
	   row1.createCell(2).setCellValue("Pune");
	   
	   
	   XSSFRow row2= sheet.createRow(1);
	   row2.createCell(0).setCellValue("BE");
	   row2.createCell(1).setCellValue(123);
	   row2.createCell(2).setCellValue("Hyderabad");
	   
	   
	   XSSFRow row3= sheet.createRow(2);
	   row3.createCell(0).setCellValue("Diploma");
	   row3.createCell(1).setCellValue(000);
	   row3.createCell(2).setCellValue("Warangal");
	   
	   
	   workbook.write(file);
	   workbook.close();
	   file.close();
	   
	   System.out.println("File is created with name : Write_data_sheet2");
	   
	}

}
