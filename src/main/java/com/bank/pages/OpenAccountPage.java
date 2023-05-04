package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
       By customer = By.id("userSelect");
       By currency = By.xpath("//select[@id='currency']");
       By process = By.xpath("//button[normalize-space()='Process']");

       public void selectCustomerName(String customerName){
           clickOnElement(customer);
           selectByVisibleTextFromDropDown(customer,customerName);
       }
       public void selectCurrency(String currencyName ){
           clickOnElement(currency);
           selectByVisibleTextFromDropDown(currency,currencyName);
       }
       public void clickOnProcessBtn(){
           clickOnElement(process);
       }
}
