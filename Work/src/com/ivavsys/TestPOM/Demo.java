package com.ivavsys.TestPOM;

import org.testng.annotations.Test;

import com.ivavsys.genricmet.BaseTest;
import com.ivavsys.pom.EnterTimeTrack;
import com.ivavsys.pom.LoginPage;

public class Demo extends BaseTest {
	@Test
	public void demo(){
		LoginPage lp=new LoginPage(driver);
		lp.inputUserName("Admin");
		lp.inputPassword("Admin123");
		lp.inputWard();
		lp.inputLogin();
		EnterTimeTrack et = new EnterTimeTrack(driver);
		et.Vaildate(driver, "Home");
		
	}

}
