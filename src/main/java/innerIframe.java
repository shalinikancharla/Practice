import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class innerIframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();//click on multiplr frame button
       WebElement outerIframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")); //switch to outer frame
       driver.switchTo().frame(outerIframe);
        WebElement innerIframe=driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")); //switch to inner frame
        driver.switchTo().frame(innerIframe);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome"); //enter the text
    }

}
