package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class LoginForOrangeHrm extends SeleniumUtility{
	WebDriver driver;
	public LoginForOrangeHrm(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameField;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginButton;
	
	
  @Test
  public void orangeHrmLogin(String username, String password) {
	  typeInput(usernameField,username);
	  typeInput(passwordField,password);
	  clickOnElement(loginButton);
  }
}
