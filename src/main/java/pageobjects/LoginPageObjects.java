package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

/**
 * @author Rajesh
 */
public class LoginPageObjects {


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "in.okcredit.merchant:id/mobile")
    public WebElement mobileNumber;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "in.okcredit.merchant:id/ok")
    public WebElement okButton;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "")
    public WebElement password;






}
