import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Arrays;
import java.util.List;

public class autoSuggestiveDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        EdgeOptions options= new EdgeOptions();
        options.setExperimentalOption("excludeSwitches", List.of("disable-popup-blocking"));
        driver.manage().window().maximize();
        driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("United Kingdom");
        Thread.sleep(5000l);
        List<WebElement> optList=driver.findElements(By.cssSelector(".ui-menu li"));

        for(WebElement opt:optList)
        {
            if(opt.getText().equalsIgnoreCase("United kingdom"))
            {
                opt.click();
                break;
            }
        }
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
    }
}
