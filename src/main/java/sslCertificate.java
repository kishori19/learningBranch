import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class sslCertificate {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        EdgeOptions options= new EdgeOptions();
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
        options.setAcceptInsecureCerts(true);
        System.out.println(driver.getTitle());

    }
}
