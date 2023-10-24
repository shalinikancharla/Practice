package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicPropertiesPage {
    private WebDriver driver;

    @FindBy(id = "enableAfter")
    private WebElement enableAfterElement;

    public DynamicPropertiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isEnableAfterElementEnabled() {
        return enableAfterElement.isEnabled();
    }
}