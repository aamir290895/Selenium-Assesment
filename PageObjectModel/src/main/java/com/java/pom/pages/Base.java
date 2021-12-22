package com.java.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	static WebDriver driver = null;
	private static WebElement element = null;

	private static By source = By.xpath("//input[@placeholder='Any worldwide city or airport' and @xpath='1']");

	private static By destination = By.xpath("//input[@placeholder='Any worldwide city or airport' and @xpath='2']");
	
	private static By tripType = By.xpath("//*[@class='radio__circle bs-border bc-neutral-500 bw-1 ba' and @xpath='1']");

	
	private static By selectDate = By.xpath("//*[@class='p-1 day-gridContent flex flex-middle flex-column flex-center Round-trip']");
    
	private static By list = By.xpath("//li[@class='ls-reset br-4 w-100p px-2 dropdown__item c-neutral-900 fs-3 hover:bg-secondary-500 hover:c-white c-pointer']");


	public static WebDriver driver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		return driver;
	}
	
	
	public static void trip () {

		element = driver.findElement(tripType);

	}

	public static WebElement findSource(WebDriver driver) {

		element = driver.findElement(source);
		element.sendKeys("Jabalpur");
	    List<WebElement> li = driver.findElements(list);
		for(WebElement ele : li) {
			Select select = new Select(ele);
			select.selectByValue("Jabalpur, IN - Jabalpur (JLR)");
			
		}

		return element;
	}

	public static WebElement findDestination (WebDriver driver) {

		element = driver.findElement(destination);

		return element;
	}
	
	public static WebElement datePick (WebDriver driver) {

		element = driver.findElement(selectDate);

		return element;
	}

}
