package com.ivavsys.genricmet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLData {
	public static String getData(String path,String name,int r,int c) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException{
		String value=" ";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		value=wb.getSheet(name).getRow(r).getCell(c).toString();
		return value;	
	}

}
