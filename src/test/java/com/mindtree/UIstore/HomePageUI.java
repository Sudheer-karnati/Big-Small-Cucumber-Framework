package com.mindtree.UIstore;

import org.openqa.selenium.By;

public class HomePageUI {
	
	public static By signIn=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]");
	public static By email=By.xpath("//*[@id=\'CustomerEmail\']");
	public static By pass=By.xpath("//*[@id=\'CustomerPassword\']");
	public static By enter=By.xpath("//*[@id=\'customer_login\']/p[1]/input");
	public static By links=By.tagName("a");
	public static By shopbycat=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[9]/a");
	//*[@id="myheader"]/div[1]/div/div/ul/li[9]/a
	public static By faceMaskele=By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[9]/ul/li[2]/a");
	public static By reqMaskele=By.xpath("//*[@id=\'CollectionAjaxContent\']/div/div[2]/div/a/div[2]/div[1]");
	
	public static By top50ele=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[6]/a");
	public static By corpele=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[1]/a");
	//*[@id="myheader"]/div[1]/header/div[2]/div[2]/div[3]/form/input[2]
	public static By personalgiftele=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[2]/a");
	public static By searchBoxele=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	public static By homeDecorele=By.xpath("//*[@id=\'shopify-section-1601980218b6c234f6\']/div/div/div[2]/a/div/div/div/button");
	
	public static By viewele=By.xpath("//*[@id=\'CollectionSection-1597671571601\']/div[2]/div/div[2]/a");
	
	public static By giftEle=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[3]/span");
}
