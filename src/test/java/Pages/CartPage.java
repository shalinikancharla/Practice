package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(id="a-autoid-0-announce")
    WebElement verifyCart;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void verifyCartPage(){
        Boolean flag=verifyCart.isDisplayed();
        Assert.assertTrue(flag);
    }
}
