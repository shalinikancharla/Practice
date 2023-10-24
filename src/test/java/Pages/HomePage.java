package Pages;

import Functions.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Base.TestBase.driver;
import static Functions.CommonFunctions.visibilityOfWait;

public class HomePage {
    public static void verifyAmazonLogo()
    {
        Boolean logoStatus= CommonFunctions.verElementDisplayed(driver.findElement((By.id("nav-logo-sprites"))));
        System.out.println(logoStatus);
        Assert.assertTrue(logoStatus);

    }
    public static void verifyTodaySDealsButton()
    {
        Boolean buttonStatus= CommonFunctions.verElementDisplayed(driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")));
        System.out.println(buttonStatus);
        Assert.assertTrue(buttonStatus);
    }
    public static void clickOnTodaySDeals(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")));

    }
    public static void searchForMobilePhones() throws InterruptedException {
        System.out.println("user_search_for_mobile_phones");
        CommonFunctions.verElementDisplayed(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));

        CommonFunctions.enterText(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")),"Mobiles");
        visibilityOfWait(By.xpath("//input[@id='twotabsearchtextbox']"));

    }
    public static void verifyParentWindow(){
        String parentWindowTitle= driver.getTitle();
        System.out.println(parentWindowTitle);
        Assert.assertEquals(parentWindowTitle,"Amazon.in : Mobiles");


    }

    //With Login Details
    public static void verifysignInButton()
    {
        CommonFunctions.verElementDisplayed(driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")));
    }
    public  static void selectYourAccount()
    {
        CommonFunctions.actionsClass(driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")));
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//span[normalize-space()='Your Account']")));


    }
    public void verifySignInPage(){
         String signInName=driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")).getText();
        System.out.println(signInName);
        Assert.assertEquals(signInName,"pradad");
    }

}
