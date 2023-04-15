package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagement {
    public MeetManagement() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//h5)[1]")
    public WebElement addMeetText;
    @FindBy(xpath = "//*[@id='react-select-2-live-region']")
    public WebElement chooseStudentTextBox;

    @FindBy(xpath = "//*[@id='date']")
    public WebElement dateOfMeetTextBox;

    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTimeTextBox;

    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stopTimeTextBox;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement submitButton;

    @FindBy(xpath = "(//h5)[2]")
    public WebElement MeetText;

    @FindBy(xpath = " (//*[@type='button'])[6]")
    public WebElement editButton;

    @FindBy(xpath = " (//*[@type='button'])[7]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id='react-select-4-placeholder']")
    public WebElement chooseStudentTextBoxInEdit;

    @FindBy(xpath = "//*[@id='date']")
    public WebElement dateTextBoxInEdit;

    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTimeTextBoxInEdit;

    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stopTimeTextBoxInEdit;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement descriptionTextBoxInEdit;



    @FindBy(xpath = " (//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButtonInEdit;

}