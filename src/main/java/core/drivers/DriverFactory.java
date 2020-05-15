package core.drivers;

import core.exceptions.PlatformNotFoundException;
import io.appium.java_client.AppiumDriver;

/**
 * @author Rajesh
 */
public class DriverFactory {

    AppiumDriver driver;

    public AppiumDriver getDriver(String platForm) throws PlatformNotFoundException {
        if (platForm.equalsIgnoreCase("android")) {
            CreateAndroidDriver createDriver = new CreateAndroidDriver();
            driver = createDriver.createAndroidDriver();
            return driver;

        }
        if (platForm.equalsIgnoreCase("ios")) {
            CreateIOSDriver createIOSDriver = new CreateIOSDriver();
            driver = createIOSDriver.createIOSDriver();
            return driver;

        }
        if (platForm.equalsIgnoreCase("mweb")) {

        } else {
            throw new PlatformNotFoundException();

        }

        return null;
    }
}
