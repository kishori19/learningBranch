import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAssignment {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("John");
        driver.findElement((By.name("email"))).sendKeys("Abc@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("abc123");
        driver.findElement((By.id("exampleCheck1"))).click();
         WebElement ListOpt= driver.findElement(By.id("exampleFormControlSelect1"));

        Select opt= new Select(ListOpt);
        opt.selectByIndex(1);
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("15-07-2024");
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

    }
}
