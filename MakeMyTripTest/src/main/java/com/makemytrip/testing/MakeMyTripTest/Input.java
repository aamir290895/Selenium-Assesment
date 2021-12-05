package com.makemytrip.testing.MakeMyTripTest;

import org.openqa.selenium.interactions.Actions;

public class Input {
	
  public void inputText(Actions action , String s) {
	  
    action.sendKeys(s).perform();  
  }
	
}
