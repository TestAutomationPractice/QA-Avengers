package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class AddMovie  extends TestBase{
	
	
	@FindBy(xpath="//input[@placeholder='Please enter the title of the movie']")
	WebElement Title;
	
	@FindBy(xpath="//input[@placeholder='Please enter the name of the director']")
	WebElement Director;
	
	@FindBy(xpath="//textarea[@placeholder='Please enter a short description of the movie']")
	WebElement Desciption;
	
	@FindBy(xpath="//option[@value='Thriller']")
	WebElement Categories;
	
	@FindBy(xpath="//input[@placeholder='Please enter the URL to the movie poster']")
	WebElement URL;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[6]/div/svg[5]/path")
	WebElement Rating;
	
	@FindBy(xpath="//button[contains(text(),'Save Movie')] ")
	WebElement SaveMovieBtn;
	


	public AddMovie() throws FileNotFoundException {
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
