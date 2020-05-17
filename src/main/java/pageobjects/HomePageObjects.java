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
public class HomePageObjects {

    public HomePageObjects(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "noti_close")
    public WebElement lockNotification;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "btn_title")
    public WebElement addCustomerButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "balance")
    public WebElement balance;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "input_name")
    public WebElement addUserNameTextField;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "button_container_name")
    public WebElement nameOkButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "input_phone")
    public WebElement phoneTextField;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "buttonContainer")
    public WebElement phoneOkButton;


}
