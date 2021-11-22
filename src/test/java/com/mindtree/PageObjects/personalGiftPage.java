package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.personalGiftUI;

public class personalGiftPage {
public WebDriver driver;
	
	
	public  personalGiftPage(WebDriver driver) {
this.driver=driver;
}
	
	public WebElement clickprod() {
		return driver.findElement(personalGiftUI.prodReqele);
	}
	public WebElement clickAddWish() {
		return driver.findElement(personalGiftUI.addWishlistele);
	}
	public WebElement clickSpidermanprod() {
		return driver.findElement(personalGiftUI.spiderManProdele);
	}
	public WebElement clickAddToCartSpd() {
		return driver.findElement(personalGiftUI.addSpiderManProdele);
	}
	public WebElement clickCheckOut() {
		return driver.findElement(personalGiftUI.CheckOutele);
	}
}
