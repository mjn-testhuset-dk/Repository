package com.testhuset.DemoApp;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test 
	public void startWebDriver(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://seleniumsimplified.com");
		Assert.assertTrue("Title should start differently",  
			driver.getTitle().startsWith("Selenium Simplified"));
		driver.close(); 
	} 

}
