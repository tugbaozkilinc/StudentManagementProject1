package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ChooseLesson extends BasePage {

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

    @FindAll({@FindBy(xpath = "(//tbody)[1]//tr//td[2]//span")})
    public List<WebElement> lessonList;

    @FindAll({@FindBy(xpath = "(//tbody)[1]//tr//td[1]//input")})
    public List<WebElement> checkboxList;






}
