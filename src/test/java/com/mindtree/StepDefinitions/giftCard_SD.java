package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.PageObjects.top50Page;
import com.mindtree.ReusableComponents.WebDriverHelper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class giftCard_SD extends WebDriverHelper {
	private static Logger log =LogManager.getLogger(giftCard_SD.class.getName());
	 @When("^user click giftcard on homepage and add it to wishlist$")
	    public void user_click_giftcard_on_homepage_and_add_it_to_wishlist() throws Throwable {
		 HomePage h = new HomePage(driver);
			h.clickGiftCard().click();
			top50Page t = new top50Page(driver);
			t.clickthousand().click();
			t.clickWishlist().click();
	       
	    }

	    @Then("^Gift Card Added succesfully to wishlist$")
	    public void gift_card_added_succesfully_to_wishlist() throws Throwable {
	    	top50Page t = new top50Page(driver);
	    	t.clickWishlist().click();
	    	driver.quit();
	    }

}
