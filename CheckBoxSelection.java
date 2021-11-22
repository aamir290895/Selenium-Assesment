package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxSelection {
	
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://firebasestorage.googleapis.com/v0/b/mycab-202b5.appspot.com/o/certificate.pdf?alt=media&token=86dd169f-f0eb-4064-b961-2084b86fa82d");		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
		element.click();
		Thread.sleep(1000);
	    driver.close();
		
	}

}
