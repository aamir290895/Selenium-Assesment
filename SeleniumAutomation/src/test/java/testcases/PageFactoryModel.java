package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactoryModel {

	static WebDriver driver;
	
	@FindBy(xpath = "//button[contains(@class,'ui-button ui-corner-all ui-widget')] ")
	static WebElement email;
	
	public PageFactoryModel() {
		super();
		PageFactory.initElements(driver, getClass());
		// TODO Auto-generated constructor stub
	}
	
	
	@Test
	public void test1() {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		email.click();
		
	}
	
	
	

}
