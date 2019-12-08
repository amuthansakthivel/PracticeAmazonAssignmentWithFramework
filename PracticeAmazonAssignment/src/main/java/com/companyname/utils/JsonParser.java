package com.companyname.utils;

import java.io.File;
import java.io.IOException;

import com.companyname.constants.Constants;
import com.jayway.jsonpath.JsonPath;

public class JsonParser {
	
	
	public static String getValue(String path) throws IOException {
		
		File jsonFile= new File(Constants.JSONCONFIGPATH);
		
		return JsonPath.read(jsonFile,"$."+path);
		
	}

}
