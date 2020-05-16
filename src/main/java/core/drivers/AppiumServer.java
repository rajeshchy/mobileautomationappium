package core.drivers;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Rajesh
 */
public class AppiumServer {
    AppiumDriverLocalService appiumService;
    AppiumServiceBuilder serviceBuilder;

    public URL startAppiumServer() {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
        return appiumService.getUrl();
    }


    public URL startCustomisedAppiumService() {
        serviceBuilder = new AppiumServiceBuilder()
                .usingAnyFreePort()
                .withIPAddress("127.0.0.1")
                .withStartUpTimeOut(20000, TimeUnit.MILLISECONDS)
                .withArgument(GeneralServerFlag.LOG_LEVEL, "error");

        appiumService = AppiumDriverLocalService.buildService(serviceBuilder);
        appiumService.start();
        return appiumService.getUrl();

    }

    public void stopAppiumServer() {
        appiumService.stop();
    }
}
