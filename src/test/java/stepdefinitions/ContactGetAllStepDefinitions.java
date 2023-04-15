package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.ContactGetAll;
import pages.MainMenu;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactGetAllStepDefinitions extends AbstractClassVerifyingThePage{

    MainMenu mainMenu = new MainMenu();
    ContactGetAll contactGetAll = new ContactGetAll();
    @Given("user clicks on contact get all button in main menu")
    public void user_clicks_on_contact_get_all_button_in_main_menu() throws InterruptedException {
        mainMenu.contactGetAll.click();
    }

    @Given("user is navigated to contact message page")
    public void user_is_navigated_to_contact_message_page() {
        verifyingYouAreInCorrectPage(contactGetAll.contactMessageTitle);
    }

    @Override
    public void verifyingYouAreInCorrectPage(WebElement pageWebElement) {
        assertTrue(pageWebElement.isDisplayed());
    }

    @Then("user verifies that the information {string} is under title")
    public void userVerifiesThatTheInformationIsUnderTitle(String arg0) {
        assertTrue(ReusableMethods.waitForVisibility(contactGetAll.allInformationInFirstRow.get(Integer.parseInt(arg0)), 10).isDisplayed());
    }

    @And("user sees {string} title at {string}")
    public void userSeesTitleAt(String arg0, String arg1) {
        assertEquals(arg0, ReusableMethods.waitForVisibility(contactGetAll.allTitles.get(Integer.parseInt(arg1)), 10).getText());
    }

}
