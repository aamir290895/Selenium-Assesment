package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {
	 
	
	  
		public static void main(String [] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");

			Thread.sleep(3000);
			Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[3]") ));
			dropdown.selectByVisibleText( "Anubhuti Class");
			Thread.sleep(2000);
			driver.close();
		
		}
}
