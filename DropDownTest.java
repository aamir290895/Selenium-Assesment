package com.selenium.testing.SeleniumTestingOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {
	    private static WebDriver driver; 
	
	    @BeforeMethod
	    public static void startDriver() {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
	    	
	    	
	    }
	  

	    @Test
	    public static void dynamicDropDown() throws InterruptedException{
	    	
	    	WebElement popup=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]"));
	    	popup.click();
	     	WebElement selectTrip = driver.findElement(By.xpath("//li[@data-cy ='roundTrip']//span"));
			selectTrip.click();
			Thread.sleep(2000);
            WebElement e1 = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
	    	e1.sendKeys("Jabalpur");
	    	Thread.sleep(1000);
	    	List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("//div[@class=\"calc60\"]"));
//	        List<WebElement>list=driver.findElements(By.cssSelector("p[class=\"font14 appendBottom5 blackText\"]"));
	    	Select select = new Select((WebElement) list);
    		select.selectByValue("Jabalpur,India");
	    	for(int i = 0; i<list.size();i++) {
	    		String city = list.get(i).getText();
	    	
	    		
	    		break;
	    	}
	    }
}
