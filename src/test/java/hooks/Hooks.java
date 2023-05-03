package hooks;

import baseurl.BaseUrl;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp() {
        //Driver.getDriver().get("http://139.59.159.36:3000/");
//        BaseUrl.setUp();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }

    @After
    public void tearDownScenarios(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed-scenario-" + scenario.getName());
            Driver.closeDriver();
        }
    }

}