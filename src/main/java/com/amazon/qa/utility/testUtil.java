package com.amazon.qa.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

public class testUtil {
    static WebDriver driver;
  public static String parentWindow;
    public testUtil(WebDriver driver)
    {
        this.driver=driver;
    }
    public void javaScriptExecutor()
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,5500)");
    }
    public void visibilityOfWait(By findBy)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }
    public void elementTobeClickable(By findBy)
    {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(findBy));
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
    public void navigateBack()
    {
        driver.navigate().back();
    }

    public void staticDropDown(WebElement element)
    {
        Select select=new Select(element);
        select.selectByValue("last30");
    }



        public static Object[][] gettingData()
        {
            Object[][] data=new Object[1][7];
            data[0][0]="Shalini Iruvuru";
            data[0][1]="9542817261";
            data[0][2]="500089";
            data[0][3]="BRC Hemadurga Siva Hills,A-Block-702";
            data[0][4]="Puppalaguda Narsing Main road";
            data[0][5]="Near Manikonda";
            data[0][6]="";
            return data;

        }

        //take screenShot for failed test cases
    public static String screenShotFailedTestCases() throws IOException {
        TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);//stored in one source file
        String timestamp = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG" + timestamp + ".png";
        FileUtils.copyFile(src, new File("D:\\screenShots\\" + fileName));
        return fileName;
    }


}
