package Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void start()
     {
        driver= new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/ ");
     }

     @AfterMethod
     public void tearDown ()
     {
         driver.quit();
     }



}

