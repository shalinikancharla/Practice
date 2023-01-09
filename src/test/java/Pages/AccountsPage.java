package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {
    WebDriver driver;
    @FindBy(xpath="//div[@data-card-identifier='SignInAndSecurity']")
    WebElement signInSecurity;
    @FindBy(xpath="//p[@class='a-spacing-none a-size-base a-color-base'][1]")WebElement yourOrder; ////div[@data-card-identifier='YourOrders']
    @FindBy(xpath = "//h2[normalize-space()='Payment options']")WebElement paymentOption;
    @FindBy(xpath="//div[@data-card-identifier='AddressesAnd1Click']")WebElement yourAddress;
    public AccountsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void verifyAccountspage(){
        String verifyAccount= driver.getTitle();
        System.out.println(verifyAccount);
        Assert.assertEquals(verifyAccount,"Your Account");
    }
    public void selectSignInSecurity(){
        signInSecurity.click();
    }
    public void selectYourOrder(){
        yourOrder.click();
    }
    public void selectPaymentOption(){
        paymentOption.click();
    }
    public void selectYourAddress(){
        yourAddress.click();
    }
}
