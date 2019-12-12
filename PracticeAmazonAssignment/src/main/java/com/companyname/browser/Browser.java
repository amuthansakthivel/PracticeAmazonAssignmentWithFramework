package com.companyname.browser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.companyname.constants.Constants;
import com.companyname.utils.JsonParser;

public class Browser {

	private static WebDriver driver;
	//single- ton class ------> Single object class --->It will not allow you to create more than one object

	private Browser() throws IOException {

		String browser=JsonParser.getValue("config.global.browser");
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVERPATH);
			driver = new ChromeDriver(); //Ctrl+Shift+O
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", Constants.GECKODRIVERPATH);
			driver = new FirefoxDriver(); //Ctrl+Shift+O	
		}
		else {
			System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVERPATH);
			driver = new ChromeDriver(); //Ctrl+Shift+O
		}
		DriverManager.setDriver(driver);
		//modularise the codes
		loadURL();
		maximise();
		setImplicitWait();
		
		
	}

	
	public static void initialise() throws IOException {
		if(driver==null) {
			new Browser(); //anonymous object    //Ctrl+A  //Ctrl+I
		}
	}

	public static void quitBrowser() {
		if(DriverManager.getDriver()!=null) {
			DriverManager.getDriver().quit();
		}
	}
	
	private static void loadURL() throws IOException {
		DriverManager.getDriver().get(JsonParser.getValue("config.global.url"));
	}
	
	
	private static void setImplicitWait() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICITWAITTIME, TimeUnit.SECONDS);
	}

	private static void maximise() {
		DriverManager.getDriver().manage().window().maximize();
		
	}


}
