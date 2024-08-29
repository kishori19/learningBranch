import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebElementsAssignment<staic> {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
        WebElement prefix=driver.findElement(By.id("prefix"));
        Select select=new Select(prefix);
        select.selectByIndex(1);

        driver.findElement(By.id("firstname")).sendKeys("Kishori");
        driver.findElement(By.id("lastname")).sendKeys("Patil");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("pension")));
       // driver.findElement(By.id("pension")).click();
        //List<WebElement> account=  driver.findElements(By.cssSelector("input[name='accountype']"));
        String value="Pension";
       // dataType(account,"Saving");
      //  JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.name("fathername")).sendKeys("Suresh");
        driver.findElement(By.name("mothername")).sendKeys("Kanchan");
       // List<WebElement> identityType=driver.findElements(By.cssSelector("input[name='identity_type']"));
        String type="Passport";
        //selectOptionInDropDownUsingIteration(identityType,type);
        driver.findElement(By.id("passport")).click();
        driver.findElement(By.id("identity_number")).sendKeys("PDT343535");
        driver.findElement(By.id("female")).click();
        Select month= new Select(driver.findElement(By.id("dob_month")));
        select.selectByVisibleText("December");
        Select date= new Select(driver.findElement(By.id("dob_date")));
        date.selectByVisibleText("19");
        Select year=new Select(driver.findElement(By.id("dob_year")));
        year.selectByVisibleText("1994");
        driver.findElement(By.id("married")).click();
        Select code= new Select(driver.findElement(By.id("country_code")));
        code.selectByVisibleText("India");
        driver.findElement(By.id("mobile")).sendKeys("2343535646");
        driver.findElement(By.id("nationality")).sendKeys("Indian");
        driver.findElement(By.name("address")).sendKeys("ABCdd");
        driver.findElement(By.id("state")).sendKeys("MH");
        Select country= new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("India");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

    }

//    public  static void selectOptionInDropDownUsingIteration(List<WebElement> dropDownOptions, String optionToBeSelected) {
//        boolean isFound = false;
//        for (WebElement option : dropDownOptions) {
//            if (option.getText().equals(optionToBeSelected)) {
//                option.click();
//                isFound = true;
//
//                break;
//            }
//            System.out.println(option.getText());
//        }
//        if (!isFound)
//            System.out.println("No matching opion found.");

    }



