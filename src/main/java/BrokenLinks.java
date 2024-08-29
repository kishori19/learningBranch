import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" https://rahulshettyacademy.com/AutomationPractice/");

       List<WebElement> links= driver.findElements(By.cssSelector("li[class$='gf-li'] a"));
        SoftAssert softAssert= new SoftAssert();
       for(WebElement link:links)
       {
           String url=link.getAttribute("href");
          // System.out.println(url);
           HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
           conn.setRequestMethod("HEAD");
           conn.connect();
           int respCode=conn.getResponseCode();
           softAssert.assertTrue(respCode<400,"The link is "+url + "with status code "+respCode);
       }
        softAssert.assertAll();


    }
}
