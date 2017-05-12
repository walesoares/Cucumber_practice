package stepdefination;

import base.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import pages.HomePageLanding;
import pages.Homepage;
import pages.Pages;

/**
 * Created by Wale on 23/01/2017.
 */


public class LoginStep  {

   private Homepage homepage ;

   // private Homepage homepage;

  public LoginStep (SharedDriver webdriver){
     homepage = new Homepage(webdriver) ;}


    @Given("^when a user is on the homepage$")
    public void when_a_user_is_on_the_homepage() throws Throwable {
        homepage.clickSignIn();

    }

    @When("^when the user click the sign in button$")
    public void when_the_user_click_the_sign_in_button() throws Throwable {

    }

    @Then("^then the login page should be displayed$")

    public void then_the_login_page_should_be_displayed() throws Throwable {

    }

}
