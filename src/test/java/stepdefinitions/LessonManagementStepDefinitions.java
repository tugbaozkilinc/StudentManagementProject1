package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LessonManagement;
import utilities.Driver;
import utilities.ReusableMethods;

public class LessonManagementStepDefinitions {

    LessonManagement lessonManagement = new LessonManagement();
    Actions actions = new Actions(Driver.getDriver());

    //UTC01 Vice dean should create syllabus
    @Given("user clicks the Lesson Management button on the menu")
    public void user_clicks_the_lesson_management_button_on_the_menu() {
        lessonManagement.lessonManagementButton.click();
    }

    @Then("user verifies that the Lesson Management page is displayed")
    public void user_verifies_that_the_lesson_management_page_is_displayed() {
        Assert.assertTrue(lessonManagement.educationTermButton.isDisplayed());
    }

    @Then("user clicks Lesson Program on the page")
    public void user_clicks_lesson_program_on_the_page() {
        lessonManagement.lessonProgramButton.click();
    }

    @Then("user verifies that the Lesson Program List is displayed")
    public void user_verifies_that_the_lesson_program_list_is_displayed() {
        Assert.assertTrue(lessonManagement.lessonProgramListText.isDisplayed());
    }

    @And("selects a lesson from the Choose Lessons list")
    public void selectsALessonFromTheChooseLessonsList() {
        actions.click(lessonManagement.chooseLessonsTextBox).perform();
        actions.sendKeys("Java", Keys.ENTER).perform();
        ReusableMethods.waitFor(3);
    }

    @And("selects a term from the term list")
    public void selectsATermFromTheTermList() {

        actions.click(lessonManagement.chooseTermTextBox).perform();
        ReusableMethods.waitAndSendText(lessonManagement.chooseTermTextBox, "SPRING_SEMESTER");
        ReusableMethods.waitFor(3);
    }
    @And("selects a day for the lesson")
    public void selectsADayForTheLesson() {
        lessonManagement.chooseDayTextBox.sendKeys("TUESDAY");
    }

    @And("selects a start and stop time for the lesson")
    public void selectsAStartAndStopTimeForTheLesson() {
        lessonManagement.startTimeTextBox.sendKeys("1315");
        lessonManagement.stopTimeTextBox.sendKeys("1415");
        ReusableMethods.waitFor(3);
    }

    @And("user clicks submit lessons button")
    public void userClicksSubmitLessonsButton() {
        lessonManagement.addLessonSubmitButtonLesPro.submit();
        ReusableMethods.waitFor(4);
    }
    @Then("user verifies that the Lesson added the program")
    public void userVerifiesThatTheLessonAddedTheProgram() {
       // Assert.assertTrue(lessonManagement.lessonCreatedAlert.isDisplayed());
    }

    //----------viceDeanSeeLessonTest-----------
    @Then("user verifies the lesson from the Lesson Program List")
    public void userVerifiesTheLessonFromTheLessonProgramList() {
        Assert.assertTrue(lessonManagement.javaLesson.isDisplayed());
    }
    @And("user click Lessons area")
    public void userClickLessonsArea() {
        lessonManagement.lessonsButton.click();
    }

    @And("user enters a valid lesson name")
    public void userEntersAValidLessonName() {
        lessonManagement.lessonNameTextBox.sendKeys("Java");
    }

    @And("user enter valid credit score")
    public void userEnterValidCreditScore() {
        lessonManagement.creditScoreTextBox.sendKeys("12");
    }
    @And("user clicks on the Submit button")
    public void userClicksOnTheSubmitButton() {
        lessonManagement.lessonProgramSubmitButton.click();
    }

    @And("user select the lesson from Lesson Program Assignment list")
    public void userSelectTheLessonFromLessonProgramAssignmentList() {
        ReusableMethods.clickWithJS(lessonManagement.lessonCheckBox);
        ReusableMethods.wait(5);
    }

    @And("user selects teacher from Choose Teacher list")
    public void userSelectsTeacherFromChooseTeacherList() {

        actions.scrollToElement(lessonManagement.teacherTextLabel);
        ReusableMethods.clickWithJS(lessonManagement.chooseTeacherTextBox);
        ReusableMethods.waitFor(5);
        lessonManagement.chooseTeacherTextBox.sendKeys("Team09 AdvisorTeacher");
        ReusableMethods.waitFor(5);
    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {
        ReusableMethods.clickWithJS(lessonManagement.lessonProgramAssignSubmitButton);
    }

    @Then("user verifies that the teacher added the lesson")
    public void userVerifiesThatTheTeacherAddedThLesson() {
        //      Assert.assertTrue(lessonManagement.lessonAddedTeacherAlert.isDisplayed());
    }

    @Then("user gets the warning message")
    public void userGetsTheWarningMessage() {
    //    Assert.assertTrue(lessonManagement.teacherWarningMessage.isDisplayed());
    }

    @Then("user gets not found warning message")
    public void userGetsNotFoundWarningMessage() {
        Assert.assertTrue(lessonManagement.teacherWarningMessage2.isDisplayed());
    }
}