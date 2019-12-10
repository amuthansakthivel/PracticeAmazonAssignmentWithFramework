package com.companyname.browser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.companyname.constants.Constants;
import com.companyname.utils.JsonParser;

public class Browser {

	public static WebDriver driver;
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
		if(driver!=null) {
			driver.quit();
		}
	}
	
	private static void loadURL() throws IOException {
		driver.get(JsonParser.getValue("config.global.url"));
	}
	
	
	private static void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICITWAITTIME, TimeUnit.SECONDS);
	}

	private static void maximise() {
		driver.manage().window().maximize();
		
	}


}
