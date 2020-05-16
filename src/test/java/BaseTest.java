import core.drivers.DriverFactory;
import core.exceptions.PlatformNotFoundException;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


/**
 * @author Rajesh
 */
public class BaseTest {

    AppiumDriver driver;
    DriverFactory driverFactory;

    @Parameters("platform")
    @BeforeSuite
    public void beforeSuite(String platform)
    {
        driverFactory = new DriverFactory();

        try {
            driver = driverFactory.getDriver(platform);
        } catch (PlatformNotFoundException e) {
            e.printStackTrace();
        }
    }


    @AfterSuite
    public void afterSuite()
    {
        driver.quit();
    }
}
