package com.selenium.testing.SeleniumTestingOne;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest {
	
	private static WebDriver driver;
	
	@BeforeMethod
	public static void startDriver() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
	}
	
	@Test
	public static void dragAndDrop() throws InterruptedException {
	
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable'][1]"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		
		Thread.sleep(1000);
		
		
		
		
	}
	
	@AfterMethod
	public static void closeDriver() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	

}
