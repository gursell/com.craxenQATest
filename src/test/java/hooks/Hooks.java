package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.PageLogout;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.URLReader;

public class Hooks {


    @Before
    public void beforeScenario() {
        Driver.getDriver().get(URLReader.getUrl("loginUrl"));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
        }
    }

   /*
   @After(order = 1)
    public void afterScenario() {
        PageLogout pageLogout = new PageLogout();
        pageLogout.logout();
        Driver.closeDriver();
    }

    */
}