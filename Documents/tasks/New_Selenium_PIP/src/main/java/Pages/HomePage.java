package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@alt='ToolsQA']")
    private WebElement logo;

    @FindBy(xpath = "//*[contains(text(),'Alerts, Frame & Windows')]")
    private WebElement alertsFrameWindowsCard;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAlertsFrameWindowsCard() {
        alertsFrameWindowsCard.click();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}

