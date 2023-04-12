package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.MainMenu;
import pages.ViceDeanManagement;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ViceDeanManagementStepDefinitions extends AbstractVerifyingThePageClass{

    ViceDeanManagement viceDeanManagement = new ViceDeanManagement();
    MainMenu mainMenu = new MainMenu();
    HomePage homePage = new HomePage();
    @Given("user is navigated to dean page")
    public void user_is_navigated_to_dean_page() {
        assertTrue(viceDeanManagement.user.isDisplayed());
    }

    @When("user clicks on menu button in dean page")
    public void user_clicks_on_menu_button_in_dean_page() {
        homePage.menuButton.click();
    }

    @When("user clicks on vice dean management button in main menu")
    public void user_clicks_on_vice_dean_management_button_in_main_menu() {
        mainMenu.viceDeanManagement.click();
    }

    @When("user is navigated to vice dean management page")
    public void user_is_navigated_to_vice_dean_management_page() {
        assertTrue(viceDeanManagement.viceDeanManagementPage.isDisplayed());
    }

    @And("user enters the date of birth in date of birth text box")
    public void userEntersTheDateOfBirthInDateOfBirthTextBox() {
        viceDeanManagement.dateOfBirth.sendKeys("17Mart", Keys.TAB, "1990");
    }

    @When("user clicks on submit button on vice dean management page")
    public void user_clicks_on_submit_button_on_vice_dean_management_page() {
        viceDeanManagement.submitButton.click();
    }

    @Then("user verifies that vice dean is created by dean")
    public void user_verifies_that_vice_dean_is_created_by_dean() {
        assertTrue(ReusableMethods.waitForVisibility(viceDeanManagement.successfulMessage, 10).isDisplayed());
    }

    @Then("user closes the application")
    public void user_closes_the_application() {
        Driver.closeDriver();
    }

    @And("user enters the {string} in the name text box")
    public void userEntersTheInTheNameTextBox(String arg0) {
        viceDeanManagement.nameTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the surname text box")
    public void userEntersTheInTheSurnameTextBox(String arg0) {
        viceDeanManagement.surnameTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the birth place text box")
    public void userEntersTheInTheBirthPlaceTextBox(String arg0) {
        viceDeanManagement.birthPlaceTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in date of birth text box")
    public void userEntersTheInDateOfBirthTextBox(String arg0) {
        viceDeanManagement.dateOfBirth.sendKeys(arg0);
    }

    @And("user enters the {string} in the phone text box")
    public void userEntersTheInThePhoneTextBox(String arg0) {
        viceDeanManagement.phoneNumberTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the ssn text box")
    public void userEntersTheInTheSsnTextBox(String arg0) {
        viceDeanManagement.SSNTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the username text box")
    public void userEntersTheInTheUsernameTextBox(String arg0) {
        viceDeanManagement.usernameTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the password text box")
    public void userEntersTheInThePasswordTextBox(String arg0) {
        viceDeanManagement.passwordTextBox.sendKeys(arg0);
    }

    @Then("user verifies that the required text under {string} is visible on vice dean management page")
    public void userVerifiesThatTheRequiredTextUnderIsVisibleOnViceDeanManagementPage(String arg0) {
            assertTrue(viceDeanManagement.requiredTexts.get(Integer.parseInt(arg0)).isDisplayed());
    }

    @Override
    public void verifyingYouAreInCorrectPage() {

    }

}
