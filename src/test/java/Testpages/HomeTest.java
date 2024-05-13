package Testpages;

import org.testng.annotations.Test;
import Pages.LoginPage;

public class HomeTest extends BaseTest {
    @Test
    public void AssetHomePage() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
    }

}



