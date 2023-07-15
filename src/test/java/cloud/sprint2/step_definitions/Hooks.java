package cloud.sprint2.step_definitions;

import cloud.sprint2.pages.loginPage;
import cloud.sprint2.utilities.BrowserUtils;
import cloud.sprint2.utilities.ConfigurationReader;
import cloud.sprint2.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    loginPage loginPage = new loginPage();

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        loginPage.login();

    }



    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        System.out.println("This is how @After annotation is working, after each scenario");
        Driver.closeDriver();



    }
}
