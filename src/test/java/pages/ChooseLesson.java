package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class ChooseLesson {

    public ChooseLesson() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//*[.='Lesson'])[1]")
    public WebElement LessonText;

    @FindBy(xpath = "//*[.='Teacher']")
    public WebElement teacherText;

    @FindBy(xpath = "(//*[.='Day'])[1]")
    public WebElement dayText;


    @FindBy(xpath = "(//*[.='Start Time'])[1]")
    public WebElement startTimeText;


    @FindBy(xpath = "(//*[.='Stop Time'])[1]")
    public WebElement stopTimeText;

    @FindBy(xpath = "//*[@value='2']")
    public WebElement firstLessonCheckbox;

    @FindBy(xpath = "//*[@value='3']")
    public WebElement secondLessonCheckbox;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Lesson added to Student']")
    public WebElement lessonAddedAlert;


}
