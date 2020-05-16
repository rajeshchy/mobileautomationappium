package core.drivers;

import core.utils.PropertyUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Rajesh
 */
public class CreateAndroidDriver {

    private PropertyUtils propertyUtils;
    private DesiredCapabilities capabilities;
    public AndroidDriver driver;
    private AppiumServer appiumServer;


    public AndroidDriver createAndroidDriver() {
        propertyUtils = new PropertyUtils("devices.properties");
        File apkFilePath = new File(System.getProperty("user.dir") + "/src/main/resources/okcredit.apk");

        capabilities.setCapability(MobileCapabilityType.APP, apkFilePath.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, propertyUtils.getProperty("driverType"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertyUtils.getProperty("version"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, propertyUtils.getProperty("name"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, propertyUtils.getProperty("app_package"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, propertyUtils.getProperty("app_activity"));

            driver = new AndroidDriver(appiumServer.startAppiumServer(), capabilities);

        return driver;
    }
}
