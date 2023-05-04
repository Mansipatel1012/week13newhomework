package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");
    By enterPostCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomer = By.xpath("//button[@type='submit']");

    public void enterFirstName(String firstName){
        sendTextToElement(enterFirstName,firstName);

    }
    public void enterLastName(String lastName){
        sendTextToElement(enterLastName,lastName);

    }
    public void enterPostcode(String postCode){
        sendTextToElement(enterPostCode , postCode);
    }
    public void addCustomer(){
        clickOnElement(addCustomer);
    }

}
