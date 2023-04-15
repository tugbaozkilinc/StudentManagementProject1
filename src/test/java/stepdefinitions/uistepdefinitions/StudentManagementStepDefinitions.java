package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.MainMenu;
import pages.StudentManagement;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Locale;

import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.generateTomorrowsDate;

public class StudentManagementStepDefinitions {

    HomePage homePage = new HomePage();
    MainMenu mainMenu = new MainMenu();
    StudentManagement studentManagement = new StudentManagement();
    Faker faker = new Faker(Locale.US);

    @When("user clicks the Student Management on the menu")
    public void user_clicks_the_student_management_on_the_menu() {
        waitAndClick(mainMenu.studentManagement, 1);
        waitFor(1);
    }

    @When("user selects the advisor teacher")
    public void user_selects_the_advisor_teacher() {
        waitFor(2);
        Select advisorTeacherDropdown = new Select(studentManagement.advisorTeacherDropdown);
        selectRandomTextFromDropdown(advisorTeacherDropdown);
    }

    @When("user enters the email in the email text box")
    public void user_enters_the_email_in_the_email_text_box() {
        studentManagement.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @When("user enters the father name in the father name text box")
    public void user_enters_the_father_name_in_the_father_name_text_box() {
        studentManagement.fatherNameTextBox.sendKeys(faker.name().firstName());
    }

    @When("user enters the mother name in the mother name text box")
    public void user_enters_the_mother_name_in_the_mother_name_text_box() {
        studentManagement.motherNameTextBox.sendKeys(faker.name().firstName());
    }

    @When("user clicks the create student submit button")
    public void user_clicks_the_create_student_submit_button() {
        studentManagement.createStudentSubmitButton.click();
    }

    @Then("user verifies that the student is created successfully")
    public void user_verifies_that_the_student_is_created_successfully() {
        waitForVisibility(studentManagement.alertMessage, 3);
        Assert.assertEquals("Student saved Successfully", studentManagement.alertMessage.getText());
    }

    @Then("user verifies that the alert message says {string}")
    public void userVerifiesThatTheAlertMessageSays(String string) {
        waitForVisibility(studentManagement.alertMessage, 3);
        Assert.assertEquals(string, studentManagement.alertMessage.getText());
    }

    @Then("user verifies that the created student has an automatically generated student number")
    public void userVerifiesThatTheCreatedStudentHasAnAutomaticallyGeneratedStudentNumber() {
        clickWithJS(studentManagement.paginationLastPageButton);
        int lastIndex = studentManagement.studentNumbersListOnCurrentPage.size() - 1;
        Assert.assertNotEquals("", studentManagement.studentNumbersListOnCurrentPage.get(lastIndex).getText());
    }

    @When("user enters the email {string} in the email text box")
    public void user_enters_the_email_in_the_email_text_box(String email) {
        studentManagement.emailTextBox.sendKeys(email);
    }

    @When("user enters the phone in the {string} text box")
    public void user_enters_the_phone_in_the_text_box(String phone) {
        studentManagement.phoneNumberTextBox.sendKeys(phone);
    }

    @Then("user verifies that the warning {string} text under name text box is visible")
    public void user_verifies_that_the_warning_text_under_name_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderNameTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under surname text box is visible")
    public void user_verifies_that_the_warning_text_under_surname_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderSurnameTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under birth place text box is visible")
    public void user_verifies_that_the_warning_text_under_birth_place_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderBirthPlaceTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under email text box is visible")
    public void user_verifies_that_the_warning_text_under_email_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderEmailTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under phone text box is visible")
    public void user_verifies_that_the_warning_text_under_phone_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderPhoneTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under date of birth text box is visible")
    public void user_verifies_that_the_warning_text_under_date_of_birth_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderDateOfBirthTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under ssn text box is visible")
    public void user_verifies_that_the_warning_text_under_ssn_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderSsnTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under username text box is visible")
    public void user_verifies_that_the_warning_text_under_username_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderUserNameTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under father name text box is visible")
    public void user_verifies_that_the_warning_text_under_father_name_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderFatherNameTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under mother name text box is visible")
    public void user_verifies_that_the_warning_text_under_mother_name_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderMotherNameTextBox.getText());
    }

    @Then("user verifies that the warning {string} text under password text box is visible")
    public void user_verifies_that_the_warning_text_under_password_text_box_is_visible(String string) {
        Assert.assertEquals(string, studentManagement.warningTextUnderPasswordTextBox.getText());
    }

    @And("user enters the future date in the date of birth text box")
    public void userEntersTheFutureDateInTheDateOfBirthTextBox() {
        studentManagement.dateOfBirthTextBox.sendKeys(generateTomorrowsDate());
    }

    @And("user enters the current date in the date of birth text box")
    public void userEntersTheCurrentDateInTheDateOfBirthTextBox() {
        studentManagement.dateOfBirthTextBox.sendKeys(generateCurrentDate());
    }

    @When("user enters the ssn in the {string} text box")
    public void user_enters_the_ssn_in_the_text_box(String string) {
        studentManagement.ssnTextBox.sendKeys(string);
    }

    @When("user clicks the last page button in the pagination")
    public void user_clicks_the_last_page_button_in_the_pagination() {
        clickWithJS(studentManagement.paginationLastPageButton);
    }

    @When("user scrolls the page until sees the student list title")
    public void user_scrolls_the_page_until_sees_the_student_list_title() {
        ReusableMethods.executeJSCommand(studentManagement.studentListHeader, "arguments[0].scrollIntoView(true);");
    }

    @Then("user verifies that all the student numbers are unique in the student list")
    public void user_verifies_that_all_the_student_numbers_are_unique_in_the_student_list() {
        boolean isUnique = true;
        List<WebElement> studentList = studentManagement.studentNumbersListOnCurrentPage;
        for (int i = 0; i < studentList.size() - 1; i++) {
            if (studentList.indexOf(studentList.get(i)) != studentList.lastIndexOf(studentList.get(i))) {
                isUnique = false;
            }
        }
        Assert.assertTrue("All the student numbers are unique.", isUnique);
    }

    @When("user enters the father name {string} in the father name text box")
    public void user_enters_the_father_name_in_the_father_name_text_box(String string) {
        studentManagement.fatherNameTextBox.sendKeys(string);
    }
    @When("user enters the mother name {string} in the mother name text box")
    public void user_enters_the_mother_name_in_the_mother_name_text_box(String string) {
        studentManagement.motherNameTextBox.sendKeys(string);
    }







}
