package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class loginSteps {
	
WebDriver driver;

@FindBy(xpath="//a[@name='Cancel']")
WebElement LoginBtn;

@FindBy(xpath="//*[text()='#']" )
WebElement HashBtn;

@FindBy(xpath="//input[@placeholder='username']")
WebElement username;

@FindBy(xpath="//input[@placeholder='password']")
WebElement password;

@FindBy(xpath="//button[@name='Login']")
WebElement loginBtn;


@Given("^user is already on Movie Rental Portal$")
public void user_is_already_on_Movie_Rental_Portal() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Java-Workspace\\QaAvengers_UIAutomation\\src\\main\\java\\drivers\\chromedriver.exe");
 	driver=new ChromeDriver();
  driver.get("https://autothon-nagarro-frontend-e07.azurewebsites.net/ ");
 // HashBtn.click();
}

@When("^title of login page is React App$")
public void title_of_login_page_is_React_App() throws Throwable {
	HashBtn.click();
	loginBtn.click();
	String title=driver.getTitle();
 System.out.println("Title of Home Page"+title);
         Assert.assertEquals("React App", title);
}




@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password) throws Throwable {
	driver.findElement(By.xpath("username")).sendKeys(username);

	driver.findElement(By.xpath("password")).sendKeys(password);
}

@Then("^verify login result matches is correct$")
public void verify_login_result_matches_is_correct() throws Throwable {
  
	String usernameTextValue=username.getText();
	Assert.assertEquals(usernameTextValue, "admin");
	System.out.println("Username is correct");
	String passwordTextValue= password.getText();
    Assert.assertEquals(passwordTextValue, "admin");
	System.out.println("Password is correct");
}


@When("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
	driver.findElement(By.xpath("loginBtn")).click();
}

@Then("^user sucessfully logged in as Admin user$")
public void user_successfully_logged_in_as_admin_user() throws Throwable {
	String title=driver.getTitle();
	 System.out.println("Title after Login is "+title);
	         Assert.assertEquals("React App", title);
  
}




}

