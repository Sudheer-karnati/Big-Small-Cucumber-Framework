package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.PageObjects.top50Page;
import com.mindtree.ReusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Top50_SD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(Top50_SD.class.getName());
    @When("^user click Best Selling in Sort and click on product$")
    public void user_click_best_selling_in_sort_and_click_on_product() throws Throwable {
    	HomePage h = new HomePage(driver);
		h.clickTop50().click();
		top50Page t = new top50Page(driver);
		t.clicksortbtn().click();
		t.clickbestSelling().click();
    }
	 @Then("^user navigated to product page$")
	    public void user_navigated_to_product_page() throws Throwable {
		 top50Page t = new top50Page(driver);
			t.clickreqprod().click();
			driver.quit();
	    }

	    
}
