package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	
	 WebDriver driver;
		
			
	         @Given("^user is already on login Page$")
			 public void user_already_on_login_page(){
		     System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\PackageForTesting\\ChromeDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		     driver.get("https://freecrm.co.in/");
		     driver.manage().window().maximize();
		 }
			 
			 @When("^title of login page is free crm$")
			 public void title_of_login_page_is_free_crm() {
				 String myTitle=driver.getTitle();
				 System.out.println(myTitle);
				 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", myTitle);
			 }
			 
			//Regular Expression:
		 //1. \"([^\"]*)\"
		 //2. \"(.*)\"
			 
			 
			 @Then("^user enters \"(.*)\" and \"(.*)\"$")
			 public void user_enters_username_and_password(String username,String password) {
				WebElement Login_optn=driver.findElement(By.xpath("//span[contains(text(),'Log In')]")); 
				Login_optn.click();
				WebElement Myusername=driver.findElement(By.name("email"));
				WebElement Mypassword=driver.findElement(By.name("password"));
				
				Myusername.sendKeys(username);
				Mypassword.sendKeys(password);
			WebElement login_btn=driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
		    login_btn.click();
				
			 }
			 
			/* @Then("^user clicks on Login button$")
			 public void user_clicks_on_login_btn() {
				 WebElement login_btn=driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
				 login_btn.click();
			 }*/
			 @Then("^user is on homepage$")
			 public void user_is_on_homepage()  {
				  String title=driver.getTitle();
				  System.out.println("homepage title is::"+title);
				 // Assert.assertEquals("Cogmento CRM", title);
				  Assert.assertEquals("Cogmento CRM", title);
				  WebElement contacts_opt=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
				     contacts_opt.click();
				}
			 
			 @Then("^user clicks on contacts$")
			 public void user_clicks_on_contacts()  {
			     WebElement contacts_opt=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
			     contacts_opt.click();
			 }
			 
			 
			 @Then("^user clicks on new contact$")
			 public void user_clicks_on_new_contact()  {
			     WebElement new_contact=driver.findElement(By.xpath("//button[contains(text(),'New')]"));
			     new_contact.click();
			 }
			 
			 @Then("^user provides \"([^\"]*)\" and \"([^\"]*)\"$")
			 public void user_provides_and(String firstname, String lastname)  {
			     WebElement fname=driver.findElement(By.name("first_name"));
			     WebElement lname=driver.findElement(By.name("last_name"));
			     fname.sendKeys(firstname);
			     lname.sendKeys(lastname);
			 }

			 @Then("^user saves new contact$")
			 public void user_saves_new_contact()  {
			     WebElement Save_icon=driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
			     Save_icon.click();
			 }
			 
			 

}
