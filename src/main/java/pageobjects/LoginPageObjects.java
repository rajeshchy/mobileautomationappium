package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Rajesh
 */
public class LoginPageObjects {

    public LoginPageObjects(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "english")
    public WebElement englishLanguage;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "getStarted")
    public WebElement getStarted;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "mobile")
    public WebElement mobileNumber;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "in.okcredit.merchant:id/ok")
    public WebElement okButton;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "password")
    public WebElement passwordField;

}
