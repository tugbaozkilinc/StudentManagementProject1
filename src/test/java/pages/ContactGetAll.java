package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ContactGetAll {

    public ContactGetAll() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Contact Message']")
    public WebElement contactMessageTitle;

    @FindBy(xpath = "//*[.='Name']")
    public WebElement nameTitle;

    @FindBy(xpath = "//*[.='Email']")
    public WebElement emailTitle;

    @FindBy(xpath = "//*[.='Date']")
    public WebElement dateTitle;

    @FindBy(xpath = "//*[.='Subject']")
    public WebElement subjectTitle;

    @FindBy(xpath = "//*[.='Message']")
    public WebElement messageTitle;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[1]")
    public WebElement nameValue;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[2]")
    public WebElement emailValue;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[3]")
    public WebElement dateValue;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[4]")
    public WebElement subjectValue;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[5]")
    public WebElement messageValue;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td")
    public List<WebElement> allInformationInFirstRow;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//thead//th")
    public List<WebElement> allTitles;

}
