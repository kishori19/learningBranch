import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class parentChildWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.className("blinkingText")).click();
      Set<String> windows=  driver.getWindowHandles();
        Iterator<String> it= windows.iterator();
        String parentId=it.next();
        String childId= it.next();
        driver.switchTo().window(childId);
       System.out.println( driver.findElement(By.cssSelector(".im-para.red")).getText());
       String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
       System.out.println(emailId);
       driver.switchTo().window(parentId);
       driver.findElement(By.id("username")).sendKeys(emailId);



    }
}
