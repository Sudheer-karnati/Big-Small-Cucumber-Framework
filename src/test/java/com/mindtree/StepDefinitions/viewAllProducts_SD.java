package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.PageObjects.HomeDecorPage;
import com.mindtree.PageObjects.HomePage;
import com.mindtree.ReusableComponents.WebDriverHelper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewAllProducts_SD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(viewAllProducts_SD.class.getName());
	 @When("^user click view all btn and select required size and quantity$")
	    public void user_click_view_all_btn_and_select_required_size_and_quantity() throws Throwable {
		 HomePage h = new HomePage(driver);
			h.clickViewAll().click();
			HomeDecorPage hh = new HomeDecorPage(driver);
			hh.clickWoodenProd().click();
			hh.clickSize().click();
			hh.clickquantity().click();

	        
	    }

	    @Then("^product added to cart$")
	    public void product_added_to_cart() throws Throwable {
	    	HomeDecorPage hh = new HomeDecorPage(driver);
	    	hh.clickAddCart().click();
	    	driver.quit();
	        
	    }

}
