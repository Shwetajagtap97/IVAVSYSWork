package com.ivavsys.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	private WebElement inward;
	@FindBy(id="loginButton")
	private WebElement login;
	@FindBy(xpath="//li[@class='logout']/a")
	private WebElement logout;

	public LoginPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}

	public void inputUserName(String user) {
		username.sendKeys(user);
	}
	public void inputPassword(String pwds) {
		password.sendKeys(pwds);
	}
	public void inputWard()
	{
		inward.click();
	}
	public void inputLogin()
	{
		login.click();
	}

}
