package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.PageObjects.HomeDecorPage;
import com.mindtree.PageObjects.HomePage;
import com.mindtree.ReusableComponents.WebDriverHelper;
import com.mindtree.Utilities.Screenshot;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkCashOnDelivery_SD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(checkCashOnDelivery_SD.class.getName());
	 @When("^user click a product and enter pincode$")
	    public void user_click_a_product_and_enter_pincode() throws Throwable {
		 HomePage h = new HomePage(driver);
			h.clickHomeDecor().click();
			HomeDecorPage hh = new HomeDecorPage(driver);
			hh.clickBulb().click();
			hh.clickpincodeBox().sendKeys("516172");
			log.info("send pincode");
			Screenshot s=new Screenshot();
			s.getSS("checkCashOnDelivery_SD");
	    }

	    @Then("^cash on delivery is validated$")
	    public void cash_on_delivery_is_validated() throws Throwable {
	    	HomeDecorPage hh = new HomeDecorPage(driver);
	    	hh.clickCheck().click();
	    	log.info("availabitlity checked");
	    	driver.quit();
	       
	    }

}
