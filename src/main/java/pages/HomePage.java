package pages;

import core.utils.CommonActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import pageobjects.HomePageObjects;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rajesh
 */
public class HomePage extends HomePageObjects {
    AppiumDriver driver;
    CommonActions commonActions;

    public HomePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        commonActions = new CommonActions(driver);
    }

    /**
     * We can handle different ways to navigate to homePage
     * Just handling login with hardcoded user details.
     * Username password should be put in any file
     */
    public void navigateToHomePage() {
        new LoginPage(driver).doLogin("8904423701", "123456");
    }


    public HomePage clickAddCustomer() {
        commonActions.clickElement(addCustomerButton);
        return new HomePage(driver);

    }

    /**
     * Just adding a customer without phone
     * Entering phone number flow can be separated
     * Just skipping
     */
    public HomePage enterNewCustomer(String customerName) {
        commonActions.enterText(addUserNameTextField, customerName);
        commonActions.clickElement(nameOkButton);
        commonActions.clickElement(phoneOkButton);
        return new HomePage(driver);
    }

    public void addNewUser(String userName) {
        clickAddCustomer()
                .enterNewCustomer(userName);
    }

    public List<String> getListOfUsers() {

        /**
         * Hardcoding navigating back
         * Ideally will call navigate to home method
         * Navigate to home methhod will decide either go back or login based on app current screen state.
         * */
        driver.navigate().back();
        List<String> listOfUserName = new ArrayList<String>();


        /**
         * Also there can be case that list of user is very long so we have to scroll the page and add all the users on page to the list*/
        for (WebElement element : listOfUsers
        ) {
            listOfUserName.add(commonActions.getTextOfElement(element));
        }
        return listOfUserName;
    }

}
