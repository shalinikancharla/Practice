package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserWindowPage {
    private WebDriver driver;

    @FindBy(id = "windowButton")
    private WebElement newWindowButton;

    @FindBy(id = "messageWindowButton")
    private WebElement newMessageWindowButton;

    @FindBy(id = "tabButton")
    private WebElement newTabButton;

    public BrowserWindowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAllThreeTabs() {
        newWindowButton.click();
        newMessageWindowButton.click();
        newTabButton.click();
    }
}
