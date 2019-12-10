package com.companyname.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.companyname.browser.Browser;
import com.companyname.constants.Constants;

public class BasePage {
	
	protected BasePage() {
		PageFactory.initElements(Browser.driver, this);
	}

	
	protected static void click(WebElement element) {
		explicitlyWait(element);
		element.click();
	}

	//ctrl+D ---> To delete a line
	private static void explicitlyWait(WebElement element) {
		WebDriverWait wait= new WebDriverWait(Browser.driver,Constants.EXPLICITWAITTIME);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	protected static void sendKeys(WebElement element,String text) {
		explicitlyWait(element);
		element.sendKeys(text);
	}
	
	
}
