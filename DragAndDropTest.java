package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {
	
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mycab-202b5.web.app/");
		
		WebElement source = driver.findElement(By.id("ex2"));
		source.sendKeys("input2");
		Thread.sleep(1000);
		WebElement destination = driver.findElement(By.id("ex1"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
