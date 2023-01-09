package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;
    @FindBy(xpath = "//span[@class='a-size-extra-large']")
    WebElement verifyPaymentPageText;
    @FindBy(xpath="//a[@class='a-link-normal breadcrumbLink']")WebElement returnAccount;
    public PaymentPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void verifyPaymentPage(){
        String paymentTitle=driver.getTitle();
        System.out.println(paymentTitle);
        Assert.assertEquals(paymentTitle,"Manage Payment Methods");
    }
    public void verifyPaymentPagesText(){
       Boolean flag= verifyPaymentPageText.isDisplayed();
       Assert.assertTrue(flag);
    }
    public void returnToYourAccount(){
        returnAccount.click();
    }
}
