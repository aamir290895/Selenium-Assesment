package com.makemytrip.testing.MakeMyTripTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class TripTest {
	
	@Test
	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        WebElement elementPopup =driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]"));
        elementPopup.click();
        
		WebElement element = driver.findElement(By.xpath("//li[@data-cy ='roundTrip']//span"));
		element.click();
		
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//li[@data-cy ='mulitiCityTrip']//span")).click();
//		
	     Actions action=new Actions(driver);
		 driver.findElement(By.id("fromCity")).click();
	     action.sendKeys("Mumbai").perform();
	  

		 action.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		
//		driver.findElement(By.id("fromCity")).click();
////		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
	    driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-2\"]/div/div[1]/p[1]")).click();
//		action.sendKeys(Keys.ENTER).perform();

				
		
		Thread.sleep(1000);
	    driver.close();
		
		
	}
	
	
	@Test
	void webDriver() {
		WebDriverStart driver = new WebDriverStart();
		driver.readyDriver();
	}

	
	@Test
	void dateSelector() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		
	}
		
	}


