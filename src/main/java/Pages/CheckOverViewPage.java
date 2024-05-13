package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOverViewPage {

    //Constructor
    WebDriver driver;

    public CheckOverViewPage(WebDriver driver) {
        this.driver = driver;
    }


    // elements
    private By productName = By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']");
    private By finish = By.xpath("//*[text()=\"FINISH\"]");


    // getter
    public By getProductName() {
        return productName;
    }


    // Actions
    public FinishPage clickOnFinishButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(driver1 -> driver.findElement(finish)).click();
        } catch (Exception e) {
            System.out.println(" An error happens while locating CheckOverViewPage elements" + e);
        }
        return new FinishPage(driver);
    }


}


