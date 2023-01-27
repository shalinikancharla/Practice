package ExtentReporters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ExtentreportDemo {
    public ExtentReports extent;
    public WebDriver driver;
    @BeforeClass
    public void init(){
        //sets the path where should we generate the reports
        ExtentSparkReporter reporter=new ExtentSparkReporter("Report/report.html");
         extent=new ExtentReports(); //the extent object will drive the tests
        extent.attachReporter(reporter); //attach the reports

        //want to beautify the project give some details
          reporter.config().setReportName("Regression testing Report");
          reporter.config().setDocumentTitle("PocketPay Application");
          extent.setSystemInfo("Developers name","Pravallika Maturi");
        extent.setSystemInfo("Testerss name","Shalini Iruvuru");

        extent.setSystemInfo("Project Domain","ERP");
    }
//    @AfterClass
//    public void writeToReport(){
//        extent.flush(); //Delete all previous data on a relevant report and create a brand new one.
//
//    }
    @Test
    public void loginTest(){
        ExtentTest test=extent.createTest("valid login credentials");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        test.info("browser opened");
        driver.get("https://stock.amolujagare.com/");
        test.info("url opened");
        List<WebElement> loginlist=driver.findElements(By.tagName("input"));
        loginlist.get(0).sendKeys("admin");
        test.info("entered email");
        loginlist.get(1).sendKeys("admin");
        test.info("entered password");
        loginlist.get(2).click();
        test.info("button clicked");
        String expected="https://stock.amolujagare.com/add_customer.php";
        String actual= driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual, expected, "incorrect error message is absent");
            test.pass("login test is successfully passed");
        }
        catch(AssertionError e)
        {
            test.fail(e.getMessage());
        }


    }
}

