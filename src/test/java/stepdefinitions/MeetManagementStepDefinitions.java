package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenu;
import pages.MeetManagement;
import utilities.ConfigReader;

import static org.junit.Assert.assertTrue;

public class MeetManagementStepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MeetManagement meetManagement=new MeetManagement();

    @Given("User navigates to the specified URL")
    public void user_navigates_to_the_specified_url() {
homePage.loginButton.click();
    }
    @When("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
homePage.loginButton.click();

    }
    @When("User enters the {string} in the username textbox")
    public void user_enters_the_in_the_username_textbox(String string) {
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty(" teacher username"));
    }
    @When("User enters the {string} in the password textbox")
    public void user_enters_the_in_the_password_textbox(String string) {
loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("teacher password"));
    }
    @When("User clicks the Login button")
    public void user_clicks_the_login_button() {
loginPage.submitLoginButton.click();
    }
    @When("User clicks the Menu button")
    public void user_clicks_the_menu_button() {
homePage.menuButton.click();
    }
    @When("User clicks the Meet Management button on the menu")
    public void user_clicks_the_meet_management_button_on_the_menu() {
        meetManagement.addMeetText.click();
    }
    @When("User sees that the Meet Management page is displayed")
    public void user_sees_that_the_meet_management_page_is_displayed() {
        //assertTrue(MeetManagement.isDisplayed();
    }
    @Then("User sees that the Add Meet section is displayed on the page")
    public void user_sees_that_the_add_meet_section_is_displayed_on_the_page() {

    }
}
