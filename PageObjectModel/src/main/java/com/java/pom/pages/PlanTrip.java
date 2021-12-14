package com.java.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PlanTrip {

	public static OpenUrl open;

	public static WebDriver wDriver;

	@Test
	public static void main(String[] args) throws InterruptedException {

		closeNotice();

	}

	@Test
	public static void closeNotice() throws InterruptedException {
		wDriver = open.driver();
		WebElement element1 = wDriver
				.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport' ])[1]"));
		element1.sendKeys("Jabalpur");
		Thread.sleep(3000);

	   
	    Select jabalpur = new Select(wDriver.findElement(By.xpath("//p[@class = \"to-ellipsis o-hidden ws-nowrap c-inherit fs-3\"]")));
//		List<WebElement> list = wDriver.findElement(By.xpath(
//				"//p[@class = \"to-ellipsis o-hidden ws-nowrap c-inherit fs-3\"][contains(text(),"Jabalpur, IN - Jabalpur (JLR)")]"))
//				.findElements(By.tagName("li"));
//		for(int i=0; i<list.size();i++) {
//			list.get(0).click();
//		}
	   jabalpur.selectByIndex(0);
	}
}
