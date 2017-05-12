package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepdefination.SharedDriver;

/**
 * Created by Wale on 23/01/2017.
 */
public class Homepage extends Pages{

    public Homepage(SharedDriver webDriver) {
        super(webDriver);
    }

    //WebDriver driver ;
   // public Homepage (WebDriver driver) {this.driver = driver ;}

    private static final By SignIn  = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a") ;


    public void clickSignIn () {
        click(SignIn);
    }

}
