package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePageObjects;

/**
 * @author Rajesh
 */
public class HomePage extends HomePageObjects {
    AppiumDriver driver;

    public HomePage(AppiumDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, HomePageObjects.class);
    }



    public void navigateToHomePage()
    {
       new LoginPage(driver).doLogin("8904423701","123456");
    }
}
