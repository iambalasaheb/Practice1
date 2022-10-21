package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class ActitimeLogin extends SeleniumUtility {
  WebDriver driver;
  @Given("^user is on actitime login page$")
  public void user_is_on_actitime_login_page() {
	  driver=setUp("chrome","https://demo.actitime.com/login.do");
  }
  @When("^user enters username as (.+) in username field$")
  public void user_enters_username_as_in_username_field(String username) {
	  driver.findElement(By.id("username")).sendKeys(username);
  }
  @And("^user enters password as (.+) in password field$")
  public void user_enters_password_as_in_password_field(String password) {
	  driver.findElement(By.name("pwd")).sendKeys("password");
  }
  @And("^user click on login button$")
  public void user_click_on_login_button() {
	  driver.findElement(By.id("loginButton")).click();
  }
  @Then("^user should get title as (.+)$")
  public void user_should_get_title_as(String title) {
	  Assert.assertEquals(title, getCurrentTitleOfApplication(title),"title validation gone faild");
	  
  }
  @And("^close the browser$")
  public void close_the_browser() {
	  cleanUp();
  }
}
