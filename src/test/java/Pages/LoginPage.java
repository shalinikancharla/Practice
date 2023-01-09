package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testUtil.utility;

public class LoginPage extends utility {
    //email
    @FindBy(xpath="//input[@id='ap_email']")
    WebElement userEmail;
    //Email continue button
    @FindBy(xpath="//span[@id='continue']")WebElement continueEmailBtn;

    //password field
    @FindBy(xpath="//input[@id='ap_password']")WebElement userPassword;
    //signIn btn
    @FindBy(id="signInSubmit")WebElement signInBtn;
    //verify sign in page
    @FindBy(xpath="//span[@class='a-size-base a-text-bold']")WebElement needHelp;
    @FindBy(xpath="//a[@class='a-link-normal'][1]")WebElement loginYourAccount;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void enterEmail(String email)
    {
        userEmail.sendKeys(email);
    }
    public void clickContinue(){
        continueEmailBtn.click();
    }
    public void enterPassWord(String pwd) {
        userPassword.sendKeys(pwd);

    }
    public void clickSignInBtn(){
        signInBtn.click();

    }
    public void verifyUser(){
        needHelp.click();
        loginYourAccount.click();
        windowsHandle();

    }

}


