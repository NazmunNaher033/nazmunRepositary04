package tests;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class Verify_EmployeeLoginFunctionality extends Base {
    public static void main(String[] args) {
        //Verifi Employee Login Functionality

        Base.startUp();
        //Navigate to URL
       //navigate("http://it.microtechlimited.com/");

        //Click login menu
        click(By.linkText("LOG IN"));

        //Click Employee login pape
        click(By.partialLinkText("Employee"));

        //Enter Employee User Id
        sendKeys(By.name("mailuid"),"testpilot@gmail.com");

        //User password
        sendKeys(By.xpath("[//input[@name='pwd']"),"1234");

        //click login Button
        click(By.cssSelector("input[name='login-submit']"));

        //get Text
       String welcomeMsg = getText(By.xpath("//h2[@style='text-align:center;']"));
        if (welcomeMsg.contains("Test"))
            System.out.println("Pass");
        else
            System.out.println("Fail");


    }

}
