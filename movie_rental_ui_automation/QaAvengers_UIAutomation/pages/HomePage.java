package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage  extends TestBase{
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
//	@FindBy(xpath="//a[contains(text(),'New Contact')]")
//	WebElement newContactLink;
	
	@FindBy(xpath="//a[@href='/contacts/new']//button[@class='ui linkedin button']")
	WebElement newContactLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	


	public HomePage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public ContactsPage clickOnContactsLink() throws FileNotFoundException {
		contactsLink.click();
		return new ContactsPage();
		
	}
	
	public void clickOnNewContactLink() {
		Actions action= new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
	


	
//	public DealsPage clickOnDealsLink() {
//		dealsLink.click();
//		return DealsPage();
//	
//	}
//	
	
}
