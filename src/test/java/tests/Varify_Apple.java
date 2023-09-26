package tests;

import base.Base;
import org.openqa.selenium.By;

public class Varify_Apple extends Base{
    public static void main(String[] args) throws InterruptedException {
        //set up

        Base.startUp();

        //navigate apple,com
       navigate("https://apple.com");

       //click search button
        //quastion?
       // clickById("globalnav-menubutton-link-search");
       driver.findElement(By.id("globalnav-menubutton-link-search")).click();
       Thread.sleep(2000);

        //write iphone in the search box
     /// sendKeys(By.xpath("//a[@id='globalnav-menubutton-link-search']"),"iphone");
       // driver.findElement(By.className("globalnav-searchfield-input"))

        //verify result found
       click (By.xpath("//a[@aria-label='iPhone']//span[@class='globalnav-link-text-container']"));


    }
}
