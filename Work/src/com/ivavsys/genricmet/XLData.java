package com.ivavsys.genricmet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XLData {
	public static Workbook wb;
	public static Sheet sh;
	public static void setXLFile(String path,String SheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		wb=WorkbookFactory.create(fis);
		 sh=wb.getSheet(SheetName);
	}
	@DataProvider
	public static String[][] getData() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException{
		String[][] value=new String[3][3];
		int k=0;
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<3;j++)
			{
			value[k][j]=sh.getRow(i).getCell(j).toString();
			}
			k++;
		}	
		return value;	
	}
}

