package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefination.SharedDriver;

import java.util.List;

/**
 * Created by Wale on 23/01/2017.
 */
public class HomePageLanding extends Pages{


    WebDriver driver ;
    public HomePageLanding(SharedDriver webDriver) {
        super(webDriver);
    }

    //public HomePageLanding (WebDriver driver) {this.driver = driver ;}

    By emailaddress = By.id("email_create") ;

    By username = By.xpath("//*[@id='email']") ;
    By password = By.xpath("//*[@id='passwd']") ;
    By Login = By.xpath(" //*[@id='SubmitLogin'] ") ;
    By Loginerror = By.xpath("//*[@id='center_column']/div[1]/ol/li") ;


    public void Confirmsignin () {
        Assert.assertTrue(driver.findElement(emailaddress).isDisplayed());
    }

    public void Enterusername(String s) {driver.findElement(username).sendKeys(s);}
    public void Enterwrongpw(String s) {driver.findElement(password).sendKeys(s);}
    public void ClickLogin () {driver.findElement(Login).click();}

    public  void GotoErrorMsg () {
        Assert.assertTrue(driver.findElement(Loginerror).isDisplayed());}
}
