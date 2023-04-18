package stepdefinitions.uistepdefinitions;

import org.openqa.selenium.WebElement;
import pages.ChooseLesson;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Deneme {

    static HomePage homePage = new HomePage();
    static LoginPage loginPage = new LoginPage();
    static ChooseLesson chooseLesson = new ChooseLesson();

    public static void main(String[] args) throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        homePage.loginButton.click();
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("student"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("studentpassword"));
        loginPage.submitLoginButton.click();

        Thread.sleep(6000);

        chooseLesson("T09Lesson01", "T09Lesson02");

    }


    public static void chooseLesson(String... lessonNames) {
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
