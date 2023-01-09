package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testUtil.utility;

import java.util.List;

public class MobilePage  extends utility {
    static WebDriver driver;
    @FindBy(xpath="//img[@class='s-image']")
    List<WebElement> lastDisplayedItem;

    @FindBy(css=".hm-icon-label")WebElement navigateToAll;
    @FindBy(xpath="//div[text()='Mobiles, Computers']")WebElement selectMobiles;
    @FindBy(xpath="//a[text()='All Mobile Phones']") WebElement selectAllMobilePhones;
    By visibleMobilePhones=By.xpath("//a[text()='All Mobile Phones']");

    public MobilePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void selectLastDisplayedItem() throws InterruptedException {
        scrollToBottom();
        Thread.sleep(2000);
        System.out.println(lastDisplayedItem.size());
        lastDisplayedItem.get(lastDisplayedItem.size()-1).click();
        Thread.sleep(2000);

    }
    public void selectNavigateToAll(){
    windowsHandle();
    navigateToAll.click();
    }
    public void selectMobilesAndComputers() throws InterruptedException {
        Thread.sleep(2000);

        selectMobiles.click();
    }
    public void selectAllMobilePhones() throws InterruptedException {
//        visibilityOfWait(visibleMobilePhones);
        Thread.sleep(3000);
        selectAllMobilePhones.click();
    }
    public  void verifyParentWindow(){
        String parentWindowTitle= driver.getTitle();
        System.out.println(parentWindowTitle);
        Assert.assertEquals(parentWindowTitle,"Amazon.in : Mobiles");


    }
}
