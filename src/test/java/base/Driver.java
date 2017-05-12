package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Wale on 23/01/2017.
 */
public class Driver {

    public static DesiredCapabilities caps = new DesiredCapabilities();
   // public static RemoteWebDriver driver;

    //return driver ;

    public static WebDriver driver = null;

    @Before
    public WebDriver getDriver() throws IOException {
     driver = new FirefoxDriver () ;
     driver.get("http://automationpractice.com/");
    driver.manage().window().maximize();
    return  driver ;

    }

    @After
    public void  tearDown () {
        driver.quit();
    }
}


//        Properties p = new Properties();
//        FileInputStream fi = new FileInputStream("C:\\Users\\Anthony Soares\\IdeaProjects\\Cucumber_practice\\src\\test\\java\\Global");
//        p.load(fi);
//
//        if (p.getProperty("browser").contains("firefox")) {
//            driver = new FirefoxDriver();
//
//        } else if (p.getProperty("browser").contains("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anthony Soares\\IdeaProjects\\Cucumber_practice\\src\\test\\java\\Browser\\chromedriver.exe");
//            driver = new ChromeDriver();
//
//
//        } else if (p.getProperty("browser").contains("ie")) {
//            System.setProperty("webdriver.ie.driver", "C:\\Users\\Anthony Soares\\IdeaProjects\\Cucumber_practice\\src\\test\\java\\Browser\\IEDriverServer.exe");
//            driver = new InternetExplorerDriver();
//        }
//
//        driver.get(p.getProperty("url"));
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//        return driver;
//    }

            //driver.get("http://automationpractice.com/");
           // driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
           // driver.manage().window().maximize();

           //return  driver ;}

//}
