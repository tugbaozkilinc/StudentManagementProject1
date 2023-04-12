package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminManagement {
    public AdminManagement() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement nameTextBox;

    @FindBy(id = "surname")
    public WebElement surNameTextBox;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceTextBox;

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement maleleRadioButton;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirthTexBox;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "ssn")
    public WebElement ssnNumberTextBox;

    @FindBy(id = "username")
    public WebElement userNameTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement createAdminSubmitButton;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

    @FindBy(xpath = "//*[.='Minimum 8 character']")
    public WebElement passwordAlert;


    @FindAll({@FindBy(xpath = "//*[@class='invalid-feedback']")})
    public List<WebElement> requiredTextList;


}
