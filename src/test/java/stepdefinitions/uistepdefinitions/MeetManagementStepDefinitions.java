package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenu;
import pages.MeetManagement;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class MeetManagementStepDefinitions {
//
//    HomePage homePage = new HomePage();
//    LoginPage loginPage = new LoginPage();
//    MainMenu mainMenu=new MainMenu();
//    MeetManagement meetManagement=new MeetManagement();
//
//    @Given("User navigates to the specified URL")
//    public void user_navigates_to_the_specified_url() {
//        Driver.getDriver().get(ConfigReader.getProperty("url"));
//    }
//    @When("User clicks on the Login button")
//    public void user_clicks_on_the_login_button() {
//homePage.loginButton.click();
//
//    }
//    @When("User enters the {string} in the username textbox")
//    public void user_enters_the_in_the_username_textbox(String string) {
//        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty(" teacher username"));
//    }
//    @When("User enters the {string} in the password textbox")
//    public void user_enters_the_in_the_password_textbox(String string) {
//loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("teacher password"));
//    }
//    @When("User clicks the Login button")
//    public void user_clicks_the_login_button() {
//loginPage.submitLoginButton.click();
//    }
//    @When("User clicks the Menu button")
//    public void user_clicks_the_menu_button() {
//homePage.menuButton.click();
//    }
//    @When("User clicks the Meet Management button on the menu")
//    public void user_clicks_the_meet_management_button_on_the_menu() {
//        meetManagement.addMeetText.click();
//    }
//    @When("User sees that the Meet Management page is displayed")
//    public void user_sees_that_the_meet_management_page_is_displayed() {
//        assertTrue(meetManagement.addMeetText.isDisplayed());
//    }
//    @Then("User sees that the Add Meet section is displayed on the page")
//    public void user_sees_that_the_add_meet_section_is_displayed_on_the_page() {
//
//    }
//
//    @And("User choses the Student from the Choose Student dropdown")
//    public void userChosesTheStudentFromTheChooseStudentDropdown() {
//        meetManagement.chooseStudentTextBox.sendKeys(ConfigReader.getProperty("Selcuk"));
//
//        //Select select =new Select(ConfigReader.getProperty(meetManagement.chooseStudentTextBox.click()));
//    }
//
//    @And("User enters the {string} in the Date of Meet textbox")
//    public void userEntersTheInTheDateOfMeetTextbox(String arg0) {
//        meetManagement.dateOfMeetTextBox.sendKeys(arg0);
//    }
//
//    @And("User enters the {string} in the start time textbox")
//    public void userEntersTheInTheStartTimeTextbox(String arg0) {
//        meetManagement.startTimeTextBox.sendKeys(arg0);
//
//    }
//
//    @And("User enters the {string} in the start stop textbox")
//    public void userEntersTheInTheStartStopTextbox(String arg0) {
//        meetManagement.stopTimeTextBox.sendKeys(arg0);
//    }
//
//    @And("User enters the {string} in the Description textbox")
//    public void userEntersTheInTheDescriptionTextbox(String arg0) {
//        meetManagement.descriptionTextBox.sendKeys(arg0);
//    }
//
//    @And("User clicks the Submit button on the menu")
//    public void userClicksTheSubmitButtonOnTheMenu() {
//        meetManagement.submitButton.click();
//    }
//
//    @And("User sees that the green confirmation {string} text appeared on the page")
//    public void userSeesThatTheGreenConfirmationTextAppearedOnThePage(String arg0) {
//
//
//    }
////US 20 TC1-8
//    @Then("User sees that the created student is visible on the Meet List section on the page")
//    public void userSeesThatTheCreatedStudentIsVisibleOnTheMeetListSectionOnThePage() {
//    }
//
//    @And("User choses the {string} from the Choose Student dropdown")
//    public void userChosesTheFromTheChooseStudentDropdown(String arg0) {
//
//    }
//
//    @And("User leaves blank in the {string} textbox")
//    public void userLeavesBlankInTheTextbox(String arg0) {
//    }
//
//    @And("User sees that the red warning {string} under Description textbox")
//    public void userSeesThatTheRedWarningUnderDescriptionTextbox(String arg0) {
//    }
//
//    @Then("User sees that the the add meet not created")
//    public void userSeesThatTheTheAddMeetNotCreated() {
//    }
//
//    @And("User leaves blank  in the stop time textbox")
//    public void userLeavesBlankInTheStopTimeTextbox() {
//    }
//
//    @Then("User sees that the Meet List section is displayed on the page")
//    public void userSeesThatTheMeetListSectionIsDisplayedOnThePage() {
//        assert meetManagement.addMeetText.isDisplayed();
//    }
//
//    @And("User click edit button of any meet in Meet List")
//    public void userClickEditButtonOfAnyMeetInMeetList() {
//        meetManagement.addMeetText.click();
//    }
//
//    @And("User enter new Date in the Date box")
//    public void userEnterNewDateInTheDateBox() {
//
//        meetManagement.dateOfMeetTextBox.sendKeys("16082023");
//
//    }
//
//    @And("User click Submit button")
//    public void userClickSubmitButton() {
//        meetManagement.submitButtonInEdit.click();
//    }
//
//    @Then("User sees success saved message")
//    public void userSeesSuccessSavedMessage() {
//
//       //  Assert.assertEquals(ReusableMethods.waitForVisibility(adminManagement.alertMessage, 2).getText(), "Admin Saved");
//    }
//
//    @And("User enter new start time in the start time box")
//    public void userEnterNewStartTimeInTheStartTimeBox() {
//        meetManagement.startTimeTextBoxInEdit.sendKeys("1700");
//
//    }
//
//    @And("User enter new stop time in the stop time box")
//    public void userEnterNewStopTimeInTheStopTimeBox() {meetManagement.stopTimeTextBoxInEdit.sendKeys("1900");
//    }
//
//    @And("User enters new Description in the Description")
//    public void userEntersNewDescriptionInTheDescription() {meetManagement.descriptionTextBoxInEdit.sendKeys("good");
//    }
//
//    @And("User click delete button of any meet in Meet List")
//    public void userClickDeleteButtonOfAnyMeetInMeetList() {meetManagement.deleteButton.click();
// }
//
//    @And("User enter invalid new start time in the start time box")
//    public void userEnterInvalidNewStartTimeInTheStartTimeBox() {meetManagement.startTimeTextBoxInEdit.sendKeys("2300");
//    }
//
//    @Then("User sees that the the edit meet not created")
//    public void userSeesThatTheTheEditMeetNotCreated() {
//    }
//
//    @And("User enter invalid new Date in the Date box")
//    public void userEnterInvalidNewDateInTheDateBox() {meetManagement.dateTextBoxInEdit.sendKeys("1012023");
//    }
}
//  Assert.assertEquals(ReusableMethods.waitForVisibility(adminManagement.alertMessage, 2).getText(), "Admin Saved");

