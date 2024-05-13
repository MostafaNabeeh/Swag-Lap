package Testpages;

import org.testng.annotations.Test;
import Pages.*;

public class CheckInfoTest extends BaseTest {

    @Test
    public void AssertMyInfoPAge() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart()
                .moveToCartPage()
                .checkOutButton();


    }


    @Test
    public void fillFields() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart()
                .moveToCartPage()
                .checkOutButton()
                .fillFields("mostafa", "nabeeh", "mn");
    }


}



