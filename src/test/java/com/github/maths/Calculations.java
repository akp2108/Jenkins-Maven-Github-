package com.github.maths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Calculations {
	
	private WebDriver driver;
	
  @Test
  public void addition() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("http://docs.seleniumhq.org/");
	  
	  String sTitle = driver.getTitle();
	  System.out.println(sTitle);
	  
	  driver.quit();
	  
  }
  
}
