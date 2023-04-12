package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pages.GuestListPage;
import pages.HomePage;
import pages.MainMenu;
import utilities.Driver;
import utilities.ReusableMethods;

public class GuestUserListStepDefinitions {

        public GuestUserListStepDefinitions() {
            PageFactory.initElements(Driver.getDriver(), this);

    }

    HomePage homePage = new HomePage();
    GuestListPage guestListPage = new GuestListPage();
    MainMenu mainMenu = new MainMenu();

    @Given("user clicks the Menu button")
    public void user_clicks_the_menu_button() {
        homePage.menuButton.click();

    }
    @Given("user clicks the Guest User button")
    public void user_clicks_the_guest_user_button() {
        mainMenu.guestUser.click();
    }
    @Then("user verifies Name Surname header on Guest User List")
    public void user_verifies_name_surname_header_on_guest_user_list() {
        assert guestListPage.nameSurnameHeader.isDisplayed();
        assert guestListPage.nameSurnameHeaderList.size()>0;
    }
    @Then("user verifies Phone Number header on Guest User List")
    public void user_verifies_phone_number_header_on_guest_user_list() {
        assert guestListPage.phoneNumberHeader.isDisplayed();
        assert guestListPage.phoneNumberHeaderList.size()>0;
    }
    @Then("user verifies Ssn header on Guest User List")
    public void user_verifies_ssn_header_on_guest_user_list() {
        assert guestListPage.ssnHeader.isDisplayed();
        assert guestListPage.ssnHeaderList.size()>0;
    }
    @Then("user verifies And user Name header on Guest User List")
    public void user_verifies_and_user_name_header_on_guest_user_list() {
        assert guestListPage.userNameHeader.isDisplayed();
        assert guestListPage.userNameHeaderList.size()>0;
    }

    @Given("user clicks the Delete button on Guest User List")
    public void user_clicks_the_delete_button_on_guest_user_list() {
        guestListPage.deleteButton.click();
    }
    @Then("user verifies {string} text message")
    public void user_verifies_text_message(String string) {
        ReusableMethods.waitForVisibility(guestListPage.deletedMessage, 10);
        assert string.equalsIgnoreCase(guestListPage.deletedMessage.getText());

    }




}
