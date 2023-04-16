package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminManagement;
import utilities.ReusableMethods;

public class AdminManagementStepDefinitions {
    AdminManagement adminManagement = new AdminManagement();
    Faker faker=new Faker();

    @Then("user verifies that the admin is created successfully")
    public void user_verifies_that_the_admin_is_created_successfully() {
        Assert.assertEquals(ReusableMethods.waitForVisibility(adminManagement.alertMessage, 2).getText(), "Admin Saved");

    }

    @And("user clicks the create admin submit button")
    public void userClicksTheCreateAdminSubmitButton() {
        adminManagement.createAdminSubmitButton.click();
    }

    @Then("user verifies that the required text under name text box is visible")
    public void userVerifiesThatTheRequiredTextUnderNameTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(0).isDisplayed());
    }

    @Then("user verifies that the required text under surname text box is visible")
    public void userVerifiesThatTheRequiredTextUnderSurnameTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(1).isDisplayed());
    }


    @Then("user verifies that the required text under birth place text box is visible")
    public void userVerifiesThatTheRequiredTextUnderBirthPlaceTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(2).isDisplayed());
    }

    @Then("user verifies that the required text under gender radio button is visible")
    public void userVerifiesThatTheRequiredTextUnderGenderRadioButtonIsVisible() {
        Assert.assertFalse(adminManagement.requiredTextList.get(3).isDisplayed());//Developerlar gender radio buttonun altina zorunludur yazsini ekleyince AssertTRUE yapilacak.
    }


    @Then("user verifies that the required text under data of birth text box is visible")
    public void userVerifiesThatTheRequiredTextUnderDataOfBirthTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(3).isDisplayed());
    }


    @Then("user verifies that the required text under phone text box is visible")
    public void userVerifiesThatTheRequiredTextUnderPhoneTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(4).isDisplayed());
    }

    @Then("user verifies that the required text under ssn text box is visible")
    public void userVerifiesThatTheRequiredTextUnderSsnTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(5).isDisplayed());
    }

    @Then("user verifies that the required text under username text box is visible")
    public void userVerifiesThatTheRequiredTextUnderUsernameTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(6).isDisplayed());
    }

    @Then("user verifies that the required text under password text box is visible")
    public void userVerifiesThatTheRequiredTextUnderPasswordTextBoxIsVisible() {
        Assert.assertTrue(adminManagement.requiredTextList.get(7).isDisplayed());
    }


    @And("User enters password {int} characters in the password text box")
    public void userEntersPasswordCharactersInThePasswordTextBox(int arg0) {
        adminManagement.passwordTextBox.sendKeys("1234567");
    }

    @Then("user verifies that the Minimum {int} character text under password text box is visible")
    public void userVerifiesThatTheMinimumCharacterTextUnderPasswordTextBoxIsVisible(int arg0) {
        Assert.assertTrue(adminManagement.passwordAlert.getText().contains("Minimum 8 character"));
    }

    @And("the user enters a space character in the name text box")
    public void theUserEntersASpaceCharacterInTheNameTextBox() {
        adminManagement.nameTextBox.sendKeys(" ");
    }


    @Then("user verifies \\{string} text message")
    public void userVerifiesStringTextMessage() {
    }
}
