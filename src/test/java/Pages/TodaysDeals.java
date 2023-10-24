package Pages;

import Functions.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Base.TestBase.driver;

public class TodaysDeals {
    public static void verifyTodaySDealsPage(){
        String TodaySPageTitle = driver.getTitle();
        System.out.println(TodaySPageTitle);
        Assert.assertEquals(TodaySPageTitle, "Amazon.in - Today's Deals");
    }
    public static void clickOnThirdDeal(){
        List<WebElement> deals = driver.findElements(By.xpath("//div[@data-testid='grid-deals-container']/div"));
        System.out.println(deals.size());
        deals.get(2).click();
        System.out.println("click on third deal");

    }
    public static void clickOnInnerThirdDeal() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> innerDeal = driver.findElements(By.xpath("//ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']/li"));
        System.out.println(innerDeal.size());
        innerDeal.get(1).click();

    }
    public static void selectMinimumQuantities() throws InterruptedException {
        Thread.sleep(2000);
        WebElement quantity=driver.findElement(By.xpath("//select[@name='quantity']"));
        Select select=new Select(quantity);
        select.selectByIndex(1);
    }
    public static void clickOnAddToCartButton(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//input[@id='add-to-cart-button']")));
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//span[@class='a-button a-button-grouplast a-button-base'][1]")));//skip

    }
    public static void verifyCartMessage(){
//        CommonFunctions.verifyText(driver.findElement(By.id("sc-subtotal-label-activecart")));//subtotal 2 items


        CommonFunctions.verElementDisplayed(driver.findElement(By.id("proceed-to-checkout-action")));//proceed to Buy 2 items
    }
}
