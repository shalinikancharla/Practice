package Pages;

import Functions.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Base.TestBase.driver;
//import static Hooks.baseHooks.driver;

public class MobilePage
{
    public static void verifyMobilePage(){
        String MobilePageTitle = driver.getTitle();
        System.out.println(MobilePageTitle);
        Assert.assertEquals(MobilePageTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

    }
    public static void clickOnLastDispItem()
    {
        CommonFunctions.scrollToBottom();

        //Click on last displayed item       ////img[@data-image-index='17']
        List<WebElement> mobiles = driver.findElements(By.xpath("//img[@class='s-image']"));
        System.out.println(mobiles.size());
        mobiles.get(mobiles.size()-1).click();
    }
    public static void clickOnNavigateToAll(){
        CommonFunctions.windowHandle();
        CommonFunctions.clickOnElement(driver.findElement(By.cssSelector(".hm-icon-label")));

    }
    public static void selectOnMobilesAndComputers(){
        CommonFunctions.visibilityOfWait(By.xpath("//div[text()='Mobiles, Computers']"));
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//div[text()='Mobiles, Computers']")));
    }
    public static void selectAllMobilePhones()
    {
        CommonFunctions.visibilityOfWait(By.xpath("//a[text()='All Mobile Phones']"));
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//a[text()='All Mobile Phones']")));
    }
}
