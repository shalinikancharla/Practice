package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.ReadData;

import java.io.IOException;

public class FormPage {
    private WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "userNumber")
    private WebElement mobNumber;

    @FindBy(id = "subjectsContainer")
    private WebElement subject;

    @FindBy(id = "currentAddress")
    private WebElement address;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillForm(String firstname,String "lastname"));
        emailInput.click();
        emailInput.sendKeys(ReadData.readConfigData("email"));
        mobNumber.click();
        mobNumber.sendKeys(ReadData.readConfigData("number"));
        subject.click();
        subject.sendKeys(ReadData.readConfigData("subject"));
        address.click();
        address.sendKeys(ReadData.readConfigData("address"));


    }}
