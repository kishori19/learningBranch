import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitAssignemnt {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//input[@id='usertype'])[2]/preceding-sibling::span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement items= driver.findElement(By.tagName("Select"));
        Select occupationList= new Select(items);
        occupationList.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-footer .btn-info")));
        List<WebElement> buttonClick=  driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for(int i=0;i<buttonClick.size();i++) {
            buttonClick.get(i).click();
        }
       driver.findElement(By.xpath("//li[@class='nav-item active']/a")).click();

    }
}
