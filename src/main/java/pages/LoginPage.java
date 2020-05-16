package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.LoginPageObjects;

/**
 * @author Rajesh
 */
public class LoginPage extends LoginPageObjects {

    AppiumDriver driver;

    public LoginPage(AppiumDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, LoginPageObjects.class);
    }

    public LoginPage enterMobile(String mobile)
    {
        mobileNumber.
    }



}
