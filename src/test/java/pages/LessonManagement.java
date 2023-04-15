package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonManagement {

    public LessonManagement() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


@FindBy(xpath = "//button[@id='controlled-tab-example-tab-educationTerm']")
    public WebElement educationTermButton;

@FindBy(xpath = "//input[@id='startDate']")
    public WebElement startDateTextBox;

@FindBy(xpath = "//input[@id='endDate']")
    public WebElement endDateTextBox;

@FindBy(xpath = "//input[@id='lastRegistrationDate']")
    public WebElement lastRegistrationDateTextBox;

@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    public WebElement SubmitButton;

@FindBy(xpath = "//*[@id=\"controlled-tab-example-tab-lessonsList\"]")
    public WebElement lessonsButton;

@FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonNameTextBox;

 @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement compulsoryCheckBox;

@FindBy(xpath = "//input[@id='creditScore']")
    public WebElement creditScoreTextBox;

@FindBy(xpath = "(//button[@type='button'][normalize-space()='Submit'])[2]")
    public WebElement lessonsSubmitButton;

@FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public WebElement deleteButton;

@FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramButton;

@FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement chooseLessonsTextBox;

@FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDayTextBox;

@FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseTermTextBox;

@FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTimeTextBox;

@FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTimeTextBox;

@FindBy(xpath = "(//button[@type='button'][normalize-space()='Submit'])[3]")
    public WebElement lessonProgramSubmitButton;

@FindBy(xpath = "(//input[@id='lessonProgramId'])[1]")
    public WebElement lessonCheckBox;

@FindBy(xpath = "//select[@id='teacherId']")
    public WebElement chooseTeacherTextBox;

@FindBy(xpath = "(//button[@type='button'][normalize-space()='Submit'])[3]")
    public WebElement lessonProgramSubmitButton2;












}
