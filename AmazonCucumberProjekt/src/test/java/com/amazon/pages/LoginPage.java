package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(css = "#glow-ingress-line2")
    public WebElement liefernPlaceBtn_loc;

    @FindBy(css = "#GLUXZipUpdateInput")
    public WebElement sendPostCode_loc;

    @FindBy(css = "#glow-ingress-line2")
    public WebElement deliveryVrfy_loc;

    @FindBy(tagName = "label")
    public List<WebElement> createAccount_loc;

    @FindBy(css = "#continue")
    public WebElement continueBtn_loc;

    public WebElement createAccountLoc_Mthd(String values){

        WebElement element = Driver.get().findElement(By.xpath("//label[contains(text(),'" + values + "')]"));
        return element;

    }

     @FindBy(css = "#ap_email")
     public WebElement emailSend_loc;




    public void createAccount_Mthd(String name, String email,String password){

        actions.moveToElement(createAccountLoc_Mthd("Your name")).sendKeys(name);
        actions.moveToElement(emailSend_loc).sendKeys(email);
        actions.moveToElement(createAccountLoc_Mthd("Password")).sendKeys(password);
        actions.moveToElement(createAccountLoc_Mthd("Re-enter password")).sendKeys(password);
        BrowserUtils.waitFor(3);
        continueBtn_loc.click();

    }


    public void verifyCountry_Mthd(String country){

    }

    public void changePostcode_Mth(String postcode){
        sendPostCode_loc.sendKeys(postcode);
        BrowserUtils.waitFor(5);
        Driver.get().findElement(By.cssSelector("[class='a-button a-button-span12']")).click();//Apply Btn
        BrowserUtils.waitFor(5);
        WebElement continueBtn = Driver.get().findElement(By.xpath("(//span[text()='Continue'])[2]"));//continue Btn
        actions.moveToElement(continueBtn).click().perform();//uzun ugras sonucu aksiyon ile tikladim
        BrowserUtils.waitFor(5);

        /*WebElement element = Driver.get().findElement(By.xpath("(//button[text()='Done'])[2]"));
        //JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        //jse.executeScript("arguments[0].click();",element);*/   //Done Button

    }

    @FindBy(xpath = " //a[@id='GLUXCountryList_233']")
    public WebElement countrySelection_loc;

    @FindBy (xpath = "//select[@id='GLUXCountryList']")//buraya sadece select yazan yerdeki locatoru koyacagiz(size 1 olan)
    public WebElement slctContry_loc;


    public void selectCountry_Mthd(){

        Select select=new Select(slctContry_loc);
        //tiklama islemi
        select.selectByIndex(211);
        BrowserUtils.waitFor(2);
        String actualText = select.getOptions().get(211).getText();
        Assert.assertEquals("Sri Lanka",actualText);

        //yazdirma islemi asagidaki gibi
        //List<WebElement> options = select.getOptions();
        //System.out.println("options.size() = " + options.size());
        //System.out.println("options.get(0) = " + options.get(0).getText());
        /*for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());
        }*/

    }

    public void sendAccountInfo_Mthd(){

    }





}
