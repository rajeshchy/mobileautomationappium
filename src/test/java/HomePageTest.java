import core.utils.RandomStringGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

/**
 * @author Rajesh
 */
public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeTest
    public void beforeTest()
    {
        homePage = new HomePage(driver);
        homePage.navigateToHomePage();
    }

    @Test(description = "This test case verifies that user is added in homePage")
    public void verifyUserIsAdded()
    {
        String newUserName = RandomStringGenerator.generateString(5);
        homePage.addNewUser(newUserName);
        Assert.assertTrue(homePage.getListOfUsers().contains(newUserName));
    }
}
