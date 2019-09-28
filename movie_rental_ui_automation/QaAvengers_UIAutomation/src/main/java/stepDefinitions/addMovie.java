package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class addMovie {
	
WebDriver driver;


@Given("^user has already logged in as Admin user$")
public void user_has_already_logged_in_as_Admin_user() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Java-Workspace\\LearnSelenium2\\Drivers\\chromedriver.exe");
 	driver=new ChromeDriver();
  driver.get("https://autothon-nagarro-frontend-w07.azurewebsites.net/ ");
}

@When("^admin user clicks on Add Movie button$")
public void admin_user_clicks_on_Add_Movie_button() throws Throwable {
  
}

@When("^user enters \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
    
}

@When("^user clicks on Save Movie button$")
public void user_clicks_on_Save_Movie_button() throws Throwable {
    
}

@Then("^movie is created by admin user$")
public void movie_is_created_by_admin_user() throws Throwable {
    
  
}

}

//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Java-Workspace\\LearnSelenium2\\Drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://ui.freecrm.com/");
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() throws Throwable {
//	   String title=driver.getTitle();
//	   System.out.println("Title of Login Page"+title);
//	   Assert.assertEquals("CRM", title);
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) throws Throwable {
//
//		driver.findElement(By.name("email")).sendKeys(username);
//		
//		driver.findElement(By.name("password")).sendKeys(password);
//		
//		
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button' and contains(text(),'Login')]")).click();
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//		 String title=driver.getTitle();
//		   System.out.println("Title of Home Page"+title);
//		   Assert.assertEquals("CRM", title);
//		
//	}
//
//
//@Then("^user moves to new contact page$")
//public void user_moves_to_new_contact_page() throws Throwable {
//   
//}
//
//	
//	@Then("^user puts contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_puts_contact_details_and_and(String firstname, String lastname, String position) throws Throwable {
//	   
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser()  {
//	    driver.quit();
//	}
//}


//@Given("^user is already on Login Page$")
//public void user_is_already_on_Login_Page() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Java-Workspace\\LearnSelenium2\\Drivers\\chromedriver.exe");
//	driver=new ChromeDriver();
//	driver.get("https://ui.freecrm.com/");
//}
//
//@When("^title of login page is Free CRM$")
//public void title_of_login_page_is_Free_CRM() throws Throwable {
//   String title=driver.getTitle();
//   System.out.println("Title of Login Page"+title);
//   Assert.assertEquals("CRM", title);
//}
//
//@Then("^user enters username and password$")
//public void user_enters_username_and_password(DataTable credentials) {
//
//	List<List<String>> data=credentials.raw();
//	driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	
//	driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	
//	
//}
//
//@Then("^user clicks on login button$")
//public void user_clicks_on_login_button() throws Throwable {
//	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button' and contains(text(),'Login')]")).click();
//}
//
//@Then("^user is on home page$")
//public void user_is_on_home_page() throws Throwable {
//	 String title=driver.getTitle();
//	   System.out.println("Title of Home Page"+title);
//	   Assert.assertEquals("CRM", title);
//	
//}
//
//@Then("^user moves to new deal page$")
//public void user_moves_to_new_deal_page() throws Throwable {
//   
//}
//





