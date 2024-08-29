import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
        WebElement name= driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(name)).click();
       WebElement iceCream= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
       driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
       WebElement radio=driver.findElement(By.xpath("//label[text()='Employment Status: ']"));
       System.out.println(driver.findElement(with(By.tagName("input")).toRightOf(radio)).getText());


    }
}
