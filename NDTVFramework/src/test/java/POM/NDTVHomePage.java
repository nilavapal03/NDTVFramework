package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.ndtv.openweathermap.Utils.Driver;

public class NDTVHomePage {

	public NDTVHomePage() {
		PageFactory.initElements(Driver.driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='noti_wrap']")
	private WebElement popup;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'No Thanks')]")
	private WebElement clickonNoThanksLink;
	
	@FindBy(how=How.ID,using="h_sub_menu")
	private WebElement clickOnSubMenu;

	
	
	public WebElement getClickOnSubMenu() {
		return clickOnSubMenu;
	}

	public WebElement getClickonNoThanksLink() {
		return clickonNoThanksLink;
	}
	
	public WebElement getPopup() {
		return popup;
	}

	
	
	
}
