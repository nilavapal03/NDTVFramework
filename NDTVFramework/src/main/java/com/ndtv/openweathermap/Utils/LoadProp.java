package com.ndtv.openweathermap.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class LoadProp {

	 Properties prop;
	 FileInputStream input;
	public  String testData="./resourcesLib/configFile/config.properties";
	public String getProperty(String key) {
		prop= new Properties();
		try {
			input= new FileInputStream(testData);
			prop.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
		
		
		
		
		
		
		
	}
}
