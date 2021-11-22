package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonSelection {
	
	
	@Test
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mycab-202b5.web.app/");
		
		Thread.sleep(1000);
		WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"html\"]"));
		radioBtn.click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
