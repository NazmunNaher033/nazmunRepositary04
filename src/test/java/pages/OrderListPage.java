package pages;

import org.openqa.selenium.By;

public class OrderListPage {
    public static By prodOrderList = By.xpath("//a[@href='orderSubmit.php?ordId=1172&id=4']");
    public static By confirmStatus = By.xpath("//tbody/tr[299]/td[6]");
}
