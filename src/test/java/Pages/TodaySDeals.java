package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testUtil.utility;

import java.io.IOException;
import java.util.List;

import static BaseTest.BaseTest.driver;

public class TodaySDeals extends utility {
    WebDriver driver;
    @FindBy(xpath="//div[@class='Grid-module__gridDisplayGrid_2X7cDTY7pjoTwwvSRQbt9Y']/div")
    List<WebElement> dealsContainer;
    By visibleContainer=By.xpath("//div[@class='Grid-module__gridDisplayGrid_2X7cDTY7pjoTwwvSRQbt9Y']/div");//div[@data-testid='grid-deals-container']/div
    //click on third deal of open no of products
    @FindBy(xpath="//ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']/li")List<WebElement> clickOnThirdProduct;
    By visibleThirdDeal=By.xpath("//ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']/li");
    @FindBy(xpath = "//select[@name='quantity']")
    WebElement selectQuantity;
    //Add to cart
    @FindBy(id="add-to-cart-button")WebElement addToCart;
    @FindBy(css="#attach-close_sideSheet-link")WebElement closeButton;



    public TodaySDeals(WebDriver driver){
        super(driver);

        PageFactory.initElements(driver,this);
        this.driver=driver;

    }
    public String verifyTodaySDealPage()
    {
        String title=driver.getTitle();
        System.out.println(title);
        return title;
    }
    public void clickOnThirdDeal() throws IOException
    {
        visibilityOfWait(visibleContainer);
        System.out.println(dealsContainer.size());
      dealsContainer.get(2).click();
        System.out.println("click on Third Deal");

    }
    public void clickOnThirdDealInnerProduct()
    {
        visibilityOfWait(visibleThirdDeal);
        System.out.println(clickOnThirdProduct.size());
        clickOnThirdProduct.get(3).click();
        System.out.println("click on inner product");
    }
    public void selectQuantityPage() throws InterruptedException {

        Select select=new Select(selectQuantity);
        select.selectByIndex(1);
    }

    public void addToCartProduct() throws InterruptedException {
        addToCart.click();
        //closeButton.click();
    }


}
