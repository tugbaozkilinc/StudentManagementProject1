package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenu;
import pages.MeetManagement;
import utilities.ReusableMethods;

import java.util.Locale;

import static utilities.ReusableMethods.*;

public class MeetManagementStepDefinitions {

    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    MainMenu mainMenu = new MainMenu();

    MeetManagement meetManagement = new MeetManagement();

    Faker faker = new Faker(Locale.US);

    @When("User clicks the Meet Management button on the menu")
    public void user_clicks_the_meet_management_button_on_the_menu() {
        waitFor(2);
        mainMenu.meetManagement.click();

    }

    @When("User sees that the Meet Management page is displayed")
    public void user_sees_that_the_meet_management_page_is_displayed() {
        Assert.assertTrue(meetManagement.addMeetText.isDisplayed());

    }

    @Then("User sees that the Add Meet section is displayed on the page")
    public void user_sees_that_the_add_meet_section_is_displayed_on_the_page() {
        Assert.assertTrue(meetManagement.addMeetText.isDisplayed());

    }

    @When("User choses the Student from the Choose Student dropdown")
    public void user_choses_the_student_from_the_choose_student_dropdown() {
        waitFor(2);
        meetManagement.chooseStudentTextBox.click();

       Select select = new Select(meetManagement.chooseStudentTextBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @When("User enters the {string} in the Date of Meet textbox")
    public void user_enters_the_in_the_date_of_meet_textbox(String string) {
        meetManagement.dateOfMeetTextBox.sendKeys(string);

    }

    @When("User enters the {string} in the start time textbox")
    public void user_enters_the_in_the_start_time_textbox(String string) {
        meetManagement.startTimeTextBox.sendKeys(string);

    }

    @When("User enters the {string} in the start stop textbox")
    public void user_enters_the_in_the_start_stop_textbox(String string) {
        meetManagement.stopTimeTextBox.sendKeys(string);

    }

    @When("User enters the {string} in the Description textbox")
    public void user_enters_the_in_the_description_textbox(String string) {
        meetManagement.descriptionTextBox.sendKeys(string);

    }

    @When("User clicks the Submit button on the menu")
    public void user_clicks_the_submit_button_on_the_menu() {
        meetManagement.submitButton.click();
    }

    @When("User sees that the green confirmation {string} text appeared on the page")
    public void user_sees_that_the_green_confirmation_text_appeared_on_the_page(String string) {
        waitForVisibility(meetManagement.alertMessage, 3);
        Assert.assertEquals("Meet Saved Successfully", meetManagement.alertMessage.getText());


    }

    @Then("User sees that the created student is visible on the Meet List section on the page")
    public void user_sees_that_the_created_student_is_visible_on_the_meet_list_section_on_the_page() {
        meetManagement.addMeetText.isDisplayed();
       // int lastIndex = meetManagement.meetListOnCurrentPage.size();
       // Assert.assertEquals("", meetManagement.meetListOnCurrentPage.get(0).getText());
    }

    @When("User choses the {string} from the Choose Student dropdown")
    public void user_choses_the_from_the_choose_student_dropdown(String string) {
        meetManagement.chooseStudentTextBox.sendKeys(string);
    }

    @When("User leaves blank in the {string} textbox")
    public void user_leaves_blank_in_the_textbox(String string) {
        meetManagement.chooseStudentTextBox.sendKeys();

    }

    @Then("User sees that the Meet List section is displayed on the page")
    public void user_sees_that_the_meet_list_section_is_displayed_on_the_page() {
        meetManagement.addMeetText.isDisplayed();

    }

    @When("User click edit button of any meet in Meet List")
    public void user_click_edit_button_of_any_meet_in_meet_list() {
        meetManagement.editButton.click();

    }

    @When("User enter new Date in the Date box")
    public void user_enter_new_date_in_the_date_box() {
        meetManagement.dateTextBoxInEdit.sendKeys(generateTomorrowsDate());

    }

    @Then("User sees success saved message")
    public void user_sees_success_saved_message() {
       Assert.assertEquals("Meet Saved Successfully",meetManagement.alertMessage.getText());

    }

    @When("User enter new start time in the start time box")
    public void user_enter_new_start_time_in_the_start_time_box() {
        meetManagement.startTimeTextBoxInEdit.sendKeys("1900");

    }

    @When("User enter new stop time in the stop time box")
    public void user_enter_new_stop_time_in_the_stop_time_box() {
        meetManagement.stopTimeTextBoxInEdit.sendKeys("2100");

    }

    @When("User enters new Description in the Description")
    public void user_enters_new_description_in_the_description() {
        meetManagement.descriptionTextBoxInEdit.sendKeys("5");

    }

    @When("User click delete button of any meet in Meet List")
    public void user_click_delete_button_of_any_meet_in_meet_list() {
        ReusableMethods.clickWithJS(meetManagement.deleteButton);

    }

    @When("User enter invalid new start time in the start time box")
    public void user_enter_invalid_new_start_time_in_the_start_time_box() {
        meetManagement.startTimeTextBoxInEdit.sendKeys("2200");

    }

    @Then("User sees that the the edit meet not created")
    public void user_sees_that_the_the_edit_meet_not_created() {
        Assert.assertTrue(meetManagement.meetListText.isDisplayed());

    }

    @When("User enter invalid new Date in the Date box")
    public void user_enter_invalid_new_date_in_the_date_box() {
        meetManagement.dateTextBoxInEdit.sendKeys("010720255");

    }


    @And("User leaves blank in the stop time textbox")
    public void userLeavesBlankInTheStopTimeTextbox() {
      meetManagement.stopTimeTextBox.sendKeys();
    }

    @Then("User sees that the the add meet not created")
    public void userSeesThatTheTheAddMeetNotCreated() {
        Assert.assertTrue(meetManagement.meetListText.isEnabled());
    }
}
