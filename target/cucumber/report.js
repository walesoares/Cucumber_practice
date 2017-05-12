$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "User is able to navigate to from homepage",
  "description": "",
  "id": "user-is-able-to-navigate-to-from-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User is on the home page",
  "description": "",
  "id": "user-is-able-to-navigate-to-from-homepage;user-is-on-the-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "when a user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "when the user click the sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "then the login page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.when_a_user_is_on_the_homepage()"
});
formatter.result({
  "duration": 11303360754,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:302)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:653)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:646)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat pages.Pages.click(Pages.java:21)\r\n\tat pages.Homepage.clickSignIn(Homepage.java:23)\r\n\tat stepdefination.LoginStep.when_a_user_is_on_the_homepage(LoginStep.java:29)\r\n\tat ✽.Given when a user is on the homepage(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStep.when_the_user_click_the_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.then_the_login_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("SignupPage.feature");
formatter.feature({
  "line": 3,
  "name": "Sign in as a registered user",
  "description": "",
  "id": "sign-in-as-a-registered-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@test1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User has the right username and wrong password",
  "description": "",
  "id": "sign-in-as-a-registered-user;user-has-the-right-username-and-wrong-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "when the user is on the sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "when user chooses to sign in",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user provides the following details",
  "rows": [
    {
      "cells": [
        "Email address",
        "Password"
      ],
      "line": 11
    },
    {
      "cells": [
        "walesoares@gmail",
        "lagos"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "when the user clickk sign in",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should get an error",
  "keyword": "Then "
});
formatter.match({
  "location": "SignupPageStep.when_the_user_is_on_the_sign_up_page()"
});
formatter.result({
  "duration": 688444,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:302)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:653)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:646)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat pages.Pages.click(Pages.java:21)\r\n\tat pages.Homepage.clickSignIn(Homepage.java:23)\r\n\tat stepdefination.SignupPageStep.when_the_user_is_on_the_sign_up_page(SignupPageStep.java:36)\r\n\tat ✽.Given when the user is on the sign up page(SignupPage.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SignupPageStep.when_user_chooses_to_sign_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupPageStep.user_provides_the_following_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupPageStep.when_the_user_clickk_sign_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupPageStep.user_should_get_an_error()"
});
formatter.result({
  "status": "skipped"
});
});