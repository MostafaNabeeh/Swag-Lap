package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {


    //1-constructor
    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }


    //2- elements
    String productName = "Sauce Labs Bolt T-Shirt";
    private By HeaderLogo = By.className("app_logo");
    private By productLink = By.xpath("//*[text()='" + productName + "']");

    //3- Getter
    public By getHeaderLogo() {
        return HeaderLogo;
    }


    //4-Actions
    public ProductPage clickOnProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(driver1 -> driver.findElement(productLink)).click();
        } catch (Exception e) {
            System.out.println(" An error happens while locating HomePage elements" + e);
        }
        return new ProductPage(driver);
    }


}
