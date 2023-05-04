package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerButton = By.xpath("//button[normalize-space()='Add Customer']");
    By openCustomer = By.xpath("//button[normalize-space()='Open Account']");
    By customerButton = By.xpath("//button[normalize-space()='Customers']");

    public void addCustumerButtom(){
        clickOnElement(addCustomerButton);
    }
    public void opencustomerButton(){
        clickOnElement(openCustomer);
    }
    public void customerBtn(){
        clickOnElement(customerButton);
    }
}

