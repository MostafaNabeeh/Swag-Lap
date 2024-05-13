package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // elements
    private By userName = By.id("user-name");
    private By passWord = By.id("password");
    private By loginButton = By.id("login-button");
    private By Error = By.xpath("//*[@data-test='error']");


    //Getter
    public By getError() {
        return Error;
    }


    // Actions
    public Homepage login(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(driver1 -> driver.findElement(userName)).sendKeys(username);
            wait.until(driver1 -> driver.findElement(passWord)).sendKeys(password);
            wait.until(driver1 -> driver.findElement(loginButton)).click();

        } catch (Exception e) {
            System.out.println("An error happens while locating login elements" + e);
        }
        return new Homepage(driver);
    }


    public boolean verifyValidLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Homepage homepage = new Homepage(driver);
        return wait.until(driver1 -> driver.findElement(homepage.getHeaderLogo())).isDisplayed();
    }

    public boolean verifyUnValidLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        return wait.until(driver1 -> driver.findElement(Error)).isDisplayed();
    }


}
