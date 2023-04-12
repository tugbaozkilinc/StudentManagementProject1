package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id = "name")
    public WebElement name ;

    @FindBy (id = "email")
    public WebElement email;

    @FindBy (id = "subject")
    public WebElement subject;

    @FindBy (id = "message")
    public WebElement message;

    @FindBy (xpath = "//button[text()='Send Message']")
    public WebElement sendMessageButton ;

    @FindBy (xpath = "//*[text()='Contact Message Created Successfully']")
    public WebElement verificationMessage ;

    @FindBy (xpath = "//*[text()='Please enter valid email']")
    public WebElement validEmailAlert ;














}
