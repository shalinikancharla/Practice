package Pages;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {

     WebDriver driver;
     @FindBy(xpath="//select[@id='time-filter']")
    WebElement preOrder;
     @FindBy(xpath="//div[@class='a-section a-spacing-top-medium a-text-center']")WebElement orderDisplayed;
     @FindBy(css = "a[title='Return to Your Account'] span")WebElement returnYourAccount;

    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void verifyOrderPage(){
        String verifyOrderTitle=driver.getTitle();
        System.out.println(verifyOrderTitle);
        Assert.assertEquals(verifyOrderTitle,"Your Orders");

    }
    public void selectPreviousOrder(){
        Select select=new Select(preOrder);
        select.selectByVisibleText("2021");
    }
    public void isOrderDisplayed(){
        Boolean flag=orderDisplayed.isDisplayed();
        Assert.assertTrue(flag);
    }
    public void clickOnReturnYourAccount(){
        returnYourAccount.click();
    }
}
