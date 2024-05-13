package Testpages;

import org.testng.annotations.Test;
import Pages.*;

public class FinishTest extends BaseTest{
    @Test
    public void EndToEnd ()
    {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .clickOnProduct()
                .addProductToChart()
                .moveToCartPage()
                .checkOutButton()
                .fillFields("mostafa", "nabeeh", "mn")
                .clickOnFinishButton();
    }











}
