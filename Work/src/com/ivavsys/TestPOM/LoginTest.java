package com.ivavsys.TestPOM;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ivavsys.genricmet.BaseTest;
import com.ivavsys.genricmet.XLData;
import com.ivavsys.pom.LoginPage;
import com.ivavsys.pom.EnterTimeTrack;
@Listeners(Listener.ListenerDemo.class)

public class LoginTest extends BaseTest {
	
	@Test(dataProvider="getData",dataProviderClass=XLData.class)
	public void login(String user,String pass,String title) throws EncryptedDocumentException, InvalidFormatException, IOException
	{	System.out.println(user+":"+pass);
		LoginPage lp=new LoginPage(driver);
		lp.inputUserName(user);
		lp.inputPassword(pass);
		lp.inputWard();
		lp.inputLogin();
		EnterTimeTrack et = new EnterTimeTrack(driver);
		et.Vaildate(driver, title);
	}
}	