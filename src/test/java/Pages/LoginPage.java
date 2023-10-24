package Pages;

import Functions.CommonFunctions;
import org.openqa.selenium.By;

import static Base.TestBase.driver;

public class LoginPage {
    public  void enterEmail()
    {
        CommonFunctions.enterText(driver.findElement(By.xpath("//input[@id='ap_email']")),"kancharla574@gmail.com");
    }
    public void clickOnContinue(){
        CommonFunctions.clickOnElement(driver.findElement(By.xpath("//span[@id='continue']")));

    }
    public  void enterPassWord()
    {
        CommonFunctions.enterText(driver.findElement(By.xpath("//input[@id='ap_password']")),"Kancharla@574");
    }
    public void clickOnSignInButton(){
        CommonFunctions.clickOnElement(driver.findElement(By.id("signInSubmit")));

    }
}
