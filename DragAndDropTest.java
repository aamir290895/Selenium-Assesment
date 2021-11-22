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
		driver.get("https://adept-stage-306721.web.app/");
		
		WebElement source = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/label"));
		WebElement destination = driver.findElement(By.id("email"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
