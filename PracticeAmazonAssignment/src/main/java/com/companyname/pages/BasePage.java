package com.companyname.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.companyname.browser.Browser;
import com.companyname.browser.DriverManager;
import com.companyname.constants.Constants;

public class BasePage {

	protected BasePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	

	//Method Overloading
	
	protected static void click(WebElement element) {
		explicitlyWait(element);
		element.click();
	}

	protected static void click(By by) {
		click(DriverManager.getDriver().findElement(by));
		/*explicitlyWait(by);
		Browser.driver.findElement(by).click();*/
	}

	protected static void click(String locator, String usinglocator) {
		/*if(usinglocator.equalsIgnoreCase("id")) {
			click(Browser.driver.findElement(By.id(locator)));
			click(By.id(locator));
		}*/
		click(By.id(locator));
	
	}

	//ctrl+D ---> To delete a line
	private static void explicitlyWait(WebElement element) {
		WebDriverWait wait= new WebDriverWait(DriverManager.getDriver(),Constants.EXPLICITWAITTIME);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected static void sendKeys(WebElement element,String text) {
		explicitlyWait(element);
		element.sendKeys(text);
	}

	/*
	 * 
	 * 
	 * String - grand child
By - parent
WebElement - Grand Parent  ---->Click ,sendkeys


Forming webelement from by
driver.findelement(by)

Forming By class from String
By.id(String)
By.classname(String)

Forming WebElement from String
driver.findElement(By.id(String))
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */


}
