package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().get("https://www.managementonschools.com/");
    }

    @After
    public void tearDown() throws Exception {
        Driver.closeDriver();
    }

    @After //Cucumber dan geleni sec, junit tekini degil.
    public void tearDownScenarios(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed-scenario-" + scenario.getName());
            // Driver.closeDriver();
        }
    }

}
