import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click(); //NoSuchElementException
        //first frame using name of the frame method
        driver.switchTo().frame("packageListFrame"); //name of the frame
        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
        System.out.println("executed First frame");

        driver.switchTo().defaultContent(); //go back to main page
        Thread.sleep(2000);

        //second iframe
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
        System.out.println("executed Second frame");

        driver.switchTo().defaultContent(); //go back to main page
        Thread.sleep(2000);


        //third iframe
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//div[@class='topNav']//li[@class='navBarCell1Rev'][normalize-space()='Class']")).click();
        System.out.println("executed Third frame");




    }



}
