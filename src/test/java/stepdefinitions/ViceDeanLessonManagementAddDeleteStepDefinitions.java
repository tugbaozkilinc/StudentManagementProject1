package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.HomePage;
import pages.LessonManagement;
import pages.LoginPage;

import utilities.ConfigReader;
import utilities.Driver;

import java.util.Locale;

public class ViceDeanLessonManagementAddDeleteStepDefinitions {

    LessonManagement lessonManagement=new LessonManagement();
   LoginPage loginPage=new LoginPage();
    HomePage homePage = new HomePage();
    Faker faker = new Faker(Locale.US);


 @Given("user clicks on the login button")
 public void user_clicks_on_the_login_button() {
homePage.loginButton.click();
 }
    @Given("user enters the {string} in the username textbox on the login page")
    public void user_enters_the_in_the_username_textbox_on_the_login_page(String string) {
     loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("vicedean"));
    }
    @Given("user enters the {string} in the password textbox on the login page")
    public void user_enters_the_in_the_password_textbox_on_the_login_page(String string) {
    loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("vicedeanpassword"));
    }
    @Given("user clicks the login button on the login page")
    public void user_clicks_the_login_button_on_the_login_page() {
       loginPage.submitLoginButton.click();
    }
    @Given("User click lesson management")
    public void user_click_lesson_management() {
        lessonManagement.lessonsButton.click();
    }
    @Given("user click lesson area")
    public void user_click_lesson_area() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"lessonName\"]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).perform();

    }
    @Given("user enters a valid value {string} lesson name")
    public void user_enters_a_valid_value_lesson_name(String string) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"lessonName\"]"));
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(element,"Pythoonn").perform();
    }
    @Given("user sign Compulsory choice")
    public void user_sign_compulsory_choice() {
        lessonManagement.compulsoryCheckBox.click();
    }
    @Given("user enter valid value {string} credit score")
    public void user_enter_valid_value_credit_score(String string) {
      lessonManagement.creditScoreTextBox.click();
      lessonManagement.creditScoreTextBox.sendKeys("4");
    }
    @When("User click Submit Button")
    public void user_click_submit_button() {
       lessonManagement.SubmitButton.click();
    }
    @Then("user verify {string} caution")
    public void user_verify_caution(String string) {

    }
    // TC02 ------------------------------------------------------------
    @Given("User enters an empty value in the lesson name field")
    public void user_enters_an_empty_value_in_the_lesson_name_field() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"lessonName\"]"));
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(element," ").perform();
    }

    @Given("User enters a valid value in the credit score field")
    public void user_enters_a_valid_value_in_the_credit_score_field() {
        lessonManagement.creditScoreTextBox.click();
        lessonManagement.creditScoreTextBox.sendKeys("4");
    }
    @Given("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        lessonManagement.SubmitButton.click();
    }
    @Then("displays the user warning text")
    public void displays_the_user_warning_text() {

    }
    //TC03------------------------------------------------------

}
