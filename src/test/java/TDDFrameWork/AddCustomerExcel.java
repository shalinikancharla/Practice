package TDDFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddCustomerExcel {
    WebDriver driver;
    @BeforeClass
    public void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://stock.amolujagare.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        List<WebElement> loginlist=driver.findElements(By.tagName("input"));
        loginlist.get(0).sendKeys("admin");
        loginlist.get(1).sendKeys("admin");
        loginlist.get(2).click();

    }
    @Test(dataProvider="getData")
    public void addCustomer(String name,String address,String contact1,String contact2){

       driver.findElement(By.cssSelector("a[href='add_customer.php']")).click();

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);
        driver.findElement(By.name("Submit")).click();

    }
    @DataProvider
    public Object[][] getData() throws IOException {
        File file = new File("/home/shali/Downloads/address_details.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        //Count the active rows in the sheet
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("row count:" + rowCount);
        //Count the active columns in the sheet
        int colCount = sheet.getRow(0).getLastCellNum();
        System.out.println("column count:" + colCount);
        Object[][] data = new Object[rowCount - 1][colCount]; //create the object
        for (int i = 0; i < rowCount - 1; i++) {
            XSSFRow row = sheet.getRow(i + 1); //avoiding header
            for (int j = 0; j < colCount; j++) {
                XSSFCell cell = row.getCell(j);
                if (cell == null) {
                    data[i][j] = " ";

                } else
                    data[i][j] = cell.toString();
            }
        }
        return data;  //this will hold the excel data



    }
}
