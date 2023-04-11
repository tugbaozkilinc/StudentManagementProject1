package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class DeanManagement {

    public DeanManagement() {
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

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='text-white text-white justify-content-center text-center navbar-brand']")
    public WebElement user;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement submitButtonInLogin;

    @FindBy(xpath = "//*[text()='Vice dean Saved']")
    public WebElement successfulMessage;

    @FindBy(xpath = "(//*[text()='Required'])[1]")
    public WebElement nameRequiredText;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surnameRequiredText;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequiredText;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement dateOfBirthRequiredText;





}
