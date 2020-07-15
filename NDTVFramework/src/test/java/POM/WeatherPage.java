package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ndtv.openweathermap.Utils.Driver;

public class WeatherPage {
	
	
	public WeatherPage() {
		PageFactory.initElements(Driver.driver, this);
		
	}

	


	@FindBy(how=How.LINK_TEXT,using="WEATHER")
	private WebElement clickONWeatherTab;
	
	@FindBy(how=How.ID,using="searchBox")
	private WebElement searchPinYourCity;
	
	@FindBy(how=How.XPATH,using="//div[contains(@title,'Ben')]/span/following-sibling::div[2]")
	private WebElement clickOnYourPinCity;
	
	public WebElement getClickOnYourPinCity() {
		return clickOnYourPinCity;
	}

	
public WebElement getSearchPinYourCity() {
		return searchPinYourCity;
	}

	public WebElement getClickONWeatherTab() {
		return clickONWeatherTab;
	}
	
	public void setSearchPinYourCity(String enterCity) throws InterruptedException {
		WebElement wb=getSearchPinYourCity();
		WebDriverWait wait = new WebDriverWait(Driver.driver, 30);
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		Thread.sleep(3000);
		wb1.sendKeys(enterCity);
	}

}
