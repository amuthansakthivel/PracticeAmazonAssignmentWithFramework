package com.companyname.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.companyname.browser.Browser;


public class BaseTest {
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		Browser.initialise();
	}
	
	@AfterMethod
	public void tearDown() {
		Browser.quitBrowser();
	}
	
	

}
