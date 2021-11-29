package com.makemytrip.testing.MakeMyTripTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 *
 */
public class App 
{
	
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
		
		
    	driver = new ChromeDriver();
    	
    	driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("admin@shahdol.com");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.className("\"landingContainer\"")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
		
    	
        System.out.println( "Hello World!" );
    }
    
    public void test1() throws InterruptedException {
    	

    }
}
