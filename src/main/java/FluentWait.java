import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FluentWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
    }
}
