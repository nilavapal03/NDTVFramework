package com.ndtv.openweathermap.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver driver;

	public static  WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "Chrome":
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		default:
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			break;
		}

		return driver;

	}

}
