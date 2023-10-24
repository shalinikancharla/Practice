package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import utility.ReadData;

import java.io.IOException;

public class BaseTest {
    WebDriver driver;

    @BeforeSuite
    public void initBrowser() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "/home/shubt/Videos/chromedriver");
      //  System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout()
        String Url = ReadData.readConfigData("url");
        driver.get("https://demoqa.com");
    }






}
