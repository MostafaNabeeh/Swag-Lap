package Testpages;

import org.testng.annotations.Test;
import Pages.LoginPage;

public class ProductTest extends BaseTest {


    String expectedPrice = "$15.99";

    @Test
    public void validProductPrice() {
        new LoginPage(driver).login("standard_user", "secret_sauce");

    }


    @Test
    public void validAddToChart() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart();
    }


}
