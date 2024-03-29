package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.ContactPage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ContactMessageStepDefinitions {

    public ContactMessageStepDefinitions() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    HomePage homePage = new HomePage();
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();


    @Given("user clicks on the Contact button")
    public void user_clicks_on_the_contact_button() {
        homePage.contactButton.click();

    }
    @Given("user enters a valid name value in the Your Name textbox on Contact Page")
    public void user_enters_a_valid_name_value_in_the_your_name_textbox_on_contact_page() {
        contactPage.name.sendKeys(faker.name().firstName());
    }
    @Given("user enters a valid email value in the Your Email textbox on Contact Page")
    public void user_enters_a_valid_email_value_in_the_your_email_textbox_on_contact_page() {
        contactPage.email.sendKeys(faker.internet().emailAddress());
    }
    @Given("user enters a valid subject value in the Subject textbox on Contact Page")
    public void user_enters_a_valid_subject_value_in_the_subject_textbox_on_contact_page() {
        contactPage.subject.sendKeys(faker.lorem().word());
    }
    @Given("user enters a valid message in the Message textbox on Contact Page")
    public void user_enters_a_valid_message_in_the_message_textbox_on_contact_page() {
        contactPage.message.sendKeys(faker.lorem().paragraph());
    }
    @Given("user clicks the Send Message button")
    public void user_clicks_the_send_message_button() {
        ReusableMethods.clickWithJS(contactPage.sendMessageButton);
    }
    @Then("user verifies the verification message")
    public void user_verifies_the_verification_message() {
        ReusableMethods.waitForVisibility(contactPage.verificationMessage, 10);
        assert contactPage.verificationMessage.isDisplayed();
    }

    @Given("user enters a {string} value in the Your Name textbox on Contact Page")
    public void user_enters_a_value_in_the_your_name_textbox_on_contact_page(String string) {
        contactPage.name.sendKeys(string);

    }
    @Given("user enters an {string} value in the your email textbox on Contact Page")
    public void user_enters_an_value_in_the_your_email_textbox_on_contact_page(String string) {
        contactPage.email.sendKeys(string);
    }
    @Given("user enters a {string} value in the subject textbox on Contact Page")
    public void user_enters_a_value_in_the_subject_textbox_on_contact_page(String string) {
        contactPage.subject.sendKeys(string);
    }
    @Given("user enters a {string} in the message textbox on Contact Page")
    public void user_enters_a_in_the_message_textbox_on_contact_page(String string) {
        contactPage.message.sendKeys(string);
    }
    @Given("user gets {string}")
    public void user_gets(String string) {
        ReusableMethods.waitForVisibility(contactPage.validEmailAlert, 3);
        assert string.equalsIgnoreCase(contactPage.validEmailAlert.getText());

     //   Boyut 5 - 80 Arası olmalı/,

    }

    @Given("user enters a name value with {int} characters in the Your Name textbox on Contact Page")
    public void user_enters_a_name_value_with_characters_in_the_your_name_textbox_on_contact_page(Integer int1) {
        contactPage.name.sendKeys(faker.lorem().characters(int1));
    }
    @Given("user enters a email value in the Your Email textbox on Contact Page")
    public void user_enters_a_email_value_in_the_your_email_textbox_on_contact_page() {
        contactPage.email.sendKeys(faker.internet().emailAddress());
    }
    @Given("user enters a subject value with {int} characters in the Subject textbox on Contact Page")
    public void user_enters_a_subject_value_with_characters_in_the_subject_textbox_on_contact_page(Integer int1) {
        contactPage.subject.sendKeys(faker.lorem().characters(int1));
    }
    @Given("user enters a message with {int} sentence in the Message textbox on Contact Page")
    public void user_enters_a_message_with_sentence_in_the_message_textbox_on_contact_page(Integer int1) {
        contactPage.message.sendKeys(faker.lorem().sentence(int1));
    }


    @Then("user gets the warning message about boundary")
    public void userGetsTheWarningMessageAboutBoundary() {
        ReusableMethods.waitForVisibility(contactPage.boundaryAlert, 3);
        assert contactPage.boundaryAlert.isDisplayed();
    }
}
