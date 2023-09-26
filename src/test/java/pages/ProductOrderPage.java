package pages;

import org.openqa.selenium.By;

public class ProductOrderPage {
    public static By dropDownProdName = By.name("prodId");

    public static By prodOrderDate = By.name("ordDate");
    public static  By buttonProdOrder = By.xpath("//button[text()='Order Product']");


}
