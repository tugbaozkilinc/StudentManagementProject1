package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ViceDeanManagement {

    public ViceDeanManagement() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement nameTextBox;

    @FindBy(id = "surname")
    public WebElement surnameTextBox;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceTextBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "ssn")
    public WebElement SSNTextBox;

    @FindBy(id = "username")
    public WebElement usernameTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@class='text-white text-white justify-content-center text-center navbar-brand']")
    public WebElement user;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Vice dean Saved']")
    public WebElement successfulMessage;

    @FindBy(xpath = "//h3")
    public WebElement viceDeanManagementPage;

    @FindBy(css = "div[class='invalid-feedback']")
    public List<WebElement> requiredTexts;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement dateOfBirthErrorMessage;

    @FindBy(xpath = "//*[contains(text(), 'Minimum 12 character')]")
    public WebElement phoneMinimumOnIkiCharacterMessage;

    @FindBy(xpath = "//*[text()='Please enter valid phone number']")
    public WebElement phoneInvalidMessage;

    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssnMinimumOnBirCharacterMessage;

    @FindBy(xpath = "//*[text()='Please enter valid SSN number']")
    public WebElement ssnInvalidMessage;

    @FindBy(xpath = "//*[text()='Minimum 8 character']")
    public WebElement passwordInvalidMessage;

}
