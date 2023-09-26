package pages;

import base.Base;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Base {
    //locacors
    public static By customerloginHeadText = By.xpath("//div/h1");

    public static By customerUserId = By.name("mailuid");

    public static By customerUserPassword = By.name("pwd");

    public static By buttonCustomerLogin = By.name("login-submit");


    //Action

    public static void LoginAsCustomer() {

        click(LandingPage.menuLoginlocator);

        click(EmployeeLoginPage.menuCustomerLogin);

        sendKeys(CustomerLoginPage.customerUserId,"david@gmail.com");

        sendKeys(CustomerLoginPage.customerUserPassword,"1234");

        click(CustomerLoginPage.buttonCustomerLogin);
    }

}