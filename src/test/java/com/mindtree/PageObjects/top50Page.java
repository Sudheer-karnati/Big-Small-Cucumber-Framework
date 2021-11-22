package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.Top50pageUI;

public class top50Page {
public WebDriver driver;
	
	
	public top50Page(WebDriver driver) {
this.driver=driver;
}

	public WebElement clicksortbtn() {
		return driver.findElement(Top50pageUI.sortele);
	}
	public WebElement clickbestSelling() {
		return driver.findElement(Top50pageUI.bestSellingele);
	}
	public WebElement clickreqprod() {
		return driver.findElement(Top50pageUI.reqprodele);
	}
	public WebElement clickthousand() {
		return driver.findElement(Top50pageUI.thousandele);
	}
	public WebElement clickWishlist() {
		return driver.findElement(Top50pageUI.wishEle);
	}
	

}
