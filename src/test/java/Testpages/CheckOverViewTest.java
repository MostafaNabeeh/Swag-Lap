package Testpages;

import org.testng.annotations.Test;
import Pages.*;

public class CheckOverViewTest extends BaseTest {

    @Test
    public void AssertPaymentPage() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart()
                .moveToCartPage()
                .checkOutButton()
                .fillFields("mostafa", "nabeeh", "mn");
    }


    @Test
    public void ValidFinishButton() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart()
                .moveToCartPage()
                .checkOutButton()
                .fillFields("mostafa", "nabeeh", "mn")
                .clickOnFinishButton();

    }


}
