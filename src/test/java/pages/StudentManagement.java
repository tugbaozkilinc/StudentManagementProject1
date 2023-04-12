package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//div[@role='alert']//div[2]")
    public WebElement alertMessage;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement createStudentSubmitButton;

    @FindBy(xpath = "//*[@id='name']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderNameTextBox;

    @FindBy(xpath = "//*[@id='surname']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderSurnameTextBox;

    @FindBy(xpath = "//*[@id='birthPlace']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderBirthPlaceTextBox;

    @FindBy(xpath = "//*[@id='email']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderEmailTextBox;

    @FindBy(xpath = "//*[@id='phoneNumber']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderPhoneTextBox;

    @FindBy(xpath = "//*[@id='birthDay']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderDateOfBirthTextBox;

    @FindBy(xpath = "//*[@id='ssn']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderSsnTextBox;

    @FindBy(xpath = "//*[@id='username']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderUserNameTextBox;

    @FindBy(xpath = "//*[@id='fatherName']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderFatherNameTextBox;

    @FindBy(xpath = "//*[@id='motherName']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderMotherNameTextBox;

    @FindBy(xpath = "//*[@id='password']/following-sibling::div[@class='invalid-feedback']")
    public WebElement warningTextUnderPasswordTextBox;

    @FindBy(xpath = "//*[@class='col']//ul//li[4]")
    public WebElement paginationLastPageButton;

    @FindBy(xpath = "//*[@class='col']//ul//li[1]")
    public WebElement paginationFirstPageButton;

    @FindBy(xpath = "//*[@class='col']//ul//li[3]")
    public WebElement paginationNextPageButton;

    @FindBy(xpath = "//*[@class='col']//ul//li[2]")
    public WebElement paginationPreviousPageButton;

    @FindAll({@FindBy(xpath = "//*[@class='table-responsive']//tbody//tr//td[1]")})
    public List<WebElement> studentNumbersListOnCurrentPage;

}
