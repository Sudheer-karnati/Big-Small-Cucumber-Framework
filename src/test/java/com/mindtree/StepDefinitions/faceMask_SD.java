package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.ReusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class faceMask_SD extends WebDriverHelper {
	private static Logger log =LogManager.getLogger(faceMask_SD.class.getName());

    @When("^Hover on element and click facemask$")
    public void hover_on_element_and_click_facemask() throws Throwable {
HomePage l = new HomePage(driver);
		
		Actions action = new Actions(driver);
		action.moveToElement(l.hovershopbycat()).perform();
		l.clickFaceMask().click();
		
       
    }

    @Then("^navigated to an facemask$")
    public void navigated_to_an_facemask() throws Throwable {
    	HomePage l = new HomePage(driver);
    	l.clickMask().click();
    	driver.quit();
    }

    @And("^User navigate to HomePage$")
    public void user_navigate_to_homepage() throws Throwable {
    	driver.get(prop.getProperty("url"));
    }

}
