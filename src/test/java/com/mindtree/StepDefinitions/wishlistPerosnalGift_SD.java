package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.PageObjects.personalGiftPage;
import com.mindtree.ReusableComponents.WebDriverHelper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wishlistPerosnalGift_SD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(wishlistPerosnalGift_SD.class.getName());
	@When("^user click on personal gift and click wishlist$")
    public void user_click_on_personal_gift_and_click_wishlist() throws Throwable {
		HomePage h = new HomePage(driver);
		h.clickPersonalGift().click();
		personalGiftPage p = new personalGiftPage(driver);
		p.clickprod().click();

    }

    @Then("^product added to the wishlist$")
    public void product_added_to_wishlist() throws Throwable {
    	personalGiftPage p = new personalGiftPage(driver);
    	p.clickAddWish().click();
    	driver.quit();
    }

}
