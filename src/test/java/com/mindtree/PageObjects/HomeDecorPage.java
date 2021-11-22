package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.HomeDecorPageUI;

public class HomeDecorPage {
	public WebDriver driver;


	public HomeDecorPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement clickBulb() {
		return driver.findElement(HomeDecorPageUI.BulbLightele);
	}
	public WebElement clickpincodeBox() {
		return driver.findElement(HomeDecorPageUI.pinBoxele);
	}
	public WebElement clickCheck() {
		return driver.findElement(HomeDecorPageUI.checkele);
	}
	public WebElement clickWoodenProd() {
		return driver.findElement(HomeDecorPageUI.woodenProdele);
	}
	public WebElement clickSize() {
		return driver.findElement(HomeDecorPageUI.sizeEle);
	}
	public WebElement clickquantity() {
		return driver.findElement(HomeDecorPageUI.quantityEle);
	}
	public WebElement clickAddCart() {
		return driver.findElement(HomeDecorPageUI.AddCartEle);
	}

}
