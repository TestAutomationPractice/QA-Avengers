package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{

	//Page Factory - Object Repository:
	
	@FindBy(xpath="//button[contains(text(),'#')]")
	WebElement HashBtn;
	
	@FindBy(xpath="//a[@name='Cancel']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//input[@placeholder='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='password']")
	WebElement password;
	
	//initializing the Page Objects:
	
	public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername() {
		username.sendKeys(keysToSend);
		
	}

	 //Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public AddMovie login(String un, String pwd) throws FileNotFoundException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
		
		return new AddMovie();
	}
	
	
	public void getTitle() {
		
		
	}
	
}
