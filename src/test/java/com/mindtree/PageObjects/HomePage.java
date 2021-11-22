package com.mindtree.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.HomePageUI;



public class HomePage {
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
this.driver=driver;
}
	
	public WebElement clickloginbtn() {
		return driver.findElement(HomePageUI.signIn);
	}
	
	public WebElement clickemail() {
		return driver.findElement(HomePageUI.email);
	}
	
	public WebElement clickpass() {
		return driver.findElement(HomePageUI.pass);
	}
	
	public WebElement clickenter() {
		return driver.findElement(HomePageUI.enter);
	}
	public int getlinks() {
		return driver.findElements(HomePageUI.links).size();
	}
	

	public WebElement hovershopbycat() {
		return driver.findElement(HomePageUI.shopbycat);
	}

	public WebElement clickFaceMask() {
		return driver.findElement(HomePageUI.faceMaskele);
	}
	
	public WebElement clickMask() {
		return driver.findElement(HomePageUI.reqMaskele);
	}
	
	
	
	
	public WebElement clickTop50() {
		return driver.findElement(HomePageUI.top50ele);
	}
	public WebElement clickCorpgift() {
		return driver.findElement(HomePageUI.corpele);
	}
	public WebElement clickPersonalGift() {
		return driver.findElement(HomePageUI.personalgiftele);
	}
	public WebElement clickSearchBox() {
		return driver.findElement(HomePageUI.searchBoxele);
	}
	public WebElement clickHomeDecor() {
		return driver.findElement(HomePageUI.homeDecorele);
	}
	
	public WebElement clickViewAll() {
		return driver.findElement(HomePageUI.viewele);
	}

	public WebElement clickGiftCard() {
		return driver.findElement(HomePageUI.giftEle);
	}


}
