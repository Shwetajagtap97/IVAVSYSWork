package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
	public static Workbook wb;
	public static Sheet sh;
	public static void setXLFile(String path,String SheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		wb=WorkbookFactory.create(fis);
		 sh=wb.getSheet(SheetName);
	}
	public static String getData(int row,int col)
	{
		String data=sh.getRow(row).getCell(col).toString();
		return data;
	}

}
