package stepdefination;

import base.Driver;
import cucumber.runtime.model.CucumberScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * Created by Wale on 10/05/2017.
 */
public class SharedDriver implements WebDriver {

   static WebDriver REAL_DRIVER = null;

    static {
        try {
            REAL_DRIVER = new Driver().getDriver();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void get(String s) {

    }

    public String getCurrentUrl() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public List<WebElement> findElements(By by) {
        return null;
    }

    public WebElement findElement(By by) {
        return null;
    }

    public String getPageSource() {
        return null;
    }

    public void close() {

    }

    public void quit() {

    }

    public Set<String> getWindowHandles() {
        return null;
    }

    public String getWindowHandle() {
        return null;
    }

    public TargetLocator switchTo() {
        return null;
    }

    public Navigation navigate() {
        return null;
    }

    public Options manage() {
        return null;
    }


    // public SharedDriver() {
       // super(REAL_DRIVER);

   // }




}
