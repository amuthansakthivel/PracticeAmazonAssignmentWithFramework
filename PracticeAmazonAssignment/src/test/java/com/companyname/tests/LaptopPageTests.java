package com.companyname.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.companyname.pages.HomePage;
import com.companyname.pages.LaptopPage;

public class LaptopPageTests extends BaseTest{
	
	HomePage homepage;
	LaptopPage laptoppage;
	
	@Test
	public void test1() throws IOException {
		homepage= new HomePage();
		laptoppage=homepage.clickHamburgerMenu().navigateToLaptopPage();
		laptoppage.chooseAppleFilter().sortByPrice();
	}
	
	/*
	@Test
	public void test2() throws IOException {
		homepage= new HomePage();
		laptoppage=homepage.clickHamburgerMenu().navigateToLaptopPage();
		laptoppage.chooseAppleFilter().sortByPrice();
	}

	
	@Test
	public void test3() throws IOException {
		homepage= new HomePage();
		laptoppage=homepage.clickHamburgerMenu().navigateToLaptopPage();
		laptoppage.chooseAppleFilter().sortByPrice();
	}
*/

}
