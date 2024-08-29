import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Actions action = new Actions(driver);
        WebElement move= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        action.moveToElement(move).build().perform();
        action.moveToElement(move).contextClick().build().perform();
        action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("kishori").doubleClick().build().perform();
    }
}