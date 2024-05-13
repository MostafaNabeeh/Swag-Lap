package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckInfoPage {

    //Constructor
    WebDriver driver;

    public CheckInfoPage(WebDriver driver) {
        this.driver = driver;
    }


    //elements
    private By yourInformation = By.xpath("//*[text()=\"Checkout: Your Information\"]");
    private By FirstName = By.id("first-name");
    private By LastName = By.id("last-name");
    private By PostalCode = By.id("postal-code");
    private By continueButton = By.xpath("//input[@type='submit']");


    // Getter
    public By getYourInformation() {
        return yourInformation;
    }


    // Actions
    public CheckOverViewPage fillFields(String first, String last, String postalCode) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(driver1 -> driver.findElement(FirstName)).sendKeys(first);
            wait.until(driver1 -> driver.findElement(LastName)).sendKeys(last);
            wait.until(driver1 -> driver.findElement(FirstName)).sendKeys(postalCode);

            wait.until(driver1 -> driver.findElement(continueButton)).click();

        } catch (Exception e) {
            System.out.println(" An error happens while locating CheckInfoPage elements" + e);
        }
        return new CheckOverViewPage(driver);
    }


}
