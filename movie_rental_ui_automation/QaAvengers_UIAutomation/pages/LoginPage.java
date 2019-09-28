package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{

	//Page Factory - Object Repository:
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login']")
	WebElement loginBtn;
	
	//initializing the Page Objects:
	
	public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
	}

	 //Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) throws FileNotFoundException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
		
		return new HomePage();
	}
	
}
