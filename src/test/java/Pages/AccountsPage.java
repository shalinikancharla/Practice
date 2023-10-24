package Pages;

import Functions.CommonFunctions;
import org.openqa.selenium.By;

import static Base.TestBase.driver;

public class AccountsPage {
    public static void verifyAccountsPage(){
    CommonFunctions.verifyAccountsPageTitle();
}
public static void clickOnLoginAndSecurity(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//div[@data-card-identifier='SignInAndSecurity']")));
}
public void clickOnYourOrder(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']")));
}
public  void selectPaymentOption(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//h2[normalize-space()='Payment options']")));
}
public void selectYourAddress(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//div[@data-card-identifier='AddressesAnd1Click']")));
}

}
