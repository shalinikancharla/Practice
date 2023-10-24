package TestPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.amazon.in/");
        driver.get("https://www.amazon.in/s?k=mobiles&crid=BJJA8FPNA1JF&sprefix=mobiles%2Caps%2C206&ref=nb_sb_noss_1");
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[4]")).click();
    }
}
