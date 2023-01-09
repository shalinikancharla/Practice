package Pages;

import BaseTest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import testUtil.utility;

import java.io.IOException;

import static BaseTest.BaseTest.driver;

public class HomePage extends utility {
    @FindBy(id="nav-logo-sprites")

    WebElement logo;
    @FindBy(xpath="//a[contains(text(),'Deals')]")
    static
    WebElement todaySDeals;
    //click on cart
    @FindBy(xpath="//a[@id='nav-cart']")WebElement cartBtn;//cart
    @FindBy(xpath="//input[@id='twotabsearchtextbox']")WebElement searchMobile;
    By visibleSearch= By.xpath("//input[@id='twotabsearchtextbox']");
    //verify Searchbar
    @FindBy(id="nav-search-submit-button")WebElement searchbar;
    //Sign in to account
    @FindBy(xpath="//div[@class='nav-line-1-container']/span")WebElement signInBtn;
    @FindBy(xpath="//span[normalize-space()='Your Account']")WebElement clickYourAccount;
    @FindBy(xpath="//div[@class='nav-line-1-container']/span")WebElement verifySignInName;



    public HomePage(WebDriver driver) throws IOException {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public  Boolean verifyAmazonLogo()
    {
        boolean flag=logo.isDisplayed();
        return flag;
    }
    public  Boolean verifyTodaySDealsButton()
    {
        Boolean flag=todaySDeals.isEnabled();
        return flag;
    }
    public void clickOnTodaySDeals()
    {
        todaySDeals.click();
    }
    public void clickOnCart()
    {
        cartBtn.click();
    }
    public void searchMobile()
    {
        visibilityOfWait(visibleSearch);
        searchMobile.sendKeys("Mobiles", Keys.ENTER);
    }

    public void verifySearchBarFunctionalityPage()
    {
        Boolean flag= searchbar.isEnabled();
        Assert.assertTrue(flag);
    }
    public void verifySignInHomePage()
    {
        Boolean flag=signInBtn.isEnabled();
        Assert.assertTrue(flag);
    }
    public void clickOnSignIn()
    {
        actionsClass(signInBtn);
    }
    public void clickOnYourAccount(){
        clickYourAccount.click();
    }
    public void verifySignInPage(){
        String signInName=verifySignInName.getText();
        System.out.println(signInName);
        Assert.assertEquals(signInName,"Hello, pradad");
    }


}
