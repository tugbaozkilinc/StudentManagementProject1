package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ReusableMethods;

import java.util.Locale;

public class RegisterModuleStepDefinitions {

    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    Faker faker = new Faker(Locale.US);

    @Given("user clicks the register button")
    public void user_clicks_the_register_button() {
        homePage.registerButton.click();
    }

    @Given("user enters the name in the name text box")
    public void user_enters_the_name_in_the_name_text_box() {

        registerPage.nameTextBox.sendKeys(faker.name().firstName());
    }

    @Given("user enters the surname in the surname text box")
    public void user_enters_the_surname_in_the_surname_text_box() {
        registerPage.surnameTextBox.sendKeys(faker.name().lastName());
    }

    @Given("user enters the birth place in the birth place text box")
    public void user_enters_the_birth_place_in_the_birth_place_text_box() {
        registerPage.birthPlaceTextBox.sendKeys(faker.address().city());
    }

    @Given("user enters the phone in the phone text box")
    public void user_enters_the_phone_in_the_phone_text_box() {
        registerPage.phoneNumberTextBox.sendKeys(faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4));
        // bunu methoda cevirebiliriz
    }

    @Given("user selects a gender")
    public void user_selects_a_gender() {
        registerPage.maleRadioButton.click();
    }

    @Given("user enters the date of birth in the date of birth text box")
    public void user_enters_the_date_of_birth_in_the_date_of_birth_text_box() {
        registerPage.birthdayCalender.sendKeys("12121999");
    }

    @Given("user enters the ssn in the ssn text box")
    public void user_enters_the_ssn_in_the_ssn_text_box() {
        registerPage.SSNTextBox.sendKeys(faker.idNumber().ssnValid());
    }

    @Given("user enters the username in the username text box")
    public void user_enters_the_username_in_the_username_text_box() {
        registerPage.usernameTextBox.sendKeys(faker.name().username());
    }

    @Given("user enters the password in the password text box")
    public void user_enters_the_password_in_the_password_text_box() {
        registerPage.passwordTextBox.sendKeys(faker.internet().password());
    }

    @When("user clicks the submit button")
    public void user_clicks_the_submit_button() {
        ReusableMethods.clickWithJS(registerPage.registerSubmitButton);
    }

    @Then("user verifies that the registration is successful")
    public void user_verifies_that_the_registration_is_successful() {
        Assert.assertEquals(ReusableMethods.waitForVisibility(registerPage.alertMessage, 2).getText(), "Guest User registered.");
    }

}
