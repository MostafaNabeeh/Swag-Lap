package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {

    WebDriver driver;

    public FinishPage(WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By thankyouHeader = By.xpath("//*[text()=\"THANK YOU FOR YOUR ORDER\"]");


    //Getter
    public By getThankyouHeader() {
        return thankyouHeader;
    }


}

