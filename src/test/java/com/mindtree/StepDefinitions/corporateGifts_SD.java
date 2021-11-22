package com.mindtree.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.PageObjects.HomePage;
import com.mindtree.PageObjects.corpGiftspage;
import com.mindtree.ReusableComponents.WebDriverHelper;
import com.mindtree.Utilities.Screenshot;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class corporateGifts_SD extends WebDriverHelper{
	private static Logger log =LogManager.getLogger(corporateGifts_SD.class.getName());
	@When("^user click corporate gifts and enter Details$")
    public void user_click_corporate_gifts_and_enter_details() throws Throwable {
		HomePage h = new HomePage(driver);
		h.clickCorpgift().click();
		corpGiftspage c = new corpGiftspage(driver);
		c.clickName().sendKeys("Sidha");
		c.clickEmail().sendKeys("sidda@gmail.com");
		c.clickNum().sendKeys("9182874107");
		log.info("Sending Data");
		Screenshot s=new Screenshot();
		s.getSS("corporateGifts_SD");
        
    }

    @Then("^user corporate product page$")
    public void user_corporate_product_page() throws Throwable {
    	corpGiftspage c = new corpGiftspage(driver);
    	c.clickSubmit().click();
    	log.info("Submit Details");
    	driver.quit();
    }

}
