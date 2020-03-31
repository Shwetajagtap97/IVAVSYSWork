package com.ivavsys.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrack {
	public EnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Vaildate(WebDriver driver, String title) {

		try {
			WebDriverWait ww = new WebDriverWait(driver, 30);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Sucessfully login", true);
		} catch (Exception e) {
			Reporter.log("Not login", true);
			Assert.fail();
		}
	}
}
