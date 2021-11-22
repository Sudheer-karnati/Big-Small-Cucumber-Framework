package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.ReusableComponents.WebDriverHelper;
import com.mindtree.Utilities.Screenshot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signInSD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(signInSD.class.getName());
	public WebDriver driver;
	 @Given("^user are on homepage$")
	    public void user_are_on_homepage() throws Throwable {
		 WebDriverHelper w=new WebDriverHelper();
			driver=w.initializedriver();
			driver.get(prop.getProperty("url"));
	      
	    }

	    @When("^user enter credentials (.+) and (.+)$")
	    public void user_enter_credentials_and(String username, String password) throws Throwable {
	    	HomePage s = new HomePage(driver);
			s.clickloginbtn().click();
			s.clickemail().sendKeys(username);
			s.clickpass().sendKeys(password);
	        
	    }
	    @And("^clicks on login button$")
	    public void clicks_on_login_button() throws Throwable {
	    	 HomePage s = new HomePage(driver);
				s.clickenter().click();
				System.out.println("clicked login button");
	    
	    }

	    @Then("^user navigated to homepage$")
	    public void user_navigated_to_homepage() throws Throwable {
	    	System.out.println("Verified login and successed");
	    	Screenshot s =new Screenshot();
	    	s.getSS("SignIn");
	    	driver.quit();
	       
	    }

	   

}
