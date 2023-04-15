package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagement {
    public StudentInfoManagement() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h5)[1]")
    public WebElement studentInfoText;
    @FindBy(xpath = "//*[@id='lessonId']")
    public WebElement chooseLessonTextBox;

    @FindBy(xpath = "//*[@id='studentId']")
    public WebElement chooseStudentTextBox;

    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement chooseEducationTermTextBox;

    @FindBy(xpath = "//*[@id='absentee']")
    public WebElement absenteeTextBox;

    @FindBy(xpath = "//*[@id='midtermExam']")
    public WebElement midtermExamTextBox;


    @FindBy(xpath = "//*[@id='finalExam']")
    public WebElement finalExamTextBox;

    @FindBy(xpath = "//*[@id='infoNote']")
    public WebElement infoNoteTextBox;

    @FindBy(xpath = " (//*[@type='button'])[5]")
    public WebElement submitButton;

    @FindBy(xpath = "(//h5)[2]")
    public WebElement studentInfoListText;


    @FindBy(xpath = "(//*[@class='btn btn-danger'])[1]")
    public WebElement deleteButtonInStudentInfo;
    @FindBy(xpath = "(//*[@class='fa-solid fa-pencil'])[1]")
    public WebElement editButtonInStudentInfo;


    @FindBy(xpath = "(//*[@class='fw-semibold m-2 form-label'])[4]")
    public WebElement nameTextInStudentInfo;


//   /html/body/div[3]/div[2]/div/div/div/form/div/div[1]/span
    // //*[@class='mt-2 col-md-auto']//span
    @FindBy(xpath = "//*[@id='lessonId']")
    public WebElement lessonIdTextBox;

    @FindBy(xpath = "//*[@class='mt-2 col-md-auto']//span")
    public WebElement nameIsDisplayed;


    @FindBy(xpath = "//*[text()='Full authentication is required to access this resource']")
    public WebElement canNotEdit;


    @FindBy(xpath = " (//tr)[2]")
    public WebElement studentIsDisplayed;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement required;



    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement educationTermIdTextBox;

    @FindBy(xpath = "(//*[@id='absentee'])[2]")
    public WebElement absenteeTextBoxInStudentInfo;

    @FindBy(xpath = "(//*[@id='midtermExam'])[2]")
    public WebElement midtermExamTextBoxInStudentInfo;

    @FindBy(xpath = "(//*[@id='finalExam'])[2]")
    public WebElement finalExamTextBoxInStudentInfo;

    @FindBy(xpath = "(//*[@id='infoNote'])[2]")
    public WebElement infoNoteTextBoxInStudentInfo;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButtonInStudentınfo;









}
