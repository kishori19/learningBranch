import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement SelectOpt=driver.findElement(By.id("select-demo"));

        Select selectList= new Select(SelectOpt);
        selectList.selectByIndex(3);
        System.out.println(selectList.getFirstSelectedOption().getText());
        selectList.selectByValue("Sunday");
        System.out.println(selectList.getFirstSelectedOption().getText());
    }
}
