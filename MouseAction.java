package com.selenium.testing.SeleniumTestingOne;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {
	@Test
	public static void mouseAction()throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
