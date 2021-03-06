package ReadDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteExcel {
	public static void main(String []args){
		 
		  try {
		 
		  // Specify the file path which you want to create or write
		 
		  File src=new File("E:\\Testing\\TestDataResult.xlsx");
		 
		  // Load the file
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		   // load the workbook
		 
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sh1= wb.getSheetAt(0);
		 
		 // getRow specify which row we want to read and getCell which column
		 
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		 
		// here createCell will create column
		 
		// and setCellvalue will set the value
		 
		 sh1.getRow(0).createCell(2).setCellValue("Pass");
		 
		 
		 sh1.getRow(1).createCell(2).setCellValue("Fail");
		 
		 
		 sh1.getRow(2).createCell(2).setCellValue("Pass");
		 
		 
		// here we need to specify where you want to save file
		 
		 FileOutputStream fout=new FileOutputStream(new File("E:\\Testing\\TestDataResult.xlsx"));
		 
		 
		// finally write content 
		 
		 wb.write(fout);
		 
		// close the file
		 
		 fout.close();
		 
		  } catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }
		 
		 }
}
