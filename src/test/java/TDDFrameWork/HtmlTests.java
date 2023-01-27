package TDDFrameWork;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HtmlTests {
    @Test
    public void homePage() throws Exception {
        try (final WebClient webClient = new WebClient()) {
            final HtmlPage page = webClient.getPage("https://htmlunit.sourceforge.io/");  //webclient is coming from html
            Assert.assertEquals("HtmlUnit – Welcome to HtmlUnit", page.getTitleText());

            final String pageAsXml = page.asXml();
            System.out.println(pageAsXml);
            Assert.assertTrue(pageAsXml.contains("<body class=\"topBarDisabled\">"));

            final String pageAsText = page.asNormalizedText();
            System.out.println(pageAsText);
            Assert.assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));
        }
    }
    @Test
    public void htmlUnitDriver(){
        WebDriver driver=new HtmlUnitDriver();
        driver.get("https://stock.amolujagare.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        List<WebElement> loginlist=driver.findElements(By.tagName("input"));
        loginlist.get(0).sendKeys("admin");
        System.out.println("enter email");
        loginlist.get(1).sendKeys("admin");
        System.out.println("enter password");

        loginlist.get(2).click();
        System.out.println("landed on dashboard");

    }
}
