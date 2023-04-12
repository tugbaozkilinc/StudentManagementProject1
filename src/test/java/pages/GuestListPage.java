package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuestListPage {

    public GuestListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//th[text()='Name Surname']")
    public WebElement nameSurnameHeader;

    @FindBy (xpath = "//th[text()='Phone Number']")
    public WebElement phoneNumberHeader;

    @FindBy (xpath = "//th[text()='Ssn']")
    public WebElement ssnHeader;

    @FindBy (xpath = "//th[text()='User Name']")
    public WebElement userNameHeader;

    @FindBy (xpath = "//tbody//tr//td[1]")
    public List<WebElement> nameSurnameHeaderList;

    @FindBy (xpath = "//tbody//tr//td[2]")
    public List<WebElement> phoneNumberHeaderList;

    @FindBy (xpath = "//tbody//tr//td[3]")
    public List<WebElement> ssnHeaderList;

    @FindBy (xpath = "//tbody//tr//td[4]")
    public List<WebElement> userNameHeaderList;

    @FindBy (xpath = "(//*[@type='button'])[8]")
    public WebElement deleteButton;

    @FindBy (xpath = "//*[text()=' Guest User deleted Successful']")
    public WebElement deletedMessage;












}
