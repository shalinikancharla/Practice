package Pages;

import Functions.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Base.TestBase.driver;

public class Order {
    public void verifyOrderPage(){
        String verifyOrderTitle=driver.getTitle();
        System.out.println(verifyOrderTitle);
        Assert.assertEquals(verifyOrderTitle,"Your Orders");

    }
    public void selectPreviousOrder(){
        WebElement preOrder= driver.findElement(By.xpath("//select[@id='time-filter']"));
        Select select=new Select(preOrder);
        select.deselectByVisibleText("2021");
    }
    public void verifyOrderDetails()
    {
        CommonFunctions.verElementDisplayed(driver.findElement(By.xpath("//div[@class='a-section a-spacing-top-medium a-text-center']")));
    }
    public void clickOnYourReturnAccount(){
        CommonFunctions.clickOnElement(driver.findElement(By.cssSelector("a[title='Return to Your Account'] span")));
    }
}
