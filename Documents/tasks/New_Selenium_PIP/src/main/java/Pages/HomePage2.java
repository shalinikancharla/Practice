package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
    private WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'Practice Form')]")
    private WebElement practiceFormCard;

    @FindBy(xpath = "//*[contains(text(),'Book Store')]")
    private WebElement bookStoreCard;

    @FindBy(xpath = "//*[contains(text(),'Elements')]")
    private WebElement elementsCard;

    @FindBy(xpath = "//*[text()='Elements']")
    private WebElement elementsMenu;

    @FindBy(xpath = "//*[text()='Web Tables']")
    private WebElement webTablesSubMenu;

    @FindBy(xpath = "//*[text()='Browser Windows']")
    private WebElement browserWindowsMenu;

    @FindBy(xpath = "//*[text()='Interactions']")
    private WebElement interactionsMenu;

    public HomePage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickPracticeFormCard() {
        practiceFormCard.click();
    }

    public void clickBookStoreCard() {
        bookStoreCard.click();
    }

    public void clickElementsCard() {
        elementsCard.click();


    }

    public void clickElementsMenu() {
        elementsMenu.click();
    }

    public void clickWebTablesSubMenu() {
        webTablesSubMenu.click();
    }

    public void clickBrowserWindowsMenu() {
        browserWindowsMenu.click();
    }

    public void clickInteractionsMenu() {
        interactionsMenu.click();
    }


}



