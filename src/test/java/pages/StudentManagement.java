package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagement {

    public StudentManagement() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "advisorTeacherId")
    public WebElement advisorTeacherDropdown;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameTextBox;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlaceTextBox;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumberTextBox;

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

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='fatherName']")
    public WebElement fatherNameTextBox;

    @FindBy(xpath = "//input[@id='motherName']")
    public WebElement motherNameTextBox;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement createStudentSubmitButton;


}
