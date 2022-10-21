package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerContactCreation extends SeleniumUtility {
    WebDriver driver ;
    public VtigerContactCreation(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[@class='app-icon fa fa-bars']")
    private WebElement clickOnDashboard;
    
    @FindBy(id="MARKETING_modules_dropdownMenu")
    private WebElement clickOnMarketing;
    
    @FindBy(xpath="//a[@title='Contacts']/span[2]")
    private WebElement clickOnContact;
    
    @FindBy(xpath="//button[@id='Contacts_listView_basicAction_LBL_ADD_RECORD']")
    private WebElement clickOnCreateContact;
    
    @FindBy(xpath="//input[@id='Contacts_editView_fieldName_firstname']")
    private WebElement firstNameInput;
    
    @FindBy(xpath="//input[@id='Contacts_editView_fieldName_lastname']")
    private WebElement lastNameInput;
    
    @FindBy(xpath="//button[@class='btn btn-success saveButton']")
    private WebElement clickOnSave;
    
    @FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
    private WebElement clickOnDropdown;
    
    @FindBy(xpath="//li[@id='Contacts_detailView_moreAction_Delete_Contact']/a")
    private WebElement deleteContact;
    
    @FindBy(xpath="//div[@class='modal-footer']/button[2]")
    private WebElement clickOnPopup;
    
    @FindBy(xpath="//a[@title='Balasaheb Supekar']")
    private WebElement checkContactCreated;
    
    public void contactCreation(String firstname,String lastname) {
    	clickOnElement(clickOnDashboard);
    	clickOnElement(clickOnMarketing);
    	clickOnElement(clickOnContact);
    	typeInput(firstNameInput,firstname);
    	typeInput(lastNameInput,lastname);
    	clickOnElement(clickOnSave);
    	
    }  
	public boolean checkContactCreation() {
	
		return isElementExist(checkContactCreated);
	}
	 public void deleteCreatedContact() {
	    	clickOnElement(clickOnDropdown);
	    	clickOnElement(deleteContact);
	    	clickOnElement(clickOnPopup);
	    } 
}
