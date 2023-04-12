package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.MainMenu;
import pages.StudentManagement;

import java.util.Locale;

import static utilities.ReusableMethods.*;

public class StudentManagementStepDefinitions {

    HomePage homePage = new HomePage();
    MainMenu mainMenu = new MainMenu();
    StudentManagement studentManagement = new StudentManagement();
    Faker faker = new Faker(Locale.US);

    @And("user clicks the menu button")
    public void userClicksTheMenuButton() {
        homePage.menuButton.click();
    }

    @When("user clicks the Student Management on the menu")
    public void user_clicks_the_student_management_on_the_menu() {
        waitAndClick(mainMenu.studentManagement, 2);
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

    @Then("user verifies that the required text under name text box is visible")
    public void userVerifiesThatTheRequiredTextUnderNameTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForNameTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under surname text box is visible")
    public void userVerifiesThatTheRequiredTextUnderSurnameTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForSurnameTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under birth place text box is visible")
    public void userVerifiesThatTheRequiredTextUnderBirthPlaceTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForBirthPlaceTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under email text box is visible")
    public void userVerifiesThatTheRequiredTextUnderEmailTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForEmailTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under phone text box is visible")
    public void userVerifiesThatTheRequiredTextUnderPhoneTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForPhoneTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under date of birth text box is visible")
    public void userVerifiesThatTheRequiredTextUnderDateOfBirthTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForDateOfBirthTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under ssn text box is visible")
    public void userVerifiesThatTheRequiredTextUnderSsnTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForSsnTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under username text box is visible")
    public void userVerifiesThatTheRequiredTextUnderUsernameTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForUserNameTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under father name text box is visible")
    public void userVerifiesThatTheRequiredTextUnderFatherNameTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForFatherNameTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under mother name text box is visible")
    public void userVerifiesThatTheRequiredTextUnderMotherNameTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForMotherNameTextBox.isDisplayed());
    }

    @Then("user verifies that the required text under password text box is visible")
    public void userVerifiesThatTheRequiredTextUnderPasswordTextBoxIsVisible() {
        Assert.assertTrue(studentManagement.requiredTextForUserPasswordTextBox.isDisplayed());
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

}
