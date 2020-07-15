package com.ndtv.openweathermap.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.NDTVHomePage;
import POM.WeatherPage;

public class ReusableMethods {

	NDTVHomePage homePage;
	WeatherPage weatherPage;
	
	public void implicitWait(int i) {
		Driver.driver.manage().timeouts().implicitlyWait(i*10, TimeUnit.SECONDS);
	}
	
	public void visibilityOfElement() {
		homePage=new NDTVHomePage();
		WebElement wb=homePage.getPopup();
		WebDriverWait wait= new WebDriverWait(Driver.driver, 20);
		
		try {
		if(wait.until(ExpectedConditions.visibilityOf(wb)).isDisplayed()) {
			homePage.getClickonNoThanksLink().click();
		}
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	public void elementToBeClickAble() throws InterruptedException {
		homePage=new NDTVHomePage();
		weatherPage=new WeatherPage();
		WebDriverWait wait= new WebDriverWait(Driver.driver, 20);
		WebElement wb1=wait.until(ExpectedConditions.elementToBeClickable(homePage.getClickOnSubMenu()));
		wb1.click();
		Thread.sleep(2000);
		weatherPage.getClickONWeatherTab().click();
		}
	
	public void enterPinYourCity() throws InterruptedException {
		weatherPage=new WeatherPage();
		weatherPage.setSearchPinYourCity("Ben");
		Driver.driver.findElement(By.xpath("//div[contains(@title,'Ben')]/span/following-sibling::div[2]")).click();
		
	}
	
	
}
