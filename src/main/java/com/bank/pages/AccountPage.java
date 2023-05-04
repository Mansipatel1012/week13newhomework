package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By logout = By.xpath("//button[@class='btn logout']");
    By depositButton = By.xpath("//button[normalize-space()='Deposit']");
    By enterAmount = By.xpath("//input[@placeholder='amount']");
    By deposit  = By.xpath("//button[@type='submit']");
    By depositSuccessText = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawlTab  = By.xpath("//button[normalize-space()='Withdrawl']");
    By enterWithdrawnAmt = By.xpath("//input[@placeholder='amount']");
    By withdrawlButton = By.xpath("//button[text()='Withdraw']");
    By transactionSuccessfulText = By.xpath("//span[@class='error ng-binding']");

    public void clickOnLogout(){
        clickOnElement(logout);
    }
    public String verifyLogout(){
        return getTextFromElement(logout);
    }
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }
    public void enterAmountDeposit(String amount){
        sendTextToElement(enterAmount,amount);
    }
    public void clickOnDeposit(){
        clickOnElement(deposit);
    }
    public String verifyDepositSuccessfull(){
        return getTextFromElement(depositSuccessText);
    }
    public void clickOnWithdrawl(){
        clickOnElement(withdrawlTab);
    }
    public void amountWithdrawl(String amount){
        sendTextToElement(enterWithdrawnAmt ,amount);
    }
    public void clickOnWithdrawlBtn(){
        clickOnElement(withdrawlButton);
    }
    public String verifyTransationSuccessful(){
        return getTextFromElement(transactionSuccessfulText);
    }

}


