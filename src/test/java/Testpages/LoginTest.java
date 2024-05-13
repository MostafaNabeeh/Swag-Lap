package Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.verifyValidLogin());

    }


    @Test
    public void inValid() {
        new LoginPage(driver).login("standard_user", "12345678");
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.verifyUnValidLogin());
    }


}












