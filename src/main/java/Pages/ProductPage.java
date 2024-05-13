package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    //constructor
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    // elements
    private By productPrice = By.className("inventory_details_price");
    private By addToCartButton = By.xpath("//*[text()=\"ADD TO CART\"]");
    private By cartIcon = By.id("shopping_cart_container");


    //Getter
    public By getProductPrice() {
        return productPrice;
    }


    //Action

    public ProductPage addProductToChart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(driver1 -> driver.findElement(addToCartButton)).click();
        } catch (Exception e) {
            System.out.println(" An error happens while locating ProductPage elements" + e);
        }
        return new ProductPage(driver);
    }


    public CartPage moveToCartPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(driver1 -> driver.findElement(cartIcon)).click();
        } catch (Exception e) {
            System.out.println(" An error happens while locating ProductPage elements" + e);
        }
        return new CartPage(driver);
    }


}