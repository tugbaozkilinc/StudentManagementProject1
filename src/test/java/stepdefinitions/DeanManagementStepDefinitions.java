package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeanManagement;
import pages.MainMenu;
import utilities.ReusableMethods;

import java.util.Locale;

public class DeanManagementStepDefinitions {


    DeanManagement deanManagement = new DeanManagement();
    MainMenu mainMenu = new MainMenu();

    static Faker faker = new Faker(Locale.US);


    public static String deanName = faker.name().firstName();
    public static String deanSurname = faker.name().lastName();
    public static String deanBirthPlace = faker.country().capital();
    public static String deanDateOfBirth = "12121990";
    public static String deanSSNNumber = faker.idNumber().ssnValid();
    public static String deanPhoneNumber = faker.number().digits(3) + "-"
            + faker.number().digits(3) + "-"
            + faker.number().digits(4);
    public static String deanUsername = faker.name().username();
    public static String deanPassword = faker.internet().password(8, 9, true, true);


    @And("user clicks the Dean Management button on the menu")
    public void userClicksTheDeanManagementButtonOnTheMenu() {
        ReusableMethods.clickWithJS(ReusableMethods.waitForClickAbility(mainMenu.deanManagement, 10));
    }

    @And("user enters the valid value in the name textbox on the Dean Management page")
    public void userEntersTheValidValueInTheNameTextboxOnTheDeanManagementPage() {
        ReusableMethods.wait(3);
        deanManagement.nameTextBox.sendKeys(deanName);
    }

    @And("user enters the valid value in the surname textbox on the Dean Management page")
    public void userEntersTheValidValueInTheSurnameTextboxOnTheDeanManagementPage() {
        ReusableMethods.wait(2);
        deanManagement.surnameTextBox.sendKeys(deanSurname);
    }

    @And("user enters the valid value in the birth place textbox on the Dean Management page")
    public void userEntersTheValidValueInTheBirthPlaceTextboxOnTheDeanManagementPage() {
        deanManagement.birthPlaceTextBox.sendKeys(deanBirthPlace);
    }

    @And("user selects a gender on the Dean Management page")
    public void userSelectsAGenderOnTheDeanManagementPage() {
        ReusableMethods.clickWithJS(deanManagement.femaleRadioButton);
    }

    @And("user enters the valid value in the date of birth on the Dean Management page")
    public void userEntersTheValidValueInTheDateOfBirthOnTheDeanManagementPage() {
        deanManagement.dateOfBirth.sendKeys(deanDateOfBirth);
    }

    @And("user enters the valid value in the phone textbox on the Dean Management page")
    public void userEntersTheValidValueInThePhoneTextboxOnTheDeanManagementPage() {
        deanManagement.phoneNumberTextBox.sendKeys(deanPhoneNumber);
    }

    @And("user enters the valid value in the SSN textbox on the Dean Management page")
    public void userEntersTheValidValueInTheSSNTextboxOnTheDeanManagementPage() {
        deanManagement.SSNTextBox.sendKeys(deanSSNNumber);
    }

    @And("user enters the valid value username textbox on the Dean Management page")
    public void userEntersTheValidValueUsernameTextboxOnTheDeanManagementPage() {
        deanManagement.usernameTextBox.sendKeys(deanUsername);
    }

    @And("user enters the valid value in the password textbox on the Dean Management page")
    public void userEntersTheValidValueInThePasswordTextboxOnTheDeanManagementPage() {
        deanManagement.passwordTextBox.sendKeys(deanPassword);
    }

    @Given("user clicks the submit button on the Dean Management page")
    public void userClicksTheRegisterSubmitButtonOnTheDeanManagementPage() {
        ReusableMethods.clickWithJS(deanManagement.submitButton);
    }

    @Then("user verifies {string} alert message")
    public void userVerifiesAlertMessage(String alertText) {
        Assert.assertEquals(alertText, ReusableMethods.waitForVisibility(deanManagement.alertMessage, 2).getText());
    }


    //------------------------Leaving the field blank

