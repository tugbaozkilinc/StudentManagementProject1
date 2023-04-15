package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.MainMenu;
import pages.TeacherManagement;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

import java.security.Key;
import java.util.Locale;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.clickWithJS;
import static utilities.ReusableMethods.waitForVisibility;


public class TeacherManagementStepDefinitions {
    TeacherManagement teacherManagement = new TeacherManagement();
    HomePage homepage = new HomePage();
    MainMenu mainMenu = new MainMenu();
    Faker faker = new Faker(Locale.US);


    @And("user clicks the menu button")
    public void userClicksTheMenuButton() {
        homepage.menuButton.click();
    }


    @And("user clicks the Teacher Management")
    public void userClicksTheTeacherManagement() {
        mainMenu.teacherManagement.click();
    }

    @And("user chooses a lesson")
    public void userChoosesALesson() {

        homepage.title.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys("MathT6" + Keys.SPACE + Keys.ENTER).perform();

    }

    @And("user enters the valid value in the name textbox")
    public void userEntersTheValidValueInTheNameTextbox() {
        teacherManagement.nameTextBox.sendKeys(faker.name().firstName());
    }

    @And("user enters the valid value in the surname textbox")
    public void userEntersTheValidValueInTheSurnameTextbox() {
        teacherManagement.surnameTextBox.sendKeys(faker.name().lastName());
    }

    @And("user enters the valid value in the Birth Place")
    public void userEntersTheValidValueInTheBirthPlace() {
        teacherManagement.birthPlaceTextBox.sendKeys(faker.address().city());
    }

    @And("user enters the valid value in the email textbox")
    public void userEntersTheValidValueInTheEmailTextbox() {
        teacherManagement.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @And("user enters the valid value in the phone textbox")
    public void userEntersTheValidValueInThePhoneTextbox() {
        teacherManagement.phoneNumberTextBox.sendKeys(faker.number().digits(3) +
                "-" + faker.number().digits(3)
                + "-" + faker.number().digits(4));
    }

    @And("user enters the valid value in the Birth Place textbox")
    public void userEntersTheValidValueInTheBirthPlaceTextbox() {
        teacherManagement.birthPlaceTextBox.sendKeys(faker.address().city());
    }

    @And("user chooses gender")
    public void userChoosesGender() {
        teacherManagement.maleRadioButton.click();
    }

    @And("user enters the valid value in the Date Of Birth")
    public void userEntersTheValidValueInTheDateOfBirth() {
        teacherManagement.birthdayCalender.sendKeys("10.10.2000");
    }

    @And("user enters the valid value in the ssn textbox")
    public void userEntersTheValidValueInTheSsnTextbox() {
        teacherManagement.SSNTextBox.sendKeys(faker.idNumber().ssnValid());
    }

    @And("user enters the valid value in the And user Name textbox")
    public void userEntersTheValidValueInTheAndUserNameTextbox() {
        teacherManagement.usernameTextBox.sendKeys(faker.name().firstName());

    }

    @And("user enters the valid value in the Password textbox")
    public void userEntersTheValidValueInThePasswordTextbox() {
        teacherManagement.passwordTextBox.sendKeys(faker.internet().password());
    }

    @And("user clicks the register submit button")
    public void userClicksTheRegisterSubmitButton() throws InterruptedException {
        teacherManagement.SubmitButton.click();

    }

    @Then("user verifies that the creation is succesfull")
    public void userVerifiesThatTheCreationIsSuccesfull() {
        assertTrue(waitForVisibility(teacherManagement.successMessage, 10).isDisplayed());


    }

    @Then("user verifies that the creation is unsuccesfull")
    public void userVerifiesThatTheCreationIsUnsuccesfull() {
        assertTrue(waitForVisibility(teacherManagement.errorMessage, 10).isDisplayed());


    }

    @And("user enters the valid {string} value in the name textbox")
    public void userEntersTheValidValueInTheNameTextbox(String arg0) {
        teacherManagement.nameTextBox.sendKeys(arg0);

    }

    @And("user enters the valid {string} value in the surname textbox")
    public void userEntersTheValidValueInTheSurnameTextbox(String arg0) {
        teacherManagement.surnameTextBox.sendKeys(arg0);
    }

    @And("user enters the valid {string} value in the Birth Place")
    public void userEntersTheValidValueInTheBirthPlace(String arg0) {
        teacherManagement.birthPlaceTextBox.sendKeys(arg0);
    }

    @And("user enters the valid {string} value in the email textbox")
    public void userEntersTheValidValueInTheEmailTextbox(String arg0) {
        teacherManagement.emailTextBox.sendKeys(arg0);
    }

    @And("user enters the valid {string} value in the phone textbox")
    public void userEntersTheValidValueInThePhoneTextbox(String arg0) {
        teacherManagement.phoneNumberTextBox.sendKeys(arg0);
    }

    @And("user enters the valid {string} value in the Date Of Birth")
    public void userEntersTheValidValueInTheDateOfBirth(String arg0) {
        teacherManagement.birthdayCalender.sendKeys(arg0);
    }

    @And("user enters the valid {string} value in the ssn textbox")
    public void userEntersTheValidValueInTheSsnTextbox(String arg0) {
        teacherManagement.SSNTextBox.sendKeys(arg0);
    }

    @And("user enters the valid {string} value in the And user Name textbox")
    public void userEntersTheValidValueInTheAndUserNameTextbox(String arg0) {
        teacherManagement.usernameTextBox.sendKeys(arg0);
    }

    @And("user enters the valid {string} value in the Password textbox")
    public void userEntersTheValidValueInThePasswordTextbox(String arg0) {
        teacherManagement.passwordTextBox.sendKeys(arg0);
    }

    @Then("user verifies that {string} Required is appeared")
    public void userVerifiesThatRequiredIsAppeared(String arg0) {
        assertTrue( waitForVisibility(teacherManagement.required,5).isDisplayed());

    }
}
