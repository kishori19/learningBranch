import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class tableAssigment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000l);
        System.out.println( driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
        System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
        System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[3]")).getText());

    }
}
