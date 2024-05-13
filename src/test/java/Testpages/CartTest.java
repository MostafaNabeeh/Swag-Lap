package Testpages;

import org.testng.annotations.Test;
import Pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void AssertChartPage() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart()
                .moveToCartPage();
    }


    @Test
    public void validCheckoutButton() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart()
                .moveToCartPage()
                .checkOutButton();
    }


}
