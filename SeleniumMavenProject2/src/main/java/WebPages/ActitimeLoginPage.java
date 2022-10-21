package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtility;

public class ActitimeLoginPage extends SeleniumUtility {
	WebDriver driver;
	public ActitimeLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement usernameInput;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
		
	
  public void loginInActitime(String username,String password) {
	  typeInput(usernameInput,"admin");
	  typeInput(passwordInput,"manager");
	  clickOnElement(loginButton);
	  
  }
}
