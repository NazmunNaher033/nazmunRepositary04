package tests;

import base.Base;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

import java.sql.SQLOutput;

public class Verify_CustomerAppearanceHomePage extends Base {
    public static void main(String[] args) {
        Base.startUp();

        navigate("http://it.microtechlimited.com/");

       //Loging as customer
        CustomerLoginPage.LoginAsCustomer();

      String WelcomeMsg = getText(CustomerHomePage.labelTextMassage);
      if (WelcomeMsg.equals("Welcome David"))
          System.out.println("pass");
      else
          System.out.println("Fail");




    }
}
