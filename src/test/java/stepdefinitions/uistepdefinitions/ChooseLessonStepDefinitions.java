package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ChooseLesson;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class ChooseLessonStepDefinitions {
    ChooseLesson chooseLesson = new ChooseLesson();

    @And("user confirms that Teacher visible for the first element in the Choose lesson list")
    public void userConfirmsThatTeacherVisibleForTheFirstElementInTheChooseLessonList() {
        assertTrue(ReusableMethods.waitForVisibility(chooseLesson.teacherText, 3).isDisplayed());
    }

    @And("user confirms that Day visible for the first element in the Choose lesson list")
    public void userConfirmsThatDayVisibleForTheFirstElementInTheChooseLessonList() {
        assertTrue(ReusableMethods.waitForVisibility(chooseLesson.dayText, 3).isDisplayed());
    }

    @And("user confirms that Start Day visible for the first element in the Choose lesson list")
    public void userConfirmsThatStartDayVisibleForTheFirstElementInTheChooseLessonList() {
        assertTrue(ReusableMethods.waitForVisibility(chooseLesson.startTimeText, 3).isDisplayed());
    }

    @And("user confirms that Stop Day visible for the first element in the Choose lesson list")
    public void userConfirmsThatStopDayVisibleForTheFirstElementInTheChooseLessonList() {
        assertTrue(ReusableMethods.waitForVisibility(chooseLesson.stopTimeText, 3).isDisplayed());
    }


    @And("And user clicks Submit button")
    public void andUserClicksSubmitButton() {
        ReusableMethods.clickWithJS(chooseLesson.submitButton);
    }

    @And("The user activates the checkbox opposite the course to be selected from the choose lesson section")
    public void theUserActivatesTheCheckboxOppositeTheCourseToBeSelectedFromTheChooseLessonSection() {
        chooseLesson.firstLessonCheckbox.click();
    }

    @Then("user sees Lesson added to Student message on Chose lesson page")
    public void userSeesLessonAddedToStudentMessageOnChoseLessonPage() {
        Assert.assertEquals(ReusableMethods.waitForVisibility(chooseLesson.lessonAddedAlert, 2).getText(), "Lesson added to Student");
    }


    @And("The user activates the checkboxes against the courses to be selected")
    public void theUserActivatesTheCheckboxesAgainstTheCoursesToBeSelected() {
        chooseLesson.secondLessonCheckbox.click();
    }

    @And("The user chooses a second lesson on the same day and time as the first lesson from the choose lesson section")
    public void theUserChoosesASecondLessonOnTheSameDayAndTimeAsTheFirstLessonFromTheChooseLessonSection() {
        chooseLesson("T09Lesson01","T09Lesson02");
    }

    public void chooseLesson(String... lessonNames) {
        int idx;
        for (String lessonName : lessonNames) {
            for (WebElement w : chooseLesson.lessonList) {
                if (w.getText().equals(lessonName)) {
                    idx = chooseLesson.lessonList.indexOf(w);
                    ReusableMethods.clickWithJS(chooseLesson.checkboxList.get(idx));
                    break;
                }
            }
        }
    }
}
