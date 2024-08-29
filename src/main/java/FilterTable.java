import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class FilterTable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies= driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filteredList=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
        Assert.assertEquals(veggies.size(),filteredList.size());
        Thread.sleep(1000l);
    }
}
