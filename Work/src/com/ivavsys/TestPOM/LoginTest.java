package com.ivavsys.TestPOM;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.testng.annotations.Test;

import com.ivavsys.genricmet.BaseTest;
import com.ivavsys.genricmet.KeywordDriven;
import com.ivavsys.genricmet.XLData;
import com.ivavsys.pom.EnterTimeTrack;
import com.ivavsys.pom.LoginPage;

public class LoginTest extends BaseTest {
	KeywordDriven k=new KeywordDriven();
	@Test
	public void login()
	{
		k.login();
	}
	
}


