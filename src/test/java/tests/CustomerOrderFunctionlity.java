package tests;

import base.Base;
import org.openqa.selenium.By;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.OrderListPage;
import pages.ProductOrderPage;

public class CustomerOrderFunctionlity extends Base {
    public static void main(String[] args) throws InterruptedException {


        Base.startUp();

        navigate("http://it.microtechlimited.com/");


        // CustomerLoginPage.loginAsCustomerLogin();
        CustomerLoginPage.LoginAsCustomer();

        click(CustomerHomePage.customerOrderMenu);
        //  click(ProductOrderPage.dropDownProdName);

        // sendKeys(ProductOrderPage.dropDownProdName, "7");
       dropDownMenu(ProductOrderPage.dropDownProdName, "7");

        //sendKeys(ProductOrderPage.productOrderDate"06/07/2023");
        sendKeys(ProductOrderPage.prodOrderDate, "06/04/2023");


        // click(ProductOrderPage.buttonProOrder);
        click(ProductOrderPage.buttonProdOrder);

        click(OrderListPage.prodOrderList);

        String t = getText(OrderListPage.confirmStatus);
        if (t.equals("Confirmed"))
            System.out.println("pass");
        else
            System.out.println("Fail");



        Thread.sleep(3000);

        driver.close();
    }

}
