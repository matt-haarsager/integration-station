import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import utils.DriverProperties;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static utils.WebDriverService.getDriverProperties;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setupWebDriver() throws IOException {
        DesiredCapabilities capabilities = createCapabilities();
        try {
            driver = new RemoteWebDriver(new URL(getHubUrl()), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private DesiredCapabilities createCapabilities() throws IOException {
        DriverProperties config = getDriverProperties();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(System.getProperty("browserName"));
        //capabilities.setBrowserName("firefox");
        return capabilities;
    }

    //System.get property  hub URL - specify  IP as part of  mavenn command
    private String getHubUrl() throws IOException {
        DriverProperties config = getDriverProperties();
        return config.getHubUrl();
    }

    @AfterMethod(alwaysRun = true)
    public void killBrowserSession() {
        driver.quit();
    }

}
