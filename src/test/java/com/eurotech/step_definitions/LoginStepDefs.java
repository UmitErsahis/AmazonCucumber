package com.eurotech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("I open the browser and navigate to Eurotech web page");
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        System.out.println("I enter username and password and click login button");


    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        System.out.println("I verify that url changed Dashboard");

    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {

        System.out.println("I enter student username and password and click login button");
    }

    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {

        System.out.println("I enter developer username and password and click login button");

    }


    @When("The user enters SDET credentials")
    public void theUserEntersSDETCredentials() {
        System.out.println("I enter SDET username and password and click login button");
    }
}
