package com.selenium.testing.SeleniumTestingOne;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mycab-202b5.web.app/");
		
		List<WebElement> wb = driver.findElements(By.tagName("h1"));
		
		for(int i =0 ;i<wb.size() ;i++) {
			WebElement w = wb.get(i);
			System.out.println(w.getText());
		}
		
		
	}

}
