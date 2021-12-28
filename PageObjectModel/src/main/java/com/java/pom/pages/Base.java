package com.java.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Base {

	static WebDriver driver;

	@FindBy(how =How.ID_OR_NAME, using = "email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "pass" )
	private static WebElement password;

	@FindBy(how = How.CSS, using = "[name='login']")
	private static WebElement login;

	public Base (WebDriver driver) {
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
