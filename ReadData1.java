package ReadDataFromExcel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("E:\\Testing\\Testdata.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Data");
		String value=s.getRow(2).getCell(1).getStringCellValue();
		System.out.println("Data is "+value);
	}

}
