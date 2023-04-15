package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;


    //---------------------------------------------------

    @FindBy(xpath = "//*[text()='Required']")
    public List<WebElement> requiredMessageList;

    @FindBy(xpath = "(//*[text()='Required'])[1]")
    public WebElement generalRequiredText;


    //-------------------------------------------------------

    @FindBy(xpath = "//table//tr//th[1]")
    public WebElement nameSurnameHeaderInDeanList;
    @FindBy(xpath = "//table//tr//th[1]")
    public WebElement genderHeaderInDeanList;

    @FindBy(xpath = "//table//tr//th[1]")
    public WebElement phoneNumberHeaderInDeanList;

    @FindBy(xpath = "//table//tr//th[1]")
    public WebElement ssnHeaderInDeanList;

    @FindBy(xpath = "//table//tr//th[1]")
    public WebElement usernameHeaderInDeanList;


    @FindBy(xpath = "//span[normalize-space()='»']")
    public WebElement lastPageButton;

    @FindBy(xpath = "//tbody//tr[last()]//td[last()]//button")
    public WebElement lastDeanEditButton;


    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editCardName;


    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[2]")
    public WebElement editCardSurname;

    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[3]")
    public WebElement editCardBirthPlace;


    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[4]")
    public WebElement editCardGender;

    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[6]")
    public WebElement editDateOfBirth;

    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[7]")
    public WebElement editCardPhone;

    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[8]")
    public WebElement editCardSSN;

    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[9]")
    public WebElement editCardUserName;

    @FindBy(xpath = "((//div[@class='card-body'])[3]//form//div//div//div//input)[10]")
    public WebElement editCardPassword;

    @FindBy(xpath = "(//div[@class='card-body'])[3]//form//div//div[10]//div//button")
    public WebElement editCartSubmitButton;



//-------------------------------------------------------------

    @FindBy(xpath = "//div[@role='alert']//div[2]")
    public WebElement alertMessage;

    @FindBy(xpath = "//*[text()='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement phoneTextBoxMessage;

    @FindBy(xpath = "//div[normalize-space()='Minimum 8 character']")
    public WebElement passwordMin8Char;



    public static void withActionsEditTextBox(WebElement element,String text) {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.sendKeys(Keys.BACK_SPACE).perform();
        element.sendKeys(text);
    }

}
