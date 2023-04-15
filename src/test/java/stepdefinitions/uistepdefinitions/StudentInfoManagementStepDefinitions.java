package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenu;
import pages.StudentInfoManagement;
import utilities.ConfigReader;
import utilities.Driver;

public class StudentInfoManagementStepDefinitions {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    MainMenu mainMenu=new MainMenu();
    StudentInfoManagement studentInfoManagement=new StudentInfoManagement();

    @Given("User navigates to the specified URL")
    public void user_navigates_to_the_specified_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters the {string} in the username textbox")
    public void user_enters_the_in_the_username_textbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters the {string} in the password textbox")
    public void user_enters_the_in_the_password_textbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks the Login button")
    public void user_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks the Menu button")
    public void user_clicks_the_menu_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks the Student Info Management button on the menu")
    public void user_clicks_the_student_ınfo_management_button_on_the_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User sees that the Student Info Management page is displayed")
    public void user_sees_that_the_student_ınfo_management_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User sees that the Add Student Info is displayed on the page")
    public void user_sees_that_the_add_student_ınfo_is_displayed_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
