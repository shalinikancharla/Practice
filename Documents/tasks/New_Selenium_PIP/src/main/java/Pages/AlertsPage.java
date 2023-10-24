package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
    private WebDriver driver;

    @FindBy(id = "alertButton")
    private WebElement simpleAlertButton;

    @FindBy(xpath = "//*[@class='col']//*[@id='confirmButton']")
    private WebElement confirmAlertButton;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSimpleAlertButton() {
        simpleAlertButton.click();
    }

    public void clickConfirmAlertButton() {
        confirmAlertButton.click();
    }
}


