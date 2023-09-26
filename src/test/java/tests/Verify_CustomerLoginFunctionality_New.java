package tests;

import base.Base;
import org.openqa.selenium.By;

public class Verify_CustomerLoginFunctionality_New extends Base {
    public static void main(String[] args) {
        //Navigate URL
       Base.  startUp();
        navigate("http://it.microtechlimited.com/");


        //Cick Login Menu
        //click("//a[@href='elogin.php']");
        click(By.linkText("LOG IN"));

        //Click Customer Login Menu
       // click("//a[@href='clogin.php']");
        click(By.partialLinkText("customer"));

        //Enter Customer User ID
        //sendKeys("//input[@name='mailuid']","david@gmail.com");
        sendKeys(By.xpath("//input[@name='mailuid']"),"david@gmail.com");

        //enter Customer Password
       //sendKeys("['//input[@name='pwd"],"1234");
        sendKeys(By.xpath("[//input[@name='pwd']"),"1234");

        //Click Customer Login Button
//        click("//input[@name='login-submit']");
        click(By.xpath("//input[@name='login-submit']"));

        String welcomeMsg = getText(By.xpath("//h2[ text()='Welcome David']"));
        if (welcomeMsg.contains("David"))
            System.out.println("Pass");
        else
            System.out.println("Fail");



    }
}
