package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.ReadData;

import java.io.IOException;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "userName")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillLoginForm() throws IOException {
        usernameInput.click();
        usernameInput.sendKeys(ReadData.readConfigData("username"));
        passwordInput.click();
        passwordInput.sendKeys(ReadData.readConfigData("password"));
    }
}