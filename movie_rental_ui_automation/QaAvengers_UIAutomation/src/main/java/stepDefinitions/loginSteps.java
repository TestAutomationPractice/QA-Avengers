package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class AddMovie {
	
WebDriver driver;

/*Given user is already on Movie Rental Portal
When title of login page is React App
And user enters "<username>" and "<password>"
And user clicks on login button
Then user sucessfully logged in as Admin user*/

@Given("^user is already on Movie Rental Portal$")
public void user_is_already_on_Movie_Rental_Portal() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Java-Workspace\\LearnSelenium2\\Drivers\\chromedriver.exe");
 	driver=new ChromeDriver();
  driver.get("https://autothon-nagarro-frontend-w07.azurewebsites.net/ ");
}

@When("^title of login page is React App$")
public void title__of_login_page_is_React_App() throws Throwable {
	 String title=driver.getTitle();
 System.out.println("Title of Home Page"+title);
         Assert.assertEquals("CRM", title);
}

@When("^user enters \\\"([^\\\"]*)\\\" and  \\\"([^\\\"]*)\\\"$\" "$")
public void user_enters_and(String arg1, String arg2) throws Throwable {
    
driver.findElement(By.name("email")).sendKeys(username);

driver.findElement(By.name("password")).sendKeys(password);
}

@When("^user clicks on Save Movie button$")
public void user_clicks_on_Save_Movie_button() throws Throwable {
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button' and contains(text(),'Login')]")).click();
}

@Then("^movie is created by admin user$")
public void movie_is_created_by_admin_user() throws Throwable {
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button' and contains(text(),'Login')]")).click();
  
}

