package OrangeHRM18;

import PageObject.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import static OrangeHRM18.BasePage.driver;

public class RegisterStepefs {
    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage()  {


    }

    @Then("^I should not able to log in successfully$")
    public void i_should_not_able_to_log_in_successfully()  {

        Assert.assertTrue(driver.findElement(By.id("spanMessage")).isDisplayed(),"User has been logged in with invalid credentials");
    }

    @When("^I enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInvalidAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.enterLogInCredentials(arg0,arg1);
    }

    @When("^I enter valid credentia ls$")
    public void iEnterValidCredentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

//    @When("^I enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void iEnterInvalidAnd(String username, String password) {
//        homePage.enterLogInCredentials(username, password);
//
//    }
}
