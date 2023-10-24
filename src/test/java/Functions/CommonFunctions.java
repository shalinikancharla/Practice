package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static Base.TestBase.driver;

//import static Hooks.baseHooks.driver;

public class CommonFunctions {
    public static String parentWindow;

    public static void enterText(WebElement element, String textName) {
        element.sendKeys(textName, Keys.ENTER);
    }

    public static Boolean verElementDisplayed(WebElement element) {
        Boolean status = element.isDisplayed();
        return status;
    }

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5500)");
    }

    public static void windowHandle() {
        parentWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!parentWindow.equals(handle)) {
                driver.switchTo().window(handle);
            }
        }
    }
    public static void visibilityOfWait(By element)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static String verifyText(WebElement element){
       String verifyMsg= element.getText();
       return verifyMsg;

    }
    public static void actionsClass(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    public static String verifyAccountsPageTitle(){
        String verifyAccount= driver.getTitle();
        System.out.println(verifyAccount);
        return verifyAccount;
    }

}