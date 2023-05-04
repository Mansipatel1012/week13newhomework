package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
    By yourName = By.xpath("//select[@id='userSelect']");
    By loginBUtton = By.xpath("//button[normalize-space()='Login']");
    By yourNameText = By.xpath("//label[normalize-space()='Your Name :']");
    public void selectYourName(String UrName){
        clickOnElement(yourName);
        selectByVisibleTextFromDropDown(yourName,UrName);
    }
    public void clickLoginButton(){
        clickOnElement(loginBUtton);

    }
    public String verifyYourNameText(){
        return getTextFromElement(yourNameText);
    }

}
