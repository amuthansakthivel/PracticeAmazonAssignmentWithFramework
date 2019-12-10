package com.companyname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	
	
	
	//id
	//name
	//class name
	//css
	//xpath
	

	@FindBy(id="nav-hamburger-menu")
	WebElement btn_hamburger;
	
	//div[contains(text(),'Mobiles, Computers')]/..
	@FindBy(xpath="//div[contains(text(),'Mobiles, Computers')]/parent::a")
	WebElement lnk_mobilesandcomputers;
	
	
	@FindBy(xpath="//div[contains(text(),'Laptops')]/parent::a")
	WebElement lnk_laptops;
	
	public HomePage clickHamburgerMenu() {
		click(btn_hamburger);
		return this;
	}
	
	
	//Whenever you are creating a new object it will call the constructor of that class.
	//If that class is a sub class, then the base class contructor will also be called.

	public LaptopPage navigateToLaptopPage() {
		click(lnk_mobilesandcomputers);
		click(lnk_laptops);
		return new LaptopPage();
	}
	

}
