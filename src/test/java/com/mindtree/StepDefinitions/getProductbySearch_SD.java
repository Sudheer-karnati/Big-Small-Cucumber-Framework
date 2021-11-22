package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.PageObjects.personalGiftPage;
import com.mindtree.ReusableComponents.WebDriverHelper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class getProductbySearch_SD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(getProductbySearch_SD.class.getName());
	 @When("^user send keys and add a product to cart$")
	    public void user_send_keys_and_add_a_product_to_cart() throws Throwable {
		 HomePage h = new HomePage(driver);
			h.clickSearchBox().sendKeys("Spider Man");
			
			h.clickSearchBox().sendKeys(Keys.ENTER);
			
			personalGiftPage p = new personalGiftPage(driver);
			p.clickSpidermanprod().click();
		
			
	        
	    }

	    @Then("^product added to wishlist$")
	    public void product_added_to_wishlist() throws Throwable {
	    	String text;
	    	personalGiftPage p = new personalGiftPage(driver);
			text=p.clickAddToCartSpd().getText();
			Assert.assertEquals(text,"Superhero AirPods Case");
	    	driver.quit();
	       
	    }

}
