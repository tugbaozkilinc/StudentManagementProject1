package stepdefinitions.gridstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TitleTestStepDef {
    WebDriver driver;
    @Given("user is on the homepage {string} by chrome")
    public void user_is_on_the_homepage_by_chrome(String string) throws MalformedURLException {

        driver=new RemoteWebDriver(new URL("http://192.168.1.55:4444"),new ChromeOptions());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(string);

    }
    @Then("verify title is {string}")
    public void verify_title_is(String string) {

        Assert.assertEquals(string,driver.getTitle());

    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {

      //  driver.quit();

    }
    @Given("user is on the homepage {string} by edge")
    public void user_is_on_the_homepage_by_edge(String string) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://192.168.1.55:4444"),new EdgeOptions());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(string);
    }
    @Given("user is on the homepage {string} by mozilla")
    public void user_is_on_the_homepage_by_mozilla(String string) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://192.168.1.55:4444"),new FirefoxOptions());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(string);
    }
}
