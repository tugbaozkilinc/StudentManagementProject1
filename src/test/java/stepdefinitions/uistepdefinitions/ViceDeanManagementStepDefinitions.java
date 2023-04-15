package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.MainMenu;
import pages.ViceDeanManagement;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ViceDeanManagementStepDefinitions extends AbstractClassVerifyingThePage {

    ViceDeanManagement viceDeanManagement = new ViceDeanManagement();
    MainMenu mainMenu = new MainMenu();
    HomePage homePage = new HomePage();
    @Given("user is navigated to dean page")
    public void user_is_navigated_to_dean_page() {
        verifyingYouAreInCorrectPage(viceDeanManagement.user);
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
        verifyingYouAreInCorrectPage(viceDeanManagement.viceDeanManagementPage);
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
    public void verifyingYouAreInCorrectPage(WebElement pageWebElement) {
          assertTrue(pageWebElement.isDisplayed());
    }

    @And("user enters the invalid values {string} in date of birth text box")
    public void userEntersTheInvalidValuesInDateOfBirthTextBox(String arg0) {
        viceDeanManagement.dateOfBirth.sendKeys("17Mart", Keys.TAB, arg0);
    }

    @Then("user sees the warning message {string}")
    public void userSeesTheWarningMessage(String arg0) {
        assertTrue(ReusableMethods.waitForVisibility(viceDeanManagement.dateOfBirthErrorMessage, 10).getText().contains(arg0));
    }

    @When("user enters the invalid value phone in the phone text box and sees message under phone text box")
    public void user_enters_the_invalid_value_phone_in_the_phone_text_box_and_sees_message_under_phone_text_box(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> w : data){
            viceDeanManagement.phoneNumberTextBox.sendKeys(w.get("phone"));
            assertEquals(w.get("message"), viceDeanManagement.phoneMinimumOnIkiCharacterMessage.getText());
        }
    }

    @And("user enters the invalid values {string} in the phone text box")
    public void userEntersTheInvalidValuesInThePhoneTextBox(String arg0) {
        viceDeanManagement.phoneNumberTextBox.sendKeys(arg0);
    }

    @Then("user sees the warning message {string} related to phone text box")
    public void userSeesTheWarningMessageRelatedToPhoneTextBox(String arg0) {
        assertEquals(arg0, ReusableMethods.waitForVisibility(viceDeanManagement.phoneInvalidMessage, 10).getText());
    }

    @When("user enters the invalid value ssn in the ssn text box and sees message under ssn text box")
    public void user_enters_the_invalid_value_ssn_in_the_ssn_text_box_and_sees_message_under_ssn_text_box(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> w : data){
            viceDeanManagement.SSNTextBox.sendKeys(w.get("ssn"));
            assertEquals(w.get("message"), ReusableMethods.waitForVisibility(viceDeanManagement.ssnMinimumOnBirCharacterMessage, 10).getText());
        }
    }

    @And("user enters the invalid values {string} in the ssn text box")
    public void userEntersTheInvalidValuesInTheSsnTextBox(String arg0) {
        viceDeanManagement.SSNTextBox.sendKeys(arg0);
    }

    @Then("user sees the warning message {string} related to ssn text box")
    public void userSeesTheWarningMessageRelatedToSsnTextBox(String arg0) {
        assertEquals(arg0, ReusableMethods.waitForVisibility(viceDeanManagement.ssnInvalidMessage, 10).getText());
    }

    @When("user enters the invalid value password in the password text box and sees message under password text box")
    public void user_enters_the_invalid_value_password_in_the_password_text_box_and_sees_message_under_password_text_box(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> w : data){
            viceDeanManagement.passwordTextBox.sendKeys(w.get("password"));
            assertEquals(w.get("message"), ReusableMethods.waitForVisibility(viceDeanManagement.passwordInvalidMessage, 10).getText());
        }
    }

}
