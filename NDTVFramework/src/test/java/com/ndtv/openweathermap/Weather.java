package com.ndtv.openweathermap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ndtv.openweathermap.Utils.Driver;
import com.ndtv.openweathermap.Utils.LoadProp;
import com.ndtv.openweathermap.Utils.ReusableMethods;

public class Weather {
	
	LoadProp load= new LoadProp();
	ReusableMethods reuse= new ReusableMethods();
	
	@BeforeTest
	public void setUp() {
		Driver.launchBrowser(load.getProperty("Browser"));
		}
	
	@Test
	public void launchApplication() throws InterruptedException {
		Driver.driver.get(load.getProperty("NDTV_URL"));
		JavascriptExecutor js= (JavascriptExecutor)Driver.driver;
		String ready=(String)js.executeScript("return document.readyState");
		System.out.println("Page is "+ready);
		reuse.implicitWait(2);
		reuse.visibilityOfElement();
		reuse.elementToBeClickAble();
		reuse.enterPinYourCity();
		
		}
}
	
