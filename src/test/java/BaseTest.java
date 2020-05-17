import core.drivers.AppiumServer;
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

    public static AppiumDriver driver;
    DriverFactory driverFactory;


    @Parameters({"platform","deviceName"})
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(String platform,String deviceName)
    {
        driverFactory = new DriverFactory();

        try {
            driver = driverFactory.getDriver(platform,deviceName);
            System.out.println("ruko");
        } catch (PlatformNotFoundException e) {
            e.printStackTrace();
        }
    }


    @AfterSuite(alwaysRun = true)
    public void afterSuite()
    {
        driver.quit();
        AppiumServer.stopAppiumServer();

    }
}
