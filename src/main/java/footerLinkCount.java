import com.sun.source.tree.WhileLoopTree;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class footerLinkCount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println( driver.findElements(By.tagName("a")).size());
        //Limiting webdriver scope
        WebElement footerDriver= driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //limited to one coloumn of table
        WebElement tableDriver= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(tableDriver.findElements(By.tagName("a")).size());

        //3 Open all link in the above column
        for(int i=1;i<tableDriver.findElements(By.tagName("a")).size();i++) {
            String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
            tableDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
            Thread.sleep(5000l);
        }
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> it= windows.iterator();
            while(it.hasNext())
            {
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }




    }

}
