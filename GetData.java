package ReadDataFromExcel;

import java.io.File;

import jxl.Workbook;


public class GetData {
	
public static void main (String [] args) throws Exception
{
	File source=new File("E:\\Testing\\Testdata.xls");
	System.out.println("Excel Located");
	Workbook wb=Workbook.getWorkbook(source);
	System.out.println("workbook loaded");
	String data00=wb.getSheet("Data").getCell(0,0).getContents();
	System.out.println("Data is "+data00);
	



}

}
