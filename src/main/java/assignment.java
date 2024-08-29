import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class assignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).click();
        String labelText=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        System.out.println(labelText);
        WebElement optList=driver.findElement(By.id("dropdown-class-example"));
        Select opt = new Select(optList);
        opt.selectByVisibleText(labelText);
        driver.findElement(By.id("name")).sendKeys(labelText);
        driver.findElement(By.id("alertbtn")).click();
        String text=  driver.switchTo().alert().getText();
        if(text.contains(labelText))
        {
            System.out.println("Alert Message Displayed Successfully...");
        }
        else
        {
            System.out.println("Alert message not displayed...");
        }
        driver.switchTo().alert().accept();


    }
}
