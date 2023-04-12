package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ViceDeanManagement;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ViceDeanManagementStepDefinitions {

    ViceDeanManagement deanHomePage = new ViceDeanManagement();


    @Given("user is navigated to dean page")
    public void user_is_navigated_to_dean_page() {
        assertTrue(deanHomePage.user.isDisplayed());
    }

    @When("user clicks on menu button in dean page")
    public void user_clicks_on_menu_button_in_dean_page() {
        //deanHomePage.menuButton.click();
    }

    @When("user clicks on vice dean management button in main menu")
    public void user_clicks_on_vice_dean_management_button_in_main_menu() {
        //deanHomePage.viceDeanManagementButton.click();
    }

    @When("user is navigated to vice dean management page")
    public void user_is_navigated_to_vice_dean_management_page() {
        //assertTrue(deanHomePage.viceDeanManagementPage.isDisplayed());
    }

    @And("user enters the date of birth in date of birth text box")
    public void userEntersTheDateOfBirthInDateOfBirthTextBox() {
        deanHomePage.dateOfBirth.sendKeys("17Mart", Keys.TAB, "1990");
    }

    @When("user clicks on submit button on vice dean management page")
    public void user_clicks_on_submit_button_on_vice_dean_management_page() {
        deanHomePage.submitButton.click();
    }

    @Then("user verifies that vice dean is created by dean")
    public void user_verifies_that_vice_dean_is_created_by_dean() {
        assertTrue(ReusableMethods.waitForVisibility(deanHomePage.successfulMessage, 10).isDisplayed());
    }

    @Then("user closes the application")
    public void user_closes_the_application() {
        Driver.closeDriver();
    }

    @Then("user verifies that the required text under name text box is visible on vice dean management page")
    public void userVerifiesThatTheRequiredTextUnderNameTextBoxIsVisibleOnViceDeanManagementPage() {
        assertTrue(deanHomePage.nameRequiredText.isDisplayed());
    }

    @Then("user verifies that the required text under surname text box is visible on vice dean management page")
    public void userVerifiesThatTheRequiredTextUnderSurnameTextBoxIsVisibleOnViceDeanManagementPage() {
        assertTrue(deanHomePage.surnameRequiredText.isDisplayed());
    }

    @Then("user verifies that the required text under birth place text box is visible on vice dean management page")
    public void userVerifiesThatTheRequiredTextUnderBirthPlaceTextBoxIsVisibleOnViceDeanManagementPage() {
    }

    @Then("user verifies that the required text under date of birth text box is visible on vice dean management page")
    public void userVerifiesThatTheRequiredTextUnderDateOfBirthTextBoxIsVisibleOnViceDeanManagementPage() {
        assertTrue(deanHomePage.dateOfBirthRequiredText.isDisplayed());
    }

}
