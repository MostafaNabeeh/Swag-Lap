package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    //Constructor
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    //elements
    private By yourChart = By.xpath("//*[text()=\"Your Cart\"]");
    private By checkOut = By.xpath("//*[text()=\"CHECKOUT\"]");

    // getter
    public By getYourChart() {
        return yourChart;
    }


    //Actions
    public CheckInfoPage checkOutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(driver1 -> driver.findElement(checkOut)).click();
        } catch (Exception e) {
            System.out.println(" An error happens while locating CartPage elements" + e);
        }
        return new CheckInfoPage(driver);
    }


}
