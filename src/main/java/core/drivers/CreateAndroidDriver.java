package core.drivers;

import core.utils.PropertyUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;

/**
 * @author Rajesh
 */
public class CreateAndroidDriver {

    private PropertyUtils propertyUtils;
    private DesiredCapabilities capabilities;
    public AndroidDriver driver;


    public AndroidDriver createAndroidDriver(String deviceName) {
        propertyUtils = new PropertyUtils("devices.properties");
        File apkFilePath = new File(System.getProperty("user.dir") + "/src/main/resources/okcredit.apk");

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, apkFilePath.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, propertyUtils.getProperty("driverType"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertyUtils.getProperty(deviceName+".version"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, propertyUtils.getProperty("app_package"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, propertyUtils.getProperty("app_activity"));
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);

        driver = new AndroidDriver(new AppiumServer().startCustomisedAppiumService(), capabilities);

        return driver;
    }
}
