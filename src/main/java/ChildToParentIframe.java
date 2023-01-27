import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildToParentIframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult"); //switched to outer frame
        driver.switchTo().frame(0);  //switched to inner frame
        //capture the text
        System.out.println("capture the text from innerframe: "+driver.findElement(By.xpath("//h1")).getText());

        //switch to outer/parent frame
        driver.switchTo().parentFrame();
        System.out.println("capture the text from parent frame: "+driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText());




    }
}
