package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.corpGiftspageUI;

public class corpGiftspage {
	public WebDriver driver;


	public corpGiftspage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement clickName() {
		return driver.findElement(corpGiftspageUI.cname);
	}

	public WebElement clickEmail() {
		return driver.findElement(corpGiftspageUI.cemail);
	}

	public WebElement clickNum() {
		return driver.findElement(corpGiftspageUI.cnumber);
	}

	public WebElement clickSubmit() {
		return driver.findElement(corpGiftspageUI.submitele);
	}

}
