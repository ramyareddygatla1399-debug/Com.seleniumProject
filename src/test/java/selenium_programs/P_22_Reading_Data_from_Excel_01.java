package selenium_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class P_22_Reading_Data_from_Excel_01 
{

	public static void main(String[] args) throws IOException
	{
		//1) Read data from excel
    FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData_selenium\\Sample_TestData.xlsx");
    
    XSSFWorkbook workbook = new XSSFWorkbook(file);
   XSSFSheet sheet  =  workbook.getSheet("Sheet1"); 
    // XSSFSheet sheet1  =  workbook.getSheetAt(0);
    
        int nofrows= sheet.getLastRowNum();
        System.out.println("Number of rows :"+nofrows); //5
        
        int nofcell = sheet.getRow(1).getLastCellNum();
        System.out.println("Number of cells: "+nofcell); //4
        
        
        for(int r=0;r<=nofrows;r++)
        {
             XSSFRow current_row =	sheet.getRow(r);
        	for(int c=0;c<nofcell;c++)
        	{
        		XSSFCell cell = current_row.getCell(c);
        	    System.out.print(cell.toString()+"\t");  
        	}
        	System.out.println();
        }
        
        workbook.close();
        file.close();
	}

}
