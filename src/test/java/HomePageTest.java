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
        System.out.println("ruk bhai");
        homePage = new HomePage(driver);
        homePage.navigateToHomePage();
    }



    @Test(description = "This test case verifies that user is added in homePage")
    public void verifyUserIsAdded()
    {
        System.out.println("Yoooooooooooooo");

    }


}