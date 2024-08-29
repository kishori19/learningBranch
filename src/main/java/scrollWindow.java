import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;

public class scrollWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000l);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(int i=0;i< values.size();i++)
        {
           sum= sum+Integer.parseInt(values.get(i).getText());
        }
         System.out.println(sum);
         System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":"));
        int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum,total);
    }
}
