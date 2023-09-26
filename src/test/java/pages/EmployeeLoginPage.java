package pages;

import org.openqa.selenium.By;

public class EmployeeLoginPage {

    //Locators
    public static By munuEmployeeLogin = By.partialLinkText("Employee");
    public static By textEmployeeId = By.name("mailuid");
    public static By textEmployeePassword = By.xpath("//input[@name='pwd']");

    public static By menuCustomerLogin = By.partialLinkText("Customer");

    //Actions

}
