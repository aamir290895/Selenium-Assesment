package com.makemytrip.testing.MakeMyTripTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private static WebDriver driver;
	
	private static WebDriverWait wait;
	

	@FindBy(how = How.XPATH, using = "//li[@data-cy ='oneWayTrip']//span")
	static WebElement tripSelect;

	@FindBy(how = How.XPATH, using = "//div[@class=\\\"fsw_inputBox searchCity inactiveWidget \\\"]/label")
	static WebElement source;

	@FindBy(how = How.XPATH, using = "//li[@data-cy='account']")
	static WebElement popup;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\\\"hsw_autocomplePopup autoSuggestPlugin \\\"]/div/input")
	static WebElement destination;

	@FindBy(how = How.XPATH, using = "//div[@class=\\\"DayPicker-Day\\\"][contains(@aria-label,'Dec 24 2021')]")
	static WebElement datePicker;

	@FindBy(how = How.XPATH, using = "")
	static WebElement search;

	public BasePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public static void  popupClose() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated((By) popup));

		popup.click();
	}
	
	public static void selectTrip() {

		tripSelect.click();
	}

	public static List<WebElement> selectSource(String sou) {
		
		destination.sendKeys(sou);

		List<WebElement> list = driver.findElements(By.cssSelector("p[class=\"font14 appendBottom5 blackText\"]"));

		for (int j = 0; j < list.size(); j++) {
			String text = list.get(j).getText();
			if (text.contains(sou)) {
				list.get(j).click();
				break;
			}
		}
			
	    return list;
		
	}

	public static List<WebElement> selectDestination(String des) {
		List<WebElement> list = driver.findElements(By.cssSelector("p[class=\"font14 appendBottom5 blackText\"]"));

		destination.sendKeys(des);
		for (int j = 0; j < list.size(); j++) {
			String text = list.get(j).getText();
			if (text.contains(des)) {
				list.get(j).click();
				break;
			}
		}
			
	    return list;
		
	}

	public static void selectDate() {

		datePicker.click();
	}

	public static void search() {

		search.click();
	}

}
