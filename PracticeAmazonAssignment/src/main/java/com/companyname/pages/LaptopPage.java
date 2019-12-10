package com.companyname.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage extends BasePage {
	
	@FindBy(name="s-ref-checkbox-Apple")
	WebElement chkbox_apple;
	

	@FindBy(xpath="//span[contains(text(),'Sort by:')]")
	WebElement drpdwn_sortby;
	
	@FindBy(xpath="//li/a[contains(text(),'Price: High to Low')]")
	WebElement btn_hightolow;
	
	public LaptopPage chooseAppleFilter() {
		click(chkbox_apple);
		return this;
	}
	
	public LaptopPage sortByPrice() {
		click(drpdwn_sortby);
		click(btn_hightolow);
		return this;
	}
	
}
