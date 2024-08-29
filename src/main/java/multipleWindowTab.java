import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class multipleWindowTab {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        //switch window/tab
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it= windows.iterator();
        String parentId=it.next();
        String childId= it.next();
       driver.switchTo().window(childId);
       driver.get("https://rahulshettyacademy.com");
       String cource=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
       driver.switchTo().window(parentId);
       WebElement name= driver.findElement(By.cssSelector("[name='name']"));
       name.sendKeys(cource);
       //Screenshot
        File file=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:\\Screenshots\\logo.png"));

        //get height and width of inputBox
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());

    }
}
