package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeacherManagement {


    public TeacherManagement() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameTextBox;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlaceTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumberTextBox;

    @FindBy(xpath = "//input[@id='isAdvisorTeacher']")
    public WebElement isAdvisorTeacher;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthdayCalender;


    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement SSNTextBox;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement SubmitButton;

    @FindBy (xpath = "//button[@id='controlled-tab-example-tab-teachersList']")
    public WebElement teacher1;


    @FindBy(xpath = "//div[@role='alert']//div")
    public WebElement successMessage;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement required;


    @FindBy(xpath = "//div[contains(text(),'JSON parse error: Cannot coerce empty String (\"\") ')]")
    public WebElement errorMessage;
    @FindBy(xpath = "//div[normalize-space()='Minimum 8 character']")
    public WebElement passwordwarningText;
}
