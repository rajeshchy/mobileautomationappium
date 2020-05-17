package pages;

import io.appium.java_client.AppiumDriver;
import pageobjects.HomePageObjects;

/**
 * @author Rajesh
 */
public class HomePage extends HomePageObjects {
    AppiumDriver driver;

    public HomePage(AppiumDriver driver)
    {
        super(driver);
        this.driver = driver;
    }


    public void navigateToHomePage()
    {
       new LoginPage(driver).doLogin("8904423701","123456");
    }


}
