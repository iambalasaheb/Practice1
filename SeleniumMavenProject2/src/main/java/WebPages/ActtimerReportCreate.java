package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ActtimerReportCreate extends SeleniumUtility {
	WebDriver driver;
	public ActtimerReportCreate(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement clickOnReport;
	
	@FindBy(xpath="//div[@id='ext-gen18']")
	private WebElement clickOnNewReport;
	
	@FindBy(xpath="//div[@class='configureButton components_button']")
	private WebElement clickOnConfigureReportPara;
	
	@FindBy(xpath="//td[@class='middle-left-cell contents customRightPart']")
	private WebElement clickOnCurrentMonth;
	
	
  @Test
  public void reportCreateActitime() {
	clickOnElement(clickOnReport);  
	clickOnElement(clickOnNewReport);  
	clickOnElement(clickOnConfigureReportPara);  
	clickOnElement(clickOnCurrentMonth);  

  }
}
