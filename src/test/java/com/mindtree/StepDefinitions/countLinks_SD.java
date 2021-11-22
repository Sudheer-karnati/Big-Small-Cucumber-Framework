package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.ReusableComponents.WebDriverHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class countLinks_SD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(countLinks_SD.class.getName());
	public WebDriver driver;
	 @Given("^Open the browser$")
	    public void open_the_browser() throws Throwable {
		 WebDriverHelper w=new WebDriverHelper();
			driver=w.initializedriver();
			log.info("Driver intialised succesfully");
	       
	    }

	    @When("^User Navigates to HomePage$")
	    public void user_navigate_to_homepage() throws Throwable {
	    	driver.get(prop.getProperty("url"));
	    }

	    @Then("^Print the Number of Links$")
	    public void print_the_number_of_links() throws Throwable {
	    	HomePage h = new HomePage(driver);
			
			System.out.println(h.getlinks());
			driver.quit();
	       
	    }

}
