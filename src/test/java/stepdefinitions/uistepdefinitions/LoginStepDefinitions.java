package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginStepDefinitions {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user login as Vice Dean")
    public void userLoginAsViceDean() {
        homePage.loginButton.click();
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("vicedean"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("vicedeanpassword"));
        loginPage.submitLoginButton.click();
    }

    @Given("user login as Dean")
    public void userLoginAsDean() {
        homePage.loginButton.click();
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("dean_username"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("dean_password"));
        loginPage.submitLoginButton.click();
    }

    @Given("user login as Admin")
    public void userLoginAsAdmin() {
        homePage.loginButton.click();
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("admin"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminpassword"));
        loginPage.submitLoginButton.click();
    }

    @Given("user login as Student")
    public void userLoginAsStudent() {
        homePage.loginButton.click();
        loginPage.usernameTextBox.sendKeys(ConfigReader.getProperty("student"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("studentpassword"));
        loginPage.submitLoginButton.click();
    }

}