    @And("user enters the {string} in the name textbox on the Dean Management page")
    public void userEntersTheInTheNameTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.nameTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the surname textbox on the Dean Management page")
    public void userEntersTheInTheSurnameTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.surnameTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the birth place textbox on the Dean Management page")
    public void userEntersTheInTheBirthPlaceTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.birthPlaceTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the phone textbox on the Dean Management page")
    public void userEntersTheInThePhoneTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.phoneNumberTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the date of birth textbox on the Dean Management page")
    public void userEntersTheInTheDateOfBirthTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.dateOfBirth.sendKeys(arg0);
    }

    @And("user enters the {string} in the ssn textbox on the Dean Management page")
    public void userEntersTheInTheSsnTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.SSNTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the username textbox on the Dean Management page")
    public void userEntersTheInTheUsernameTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.usernameTextBox.sendKeys(arg0);
    }

    @And("user enters the {string} in the password textbox on the Dean Management page")
    public void userEntersTheInThePasswordTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.passwordTextBox.sendKeys(arg0);
    }

    @Then("user verifies {string} message")
    public void userVerifiesMessage(String arg0) {
        Assert.assertEquals(deanManagement.generalRequiredText.getText(), arg0);
    }


    @Then("user verifies the {string} message under the phone text box on the Dean Management page")
    public void userVerifiesTheMessageUnderThePhoneTextBoxOnTheDeanManagementPage(String arg0) {
        Assert.assertEquals(arg0, ReusableMethods.waitForVisibility(deanManagement.phoneTextBoxMessage, 4).getText());
    }


    @Then("user verifies {string} or {string} the alert message on the Dean Management page")
    public void userVerifiesOrTheAlertMessageOnTheDeanManagementPage(String arg0, String arg1) {
        System.out.println("deanManagement.alertMessage.getText() = " + deanManagement.alertMessage.getText());
        if (ReusableMethods.waitForVisibility(deanManagement.alertMessage, 2).getText().equals(arg0) || ReusableMethods.waitForVisibility(deanManagement.alertMessage, 2).getText().equals(arg1)) {
            assert true;
        } else {
            throw new RuntimeException("Phone Field Alert Message");
        }
    }

    @And("user enters the {string} in the SSN textbox on the Dean Management page")
    public void userEntersTheInTheSSNTextboxOnTheDeanManagementPage(String arg0) {
        deanManagement.SSNTextBox.sendKeys(arg0);
    }

    @Then("user verifies the {string} the alert message on the Dean Management page")
    public void userVerifiesTheTheAlertMessageOnTheDeanManagementPage(String arg0) {
        Assert.assertEquals(arg0, ReusableMethods.waitForVisibility(deanManagement.alertMessage, 4).getText());
    }


    @Then("user verifies Name Surname header on Dean List")
    public void user_verifies_name_surname_header_on_dean_list() {
        assert deanManagement.nameSurnameHeaderInDeanList.isDisplayed();
    }

    @Then("user verifies Gender header on Dean List")
    public void user_verifies_gender_header_on_dean_list() {
        assert deanManagement.genderHeaderInDeanList.isDisplayed();
    }

    @Then("user verifies Phone Number header on Dean List")
    public void user_verifies_phone_number_header_on_dean_list() {
        assert deanManagement.phoneNumberHeaderInDeanList.isDisplayed();
    }

    @Then("user verifies Ssn header on Dean List")
    public void user_verifies_ssn_header_on_dean_list() {
        assert deanManagement.ssnHeaderInDeanList.isDisplayed();
    }

    @Then("user verifies user Name header on Dean List")
    public void user_verifies_user_name_header_on_dean_list() {
        assert deanManagement.usernameHeaderInDeanList.isDisplayed();
    }


    @And("user adds dean with valid values")
    public void userAddsDeanWithValidValues() {
        ReusableMethods.wait(3);
        deanManagement.nameTextBox.sendKeys(deanName);
        System.out.println("deanName = " + deanName);
        ReusableMethods.wait(3);
        deanManagement.surnameTextBox.sendKeys(deanSurname);
        deanManagement.birthPlaceTextBox.sendKeys(deanBirthPlace);
        ReusableMethods.clickWithJS(deanManagement.femaleRadioButton);
        deanManagement.dateOfBirth.sendKeys(deanDateOfBirth);
        deanManagement.phoneNumberTextBox.sendKeys(deanPhoneNumber);
        deanManagement.SSNTextBox.sendKeys(deanSSNNumber);
        deanManagement.usernameTextBox.sendKeys(deanUsername);
        System.out.println("deanUsername = " + deanUsername);
        deanManagement.passwordTextBox.sendKeys(deanPassword);
        ReusableMethods.clickWithJS(deanManagement.submitButton);
    }


    @Then("user verifies the {string} message under the password text box on the Dean Management page")
    public void userVerifiesTheMessageUnderThePasswordTextBoxOnTheDeanManagementPage(String arg0) {
        Assert.assertEquals(arg0, ReusableMethods.waitForVisibility(deanManagement.passwordMin8Char, 2).getText());
    }


    @And("user selects last Dean from Dean List")
    public void userSelectsLastDeanFromDeanList() {
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(deanManagement.lastPageButton);
    }

    @And("user clicks Edit button on Dean Management Page")
    public void userClicksEditButtonOnDeanManagementPage() {
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(deanManagement.lastDeanEditButton);
    }

    @And("user edits name field on the Edit Dean Page")
    public void userEditsNameFieldOnTheEditDeanPage() {
        ReusableMethods.wait(4);
        DeanManagement.withActionsEditTextBox(deanManagement.editCardName,"New Edit Name");
    }

    @And("user selects a gender on the Edit Dean Page")
    public void userSelectsAGenderOnTheEditDeanPage() {
        deanManagement.editCardGender.click();
    }

    @And("user enters Dean's password on the Edit Dean Page")
    public void userEntersDeanSPasswordOnTheEditDeanPage() {
        deanManagement.editCardPassword.sendKeys(deanPassword);
    }

    @And("user clicks submit button on the Edit Dean Page")
    public void userClicksSubmitButtonOnTheEditDeanPage() {
        ReusableMethods.clickWithJS(deanManagement.editCartSubmitButton);
    }


    @And("user edits surname field on the Edit Dean Page")
    public void userEditsSurnameFieldOnTheEditDeanPage() {
        DeanManagement.withActionsEditTextBox(deanManagement.editCardSurname,"Edit Surname");
    }

    @And("user edits birth place field on the Edit Dean Page")
    public void userEditsBirthPlaceFieldOnTheEditDeanPage() {
        DeanManagement.withActionsEditTextBox(deanManagement.editCardBirthPlace,"Edit Birth Place");
    }

    @And("user edits phone field on the Edit Dean Page")
    public void userEditsPhoneFieldOnTheEditDeanPage() {
        DeanManagement.withActionsEditTextBox(deanManagement.editCardPhone,"777-777-9999");
    }

    @And("user edits ssn field on the Edit Dean Page")
    public void userEditsSsnFieldOnTheEditDeanPage() {
        ReusableMethods.wait(3);
        DeanManagement.withActionsEditTextBox(deanManagement.editCardSSN,Faker.instance().idNumber().ssnValid());
    }

    @And("user edits username field on the Edit Dean Page")
    public void userEditsUsernameFieldOnTheEditDeanPage() {
        DeanManagement.withActionsEditTextBox(deanManagement.editCardUserName,"Edit Username");
    }
}
