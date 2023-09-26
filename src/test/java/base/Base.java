package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

import static java.awt.SystemColor.text;

public class Base {
    public static WebDriver driver;


    public static void startUp() {
        WebDriverManager.chromedriver().setup();
        //webdriver driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //new line aaaed
        System.out.println("Hello java");
    }
        public static void navigate(String url  ){
        driver.get(url);
    }
        public static void sendKeys(By locator, String keys){

        driver.findElement(locator).sendKeys(keys);
    }

    public static void click(By locator){
        driver.findElement(locator).click();
    }
   // public static void sendkeys(By locator,String keys){driver.findElement(By.xpath(xpath)).sendKeys();}


   // public static void click(String xpath) {driver.findElement(By.xpath(xpath)).click();}

    public static String getText(By locator) {
        String s = driver.findElement(locator).getText();
        return s;
    }
    public static void clickById(String id){
        driver.findElement(By.id(id)).click();
    }

    public static void dropDownMenu(By locator,String value){
      Select st = new Select(driver.findElement(locator));
      st.selectByValue(value);

    }


//    public static String getText(String xpath) {
//        String s = driver.findElement(By.xpath(xpath)).getText();
//        return s;
//    }
}
