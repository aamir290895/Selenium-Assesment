package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryModel {

	static WebDriver driver;

	@FindBy(id = "email")
	private static WebElement email;

	@FindBy(id="pass")
	private static WebElement password;

	@FindBy(css = "[name='login']")
	private static WebElement login;

	public PageFactoryModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public static void inputEmail(String em) {

		email.sendKeys(em);
	}

	public static void inputPassword(String pass) {

		password.sendKeys(pass);
	}

	public static void login() {

		login.click();
	}

}

class Driver{
	static WebDriver driver;
     
	public static WebDriver startDriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	
	
}

class PageFactoryModelImpl {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void open() {
	
	driver = Driver.startDriver("https://www.facebook.com");	
		
	}
	
	
	@Test
	void test() throws InterruptedException{
		PageFactoryModel model = PageFactory.initElements(driver,PageFactoryModel.class );
		model.inputEmail("aamir@gmail.com");
		model.inputPassword("sssss");
		model.login();
	}
	
	@AfterClass
	public static void close() {
		
	 driver.close();	
	}
	
}
