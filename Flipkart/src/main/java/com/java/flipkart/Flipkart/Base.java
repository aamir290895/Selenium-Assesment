package com.java.flipkart.Flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Base {
	
	@FindBy(how =How.XPATH , using ="//input[@title='Search for products, brands and more']")
	static WebElement searchBar;
	
	
	@FindBy(how= How.XPATH,using ="//button[@class=\"_2KpZ6l _2doB4z\"]")
	static WebElement popup;
	
	@FindBy(how =How.PARTIAL_LINK_TEXT,using ="realme C11")
	static WebElement select;
	
	public static void closePopup() {
		
		popup.click();
	}
	
	
	public static void selectSearchElement(String search) {
		searchBar.sendKeys(search);
		searchBar.sendKeys(Keys.ARROW_DOWN);
		searchBar.sendKeys(Keys.ENTER);
		
		
	}

}
