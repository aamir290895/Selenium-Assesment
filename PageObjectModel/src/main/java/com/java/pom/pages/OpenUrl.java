package com.java.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrl {
	static WebDriver driver = null ;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		search(driver);
	}
	

	
	public static WebElement search(WebDriver driver) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rgpv.ac.in/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"alert-modal\"]/div/div/div[1]/a/i"));
		Thread.sleep(2000);
		element.click();
		return element;
		
	}
	public static void go() {
		System.out.println("hello");
	}
	

	
}
