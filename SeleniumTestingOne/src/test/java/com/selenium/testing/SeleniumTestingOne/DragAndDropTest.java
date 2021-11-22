package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://adept-stage-306721.web.app/");
	}

}
