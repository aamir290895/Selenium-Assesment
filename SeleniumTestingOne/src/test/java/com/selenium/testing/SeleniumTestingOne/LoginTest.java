package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	static WebDriver driver;
	
	
	
	


	@Test
	public static void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@shahdol.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("[name='login']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
