package testcase;


import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class DemoTest extends BaseTest {
    private WebDriver driver;

//    @BeforeClass
//    public void setUp() {
////        System.setProperty("webdriver.chrome.driver", "/home/shubt/Videos/chromedriver");
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.get("https://demoqa.com");
//    }


    public void testWebsiteLogo() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed.");
    }

    @Test(priority = 1)
    public void testAlertsFrameWindows() {
        HomePage homePage = new HomePage(driver);
        homePage.clickAlertsFrameWindowsCard();
    }

    @Test(priority = 2)
    public void testConfirmationAlert() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.clickConfirmAlertButton();

        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, "Do you confirm action?", "Unexpected alert text.");


        driver.switchTo().alert().dismiss();
    }
    @Test(priority = 3)
    public void testPracticeForm() throws IOException {
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.clickPracticeFormCard();

        FormPage practiceFormPage = new FormPage(driver);
        practiceFormPage.fillForm("ram","patil","@gmail.com","number","maths","xyz");

    }
    @Test(priority = 4)
    public void testBookStore() throws IOException {
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.clickBookStoreCard();

        BookStorePage bookStorePage = new BookStorePage(driver);
        bookStorePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm();
    }

    @Test(priority = 5)
    public void testDynamicProperties() {
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.clickElementsCard();
        DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage(driver);
        boolean isEnabled = dynamicPropertiesPage.isEnableAfterElementEnabled();
        Assert.assertTrue(isEnabled, "Element 'Will enable after 5' is not enabled after 5 seconds.");
    }

    @Test(priority = 6)
    public void testWebTablesGetEmailOfKierra() {
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.clickElementsMenu();
        homePage2.clickWebTablesSubMenu();

        WebTablesPage webTablesPage = new WebTablesPage(driver);
        String kierraEmail = webTablesPage.getEmailOfKierra();
        Assert.assertEquals(kierraEmail, "kierra@example.com", "Incorrect email for Kierra.");
    }

    @Test(priority = 7)
    public void testBrowserWindowsOpenTabs() {
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.clickBrowserWindowsMenu();

        BrowserWindowPage browserWindowsPage = new BrowserWindowPage(driver);
        browserWindowsPage.openAllThreeTabs();

    }


    @Test(priority = 8)
    public void testInteractionsDragAndDrop() {
        HomePage2 homePage = new HomePage2(driver);
        homePage.clickInteractionsMenu();

        InteractionsPage interactionsPage = new InteractionsPage(driver);
        interactionsPage.performDragAndDrop();


    }

}

