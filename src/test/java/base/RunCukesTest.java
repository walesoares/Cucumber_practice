package base;

import base.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import stepdefination.SignupPageStep;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Wale on 23/01/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json" }
        ,features = "src/test/java/Features",
        glue = {"stepdefination"}, tags = {"@test1"})


public class RunCukesTest {


    @AfterClass
    public static void finalTearDown(){

    }



}
