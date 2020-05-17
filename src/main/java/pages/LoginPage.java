package pages;

import core.utils.CommonActions;
import io.appium.java_client.AppiumDriver;
import pageobjects.LoginPageObjects;

/**
 * @author Rajesh
 */
public class LoginPage extends LoginPageObjects {

    AppiumDriver driver;
    CommonActions commonActions;

    public LoginPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        commonActions = new CommonActions(driver);
    }

    public LoginPage selectEnglish() {
        commonActions.clickElement(englishLanguage);
        return new LoginPage(driver);
    }

    public LoginPage clickGetStarted() {
        commonActions.clickElement(getStarted);
        return new LoginPage(driver);
    }


    public LoginPage enterMobile(String mobile) {
        commonActions.enterText(mobileNumber, mobile);
        return new LoginPage(driver);
    }

    public LoginPage clickOkButton() {
        commonActions.clickElement(okButton);
        return new LoginPage(driver);
    }

    public LoginPage enterPassword(String password) {
        commonActions.enterText(passwordField, password);
        return new LoginPage(driver);
    }


    public HomePage doLogin(String mobile, String password) {
        selectEnglish()
                .clickGetStarted()
                .enterMobile(mobile)
                .clickOkButton()
                .enterPassword(password)
                .clickOkButton();
        return new HomePage(driver);
    }


}
