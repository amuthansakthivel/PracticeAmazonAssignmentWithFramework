package com.companyname.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.companyname.browser.Browser;
import com.companyname.browser.DriverManager;
import com.companyname.pageelements.HomePageElements;
import com.companyname.utils.DynamicXpath;

public class HomePage extends BasePage{
	

	//id
	//name
	//class name
	//css
	//xpath
	

	@FindBy(id="nav-hamburger-menu")
	private WebElement btn_hamburger;
	
	
	//div[contains(text(),'Mobiles, Computers')]/..
	@FindBy(xpath="//div[contains(text(),'Mobiles, Computers')]/parent::a")
	private WebElement lnk_mobilesandcomputers;
	
	
	@FindBy(xpath="//div[contains(text(),'Laptops')]/parent::a")
	private WebElement lnk_laptops;
	
	//stale element reference exception
	//lazy loading
	//it will constant values
	//you cannot parameterise
	//It will only return webelement
	//For other scenarios you anyways have to use By and String which you can directly use
	
	
	private static By btn_hamburgerby=By.id("nav-hamburger-menu");
	private static String hamburgerid="nav-hamburger-menu";
	//%replaceble%
	
	private static String links="//span[text()='%replaceble%']/parent::a";
	private static String links1="//span[text()='%replaceble1%']/parent::%replaceable2%";
	
	//span[text()='Cribs']/parent::a
	
	public HomePage clickHamburgerMenu() {
		//DriverManager.getDriver().findElement(btn_hamburgerby).click(); // using By class
		//DriverManager.getDriver().findElement(By.id(hamburgerid)).click();
		click(btn_hamburger);
		click(HomePageElements.btn_hamburgerby);
		return this;
	}
	
	
	//Whenever you are creating a new object it will call the constructor of that class.
	//If that class is a sub class, then the base class contructor will also be called.

	public LaptopPage navigateToLaptopPage() {
		
		click(lnk_mobilesandcomputers);
		click(lnk_laptops);
		return new LaptopPage();
	}
	
	public void clickCribs() {
		DriverManager.getDriver().findElement(By.xpath(links.replace("%replaceble%", "Cribs"))).click();
		DriverManager.getDriver().findElement(By.xpath(DynamicXpath.getDynamicXpath(links1, "Cribs", "a"))).click();
	}
	
	public void clickDatabase() {
		DriverManager.getDriver().findElement(By.xpath(DynamicXpath.getDynamicXpath(links, "Cribs"))).click();
	}
	
	
	

}
