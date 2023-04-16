package stepdefinitions.uistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LessonManagement;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Locale;

public class ViceDeanLessonManagementAddDeleteStepDef {
    LessonManagement lessonManagement=new LessonManagement();
      LoginPage loginPage=new LoginPage();
   HomePage homePage = new HomePage();
    Faker faker = new Faker(Locale.US);
    Actions actions=new Actions(Driver.getDriver());
    @And("user enters the {string} in the password textbox on the login page")
    public void userEntersTheInThePasswordTextboxOnTheLoginPage(String arg0) {
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("vicedeanpassword"));
    }

    @Given("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        homePage.loginButton.click();
    }

    @And("user enters the {string} in the username textbox on the login page")
    public void userEntersTheInTheUsernameTextboxOnTheLoginPage(String arg0) {
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("vicedean"));
    }

    @And("user clicks the login button on the login page")
    public void userClicksTheLoginButtonOnTheLoginPage() {
        loginPage.submitLoginButton.click();
    }

    @And("user click lesson area")
    public void userClickLessonArea() {
lessonManagement.lessonsButton.click();
    }

    @And("user enters a valid value {string} lesson name")
    public void userEntersAValidValueLessonName(String arg0) {
        actions.sendKeys(Keys.TAB).perform();
actions.sendKeys("PythonT9"+Keys.TAB).perform();
    }

    @And("user sign Compulsory choice")
    public void userSignCompulsoryChoice() {
     actions.click().perform();

    }

    @And("user enter valid value {string} credit score")
    public void userEnterValidValueCreditScore(String arg0) {
        actions.sendKeys(Keys.TAB).perform();
     actions.sendKeys("4").perform();
    }

    @When("User click Submit Button")
    public void userClickSubmitButton() {
     lessonManagement.lessonsSubmitButton.click();
    }

    @Then("user verify {string} caution")
    public void userVerifyCaution(String arg0) {

    }

    @And("User click lesson management")
    public void userClickLessonManagement() {
    }

    @And("User enters an empty value in the lesson name field")
    public void userEntersAnEmptyValueInTheLessonNameField() {
    }

    @And("User enters a valid value in the credit score field")
    public void userEntersAValidValueInTheCreditScoreField() {
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
    }

    @Then("displays the user warning text")
    public void displaysTheUserWarningText() {

    }

    @Given("user navigates to the specified URL")
    public void userNavigatesToTheSpecifiedURL() {

    }

    @And("user enters a valid value lesson name.")
    public void userEntersAValidValueLessonName() {

    }

    @And("the user mark compulsory option.")
    public void theUserMarkCompulsoryOption() {

    }

    @And("The user enters a valid value in the credit score field.")
    public void theUserEntersAValidValueInTheCreditScoreField() {

    }

    @And("The user clicks the submit button.")
    public void theUserClicksTheSubmitButton() {

    }

    @Then("The user sees that the course has been created.")
    public void theUserSeesThatTheCourseHasBeenCreated() {

    }

    @And("User enters a valid value in the lesson name field")
    public void userEntersAValidValueInTheLessonNameField() {

    }

    @And("User ticks compulsory")
    public void userTicksCompulsory() {

    }

    @And("user leaves credit score field blank")
    public void userLeavesCreditScoreFieldBlank() {

    }

    @Then("displays the user required warning")
    public void displaysTheUserRequiredWarning() {

    }

 @And("user enter start time")
 public void userEnterStartTime() {

 }

 @And("user clicks lesson management")
 public void userClicksLessonManagement() {
  lessonManagement.lessonsButton.click();
 }

    @And("user click lesson program")
    public void userClickLessonProgram() {
        lessonManagement.lessonProgramButton.click();
    }

    @And("user enter valid value choose lesson textbox")
    public void userEnterValidValueChooseLessonTextbox() {
//actions.sendKeys(Keys.TAB).perform();
actions.moveToElement(lessonManagement.chooseLessonsTextBox).sendKeys("Python_T09",Keys.ENTER).perform();
    }

    @And("user click valid value choose Day")
    public void userClickValidValueChooseDay() {
        actions.moveToElement(lessonManagement.chooseDayTextBox).click().perform();
        actions.moveToElement(lessonManagement.chooseMonday).click();
        actions.sendKeys(Keys.TAB);
    }

    @And("user choose education term")
    public void userChooseEducationTerm() {

    }

    @And("user enter stop time")
    public void userEnterStopTime() {
    }



    @Then("user see create lesson program")
    public void userSeeCreateLessonProgram() {
    }

    @And("user does not choose choose lesson textbox")
    public void userDoesNotChooseChooseLessonTextbox() {
    }

    @Then("user see required message")
    public void userSeeRequiredMessage() {
    }

    @And("user select choose lesson textbox")
    public void userSelectChooseLessonTextbox() {
    }

    @And("user don't click valid value choose Day")
    public void userDonTClickValidValueChooseDay() {
    }

    @And("user don't select choose education term")
    public void userDonTSelectChooseEducationTerm() {
    }

    @And("user select choose education term")
    public void userSelectChooseEducationTerm() {
    }

    @And("user don't enter stop time")
    public void userDonTEnterStopTime() {
    }

    @Then("user see required message below stop time")
    public void userSeeRequiredMessageBelowStopTime() {
    }
}
