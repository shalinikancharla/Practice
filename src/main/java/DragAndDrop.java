import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");
//        driver.get("https://jqueryui.com/droppable/");
//        driver.manage().window().maximize();
//        WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//        driver.switchTo().frame(frame);//webElement
//       WebElement drag= driver.findElement(By.id("draggable"));
//        WebElement drop= driver.findElement(By.id("droppable"));
//        Actions actions=new Actions(driver);
//        actions.dragAndDrop(drag,drop).build().perform();
//        System.out.println("Successfully executed");

    }
}
