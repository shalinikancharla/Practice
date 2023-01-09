package testUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class utility {
    static WebDriver driver;
    public static String parentWindow;

    public utility(WebDriver driver)
    {
        this.driver=driver;
    }

    public void visibilityOfWait(By findBy)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }
    public void scrollToBottom()
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,5450)");
    }
    public void windowsHandle()
    {
        parentWindow= driver.getWindowHandle();
        Set<String> handles= driver.getWindowHandles();
        for(String handle:handles)
        {
            if(!(parentWindow.equals(handle)))
            {
                driver.switchTo().window(handle);

            }
        }
    }
    public  void actionsClass(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

}
