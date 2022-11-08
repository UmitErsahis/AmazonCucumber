package com.amazon.step_definitions;

import com.amazon.pages.BasePage;
import com.amazon.pages.LoginPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


import javax.security.auth.login.Configuration;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("the user is on the Amazon BasePage")
    public void the_user_is_on_the_Amazon_BasePage() {
        int dontChange = 1;
        int change = 2;
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(3);
        loginPage.homePgCookiesBtn_Mthd(dontChange);
    }


    @And("the user navigates to Liefern nach Ländern section")
    public void theUserNavigatesToLiefernNachLändernSection() {
        loginPage.liefernPlaceBtn_loc.click();
    }


    //sendkeys sadece string kabul ediyor, bu nedenle feature da degeri String gönderdik

    //sendkeys javascript code
        /*JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("document.getElementById('#GLUXZipUpdateInput').value='11201';");*/

    @And("the user changes liefern adress in putting {string} into the field")
    public void theUserChangesLiefernAdressInPuttingIntoTheField(String postCode) {
        loginPage.changePostcode_Mth(postCode);

    }

    @And("the user verifies that delivery region is {string}")
    public void theUserVerifiesThatDeliveryRegionIs(String expectedText) {
        String actualText = loginPage.deliveryVrfy_loc.getText();
        Assert.assertEquals(expectedText, actualText);
        System.out.println(actualText);
    }

    @And("the user select country from selection")
    public void theUserSelectCountryFromSelection() {
        loginPage.liefernPlaceBtn_loc.click();


    }

    @Then("verify that country were changed")
    public void verifyThatCountryWereChanged() {
        loginPage.selectCountry_Mthd();
    }

    @Given("the user is on the register page")
    public void the_user_is_on_the_register_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }


    @When("the user should be able register to amazon")
    public void the_user_should_be_able_register_to_amazon() {


    }



    @And("the user enters a {string} into the field")
    public void theUserEntersAIntoTheField(String arg0) {

    }


    @When("the user enters in using{string},{string},{string},{string}")
    public void theUserEntersInUsing(String name, String email, String password, String rePassword) {

        //name = ConfigurationReader.get("name");
        //email = ConfigurationReader.get("email");
        //password = ConfigurationReader.get("password"); in this way we can values also from config. properties
        basePage.signinBtn_loc.click();
        basePage.createAccount_loc.click();
        BrowserUtils.waitFor(3);
        loginPage.createAccount_Mthd(name, email, password);
        BrowserUtils.waitFor(3);

    }
}

