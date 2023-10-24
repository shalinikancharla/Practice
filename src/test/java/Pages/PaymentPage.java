package Pages;

import Functions.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Base.TestBase.driver;

public class PaymentPage {
    public void verifyPaymentPage(){
        String paymentTitle=driver.getTitle();
        System.out.println(paymentTitle);
        Assert.assertEquals(paymentTitle,"Manage Payment Methods");
    }
    public void verifyPaymentPageText(){
        CommonFunctions.verElementDisplayed(driver.findElement(By.xpath("//span[@class='a-size-extra-large']")));
    }
    public void returnToYourAccount(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//a[@class='a-link-normal breadcrumbLink']")));
    }
}
