package com.ivavsys.genricmet;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{	public static Properties p;
	public WebDriver driver;
	static {
		if(BROWSER_NAME.equalsIgnoreCase("Chrome"))
		{
		
		System.setProperty(CHROME_Key, CHROME_Value);
		}
		if(BROWSER_NAME.equalsIgnoreCase("FireFox"))
		{
		System.setProperty(FIREFOX_Key, FIREFOX_Value);
		}
	}
	

	@BeforeMethod
	public void beforeMetho() {
		if(BROWSER_NAME.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		if(BROWSER_NAME.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
		
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) throws IOException {
		String name = testResult.getName();
		int status = testResult.getStatus();
		if (status == 1)
			Reporter.log("Test:" + name, true);
		else {
			Reporter.log("Test:" + name, true);
			Reporter.log("Status:" + status, true);
			String path=IMPAth+name+".png";
			ScreenShot.takeScreenShot(driver, path);
		}
		driver.close();
	}

	public void pro() throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\workspace\\Ivavsys\\PropertyFile");
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("Driver"));
		
		
		
	}
	
	
	
}
