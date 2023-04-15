package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenu;
import pages.StudentInfoManagement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Locale;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.waitForVisibility;

public class StudentInfoManagementStepDefinitions {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MainMenu mainMenu = new MainMenu();
    StudentInfoManagement studentInfoManagement = new StudentInfoManagement();
    Faker faker = new Faker(Locale.US);

    @Given("User navigates to the specified URL")
    public void user_navigates_to_the_specified_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        homePage.loginButton.click();
    }

    @When("User enters the teacher username in the username textbox")
    public void user_enters_the_teacher_username_in_the_username_textbox() {
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("teacher_username"));
    }

    @When("User enters the teacher password in the password textbox")
    public void user_enters_the_teacher_password_in_the_password_textbox() {
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("teacher_password"));
    }

    @When("User clicks the Login button")
    public void user_clicks_the_login_button() {
        loginPage.submitLoginButton.click();
        // ReusableMethods.clickWithJS(loginPage.submitLoginButton);
    }

    @When("User clicks the Menuu button")
    public void user_clicks_the_menu_button() {
        homePage.menuButton.click();
    }

    @When("User sees that the Student Info Management page is displayed")
    public void user_sees_that_the_student_ınfo_management_page_is_displayed() {
        assert studentInfoManagement.studentInfoText.isDisplayed();
    }

    @And("User clicks the Student Info Management button on the menu")
    public void userClicksTheStudentInfoManagementButtonOnTheMenu() {
        mainMenu.studentInfoManagement.click();
    }

    @Then("User sees that the Add Student Info is displayed on the page")
    public void userSeesThatTheAddStudentInfoIsDisplayedOnThePage() {
        assert studentInfoManagement.studentInfoText.isDisplayed();
    }

    @And("User choses the Lesson the Choose Lesson dropdown")
    public void userChosesTheLessonTheChooseLessonDropdown() {
        studentInfoManagement.chooseLessonTextBox.click();
        Select select = new Select(studentInfoManagement.chooseLessonTextBox);
        select.selectByIndex(0);
    }

    @And("User choses the Student the Choose Student dropdown")
    public void userChosesTheStudentTheChooseStudentDropdown() {
        studentInfoManagement.studentInfoText.click();
        Select select = new Select(studentInfoManagement.studentInfoText);
        select.selectByIndex(0);
    }

    @And("User choses the Education Term the Choose Education Term dropdown")
    public void userChosesTheEducationTermTheChooseEducationTermDropdown() {
        studentInfoManagement.chooseEducationTermTextBox.click();
        Select select = new Select(studentInfoManagement.chooseEducationTermTextBox);
        select.selectByIndex(0);
    }

    @And("User enters the Absentee in the Absentee textbox")
    public void userEntersTheAbsenteeInTheAbsenteeTextbox() {
        studentInfoManagement.absenteeTextBox.sendKeys(faker.number().digit());

    }


    @And("User enters the value in the Midterm Exam textbox")
    public void userEntersTheValueInTheMidtermExamTextbox() {
        studentInfoManagement.midtermExamTextBox.sendKeys(faker.number().digit());
    }

    @And("User enters the value in the Final Exam textbox")
    public void userEntersTheValueInTheFinalExamTextbox() {
        studentInfoManagement.finalExamTextBox.sendKeys(faker.number().digit());
    }

    @And("User enters the value in the Info Note textbox")
    public void userEntersTheValueInTheInfoNoteTextbox() {
        studentInfoManagement.infoNoteTextBox.sendKeys(faker.expression("hjvjkj"));
    }

    @And("User clicks the Submit button")
    public void userClicksTheSubmitButton() {
        studentInfoManagement.submitButton.click();
    }

    @Then("User sees that the the Student Info created")
    public void userSeesThatTheTheStudentInfoCreated() {
        assert studentInfoManagement.studentIsDisplayed.isDisplayed();
    }


    @And("User choses the {string} the Choose Lesson dropdown")
    public void userChosesTheTheChooseLessonDropdown(String arg0) {
        studentInfoManagement.chooseLessonTextBox.sendKeys(arg0);
    }

    @And("User choses the {string} the Choose Student dropdown")
    public void userChosesTheTheChooseStudentDropdown(String arg0) {
        studentInfoManagement.chooseStudentTextBox.sendKeys(arg0);
    }

    @And("User choses the {string}Term the Choose Education Term dropdown")
    public void userChosesTheTermTheChooseEducationTermDropdown(String arg0) {
        studentInfoManagement.educationTermIdTextBox.sendKeys(arg0);
    }

    @And("User enters the {string} in the Absentee textbox")
    public void userEntersTheInTheAbsenteeTextbox(String arg0) {
        studentInfoManagement.absenteeTextBox.sendKeys(arg0);
    }

    @And("User enters the {string} in the Midterm Exam textbox")
    public void userEntersTheInTheMidtermExamTextbox(String arg0) {
        studentInfoManagement.midtermExamTextBox.sendKeys(arg0);
    }

    @And("User enters the {string} in the Final Exam textbox")
    public void userEntersTheInTheFinalExamTextbox(String arg0) {
        studentInfoManagement.finalExamTextBox.sendKeys(arg0);
    }

    @And("the user leaves the {string} section blank")
    public void theUserLeavesTheSectionBlank(String arg0) {
        studentInfoManagement.infoNoteTextBox.sendKeys(arg0);
    }

    @Then("user verifies that the red required {string} text is visible under the Final Exam textbox on the Add Student Info page")
    public void userVerifiesThatTheRedRequiredTextIsVisibleUnderTheFinalExamTextboxOnTheAddStudentInfoPage(String arg0) {
        assertTrue(waitForVisibility(studentInfoManagement.required, 5).isDisplayed());
    }

    @Then("User click the delete button")
    public void userClickTheDeleteButton() {
        studentInfoManagement.deleteButtonInStudentInfo.click();
    }

    @Then("User sees that the Add Student Info is not displayed on the page")
    public void userSeesThatTheAddStudentInfoIsNotDisplayedOnThePage() {
        Assert.assertFalse(studentInfoManagement.studentIsDisplayed.isDisplayed());
    }

    @Then("User click the edit button")
    public void userClickTheEditButton() {
        studentInfoManagement.editButtonInStudentInfo.click();
    }

    @Then("User sees  the Edit Student Info page")
    public void userSeesTheEditStudentInfoPage() {
        assert studentInfoManagement.studentInfoListText.isDisplayed();
    }

    @Then("User sees  the Name Surname is selected in Edit Student Info page")
    public void userSeesTheNameSurnameIsSelectedInEditStudentInfoPage() {
        assert studentInfoManagement.nameIsDisplayed.isDisplayed();
    }


    @And("User sees that student info does not edit")
    public void userSeesThatStudentInfoDoesNotEdit() {
        assert studentInfoManagement.canNotEdit.isDisplayed();
    }

    @Then("User leaves lesson {string} textbox blank")
    public void userLeavesLessonTextboxBlank(String arg0) {
        studentInfoManagement.lessonIdTextBox.sendKeys(arg0);
    }

    @Then("User leaves education {string} textbox blank")
    public void userLeavesEducationTextboxBlank(String arg0) {
        studentInfoManagement.educationTermIdTextBox.sendKeys(arg0);
    }

    @Then("User leaves absentee {string} textbox blank")
    public void userLeavesAbsenteeTextboxBlank(String arg0) {
        studentInfoManagement.absenteeTextBoxInStudentInfo.sendKeys(arg0);
    }

    @Then("User leaves midExam {string} textbox blank")
    public void userLeavesMidExamTextboxBlank(String arg0) {
        studentInfoManagement.midtermExamTextBoxInStudentInfo.sendKeys(arg0);
    }

    @Then("User leaves finalExam {string} textbox blank")
    public void userLeavesFinalExamTextboxBlank(String arg0) {
        studentInfoManagement.finalExamTextBoxInStudentInfo.sendKeys(arg0);
    }

    @Then("User leaves ınfoNote {string} textbox blank")
    public void userLeavesInfoNoteTextboxBlank(String arg0) {
        studentInfoManagement.infoNoteTextBoxInStudentInfo.sendKeys(arg0);
    }
}
