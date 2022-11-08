package com.amazon.step_definitions;

import com.amazon.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStep_Defs {

    BasePage basepage = new BasePage();

    @When("the user selects {string} from DropDown Button")
    public void the_user_selects_from_DropDown_Button(String string) {
        basepage.homePgCookiesBtn_Mthd(1);

        basepage.searchDropDown_Mthd("Electronics");
    }

    @When("the user clicks search button")
    public void the_user_clicks_search_button() {
        basepage.searcButton_Loc.click();

    }

    @Then("the user should be able to see relevant product page")
    public void the_user_should_be_able_to_see_relevant_product_page() {

    }


}
