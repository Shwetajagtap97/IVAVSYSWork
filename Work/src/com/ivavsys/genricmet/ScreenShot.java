package com.ivavsys.genricmet;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver,String path) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ScreenShot=ts.getScreenshotAs(OutputType.FILE);
		File SaveScreenShot=new File(path);
		Files.copy(ScreenShot, SaveScreenShot);
	}

}
