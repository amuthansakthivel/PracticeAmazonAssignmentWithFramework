package com.companyname.utils;

public class DynamicXpath {
	
	
	public static String getDynamicXpath(String xpath,String value) {
		
		return xpath.replace("%replaceable%", value);
	
	}
	
public static String getDynamicXpath(String xpath,String value1, String value2) {
		
		return xpath.replace("%replaceable1%", value1).replace("%replaceable2%", value2);
	
	}
	
	

}
