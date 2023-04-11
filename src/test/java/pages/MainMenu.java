package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainMenu {

    public MainMenu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(linkText = "Admin Management")
    public WebElement adminManagement;

    @FindBy(linkText = "Dean Management")
    public WebElement deanManagement;

    @FindBy(linkText = "Vice Dean Management")
    public WebElement viceDeanManagement;

    @FindBy(linkText = "Lesson Management")
    public WebElement lessonManagement;

    @FindBy(linkText = "Teacher Management")
    public WebElement teacherManagement;

    @FindBy(linkText = "Student Management")
    public WebElement studentManagement;

    @FindBy(linkText = "Student Info Management")
    public WebElement studentInfoManagement;

    @FindBy(linkText = "Meet Management")
    public WebElement meetManagement;

    @FindBy(linkText = "Choose Lesson")
    public WebElement chooseLesson;

    @FindBy(linkText = "Contact Get All")
    public WebElement contactGetAll;


    @FindBy(linkText = "Guest User")
    public WebElement guestUser;

    @FindBy(linkText = "Logout")
    public WebElement logout;


}
