package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://adept-stage-306721.web.app/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@shahdol.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"btn-next\"]")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
