package core.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Rajesh
 */
public class CommonActions {

    AppiumDriver driver;

    public CommonActions(AppiumDriver driver) {
        this.driver = driver;
    }


    public void clickElement(WebElement element) {
        waiForAnElement(element);
        element.click();
    }

    public void enterText(WebElement element, String text) {
        clickElement(element);
        try {
            element.sendKeys(text);

        } catch (Exception e) {
            Actions action = new Actions(driver);
            action.sendKeys(text).perform();

        }

    }

    public boolean isElementDisplayed(WebElement element) {
        return true;

    }

    public void waiForAnElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
}
