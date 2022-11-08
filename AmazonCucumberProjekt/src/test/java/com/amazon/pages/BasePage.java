package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public BasePage() {

         PageFactory.initElements(Driver.get(), this);
        //bu sayfada bulunan element ve methodlari kullanmama izin veriyor.
    }

    Actions actions=new Actions(Driver.get());


    /*@FindBy(xpath = "(//span[@class='a-button-text'])[1]")
    public WebElement dontChangeBtn_loc;
}*/

    public void homePgCookiesBtn_Mthd(int i) {
        WebElement cookies = Driver.get().findElement(By.xpath("(//span[@class='a-button-text'])["+i+"]"));
        actions.moveToElement(cookies).click().perform();

    }

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    public WebElement signinBtn_loc;

    @FindBy(css = "#createAccountSubmit")
    public WebElement createAccount_loc;

    @FindBy(xpath = "//h1[contains(text(),'Create account')]")
    public WebElement verifyCreateText_loc;

    @FindBy(id = "searchDropdownBox")
    public WebElement searchDropDown_Loc;

    @FindBy(css = "#nav-search-submit-button")
    public WebElement searcButton_Loc;


public void searchDropDown_Mthd(String productName){
    Select select=new Select(searchDropDown_Loc);
    select.selectByVisibleText(productName);

}






}
