package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage {
    private WebDriver driver;

    @FindBy(xpath = "//td[text()='Kierra']")
    private WebElement kierraRow;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getEmailOfKierra() {
        WebElement kierraEmail = kierraRow.findElement(By.xpath("./following-sibling::td[2]"));
        return kierraEmail.getText();
    }
}
