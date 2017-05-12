package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefination.SharedDriver;

/**
 * Created by Wale on 10/05/2017.
 */
public abstract class Pages {

    public static SharedDriver webDriver;

    public Pages(SharedDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void click(By element){
        new WebDriverWait(webDriver, 20).until(
                ExpectedConditions.elementToBeClickable(element));
        webDriver.findElement(element).click();
    }
}
