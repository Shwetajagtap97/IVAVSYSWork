package com.ivavsys.genricmet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Demo.DataDriven;

public class BaseTest {
	public static Properties p=new Properties();
	static{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("C:\\Users\\Lenovo\\git\\IVAVSYSWork\\Work\\PropertyFile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			XLData.setXLFile(p.getProperty("DataFile"), p.getProperty("Sheet"));
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{
		
		System.setProperty(p.getProperty("DriverKey"), p.getProperty("DriverValue"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(p.getProperty("URL"));
		
	}
	@AfterTest
	public void afterMethod(ITestResult testResult) throws IOException {
		String name = testResult.getName();
		int status = testResult.getStatus();
		if (status == 1)
			Reporter.log("Test:" + name, true);
		else {
			Reporter.log("Test:" + name, true);
			Reporter.log("Status:" + status, true);
			String path=p.getProperty("IMPath")+name+".png";
			ScreenShot.takeScreenShot(driver, path);
		}
		driver.close();
	}
}
