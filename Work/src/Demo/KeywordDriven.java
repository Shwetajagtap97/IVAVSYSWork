package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.ivavsys.genricmet.BaseTest;
import com.ivavsys.pom.LoginPage;

public class KeywordDriven extends BaseTest {
	public void login(String UserName,String Password) throws EncryptedDocumentException, InvalidFormatException, IOException{
		DataDriven.setXLFile(p.getProperty("ActionFilePath"), p.getProperty("SheetName"));
		int col=1;
		LoginPage lp=new LoginPage(driver);
		for(int r=1;r<6;r++){
			if(DataDriven.getData(r, col).equalsIgnoreCase("inputUserName"))
			{
				System.out.println("Done");
				lp.inputUserName(UserName);
			}
			else if(DataDriven.getData(r, col).equalsIgnoreCase("inputPassword"))
			{
				lp.inputPassword(Password);
			}
			else if(DataDriven.getData(r, col).equalsIgnoreCase("inputWard"))
			{
				lp.inputWard();
			}
			else if(DataDriven.getData(r, col).equalsIgnoreCase("inputLogin"))
			{
				lp.inputLogin();
			}
		}
	}
	
}
