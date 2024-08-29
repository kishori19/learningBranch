import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class frameDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        WebElement frame= driver.findElement(By.className("demo-frame"));
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(frame);
        Actions action= new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement((By.id("droppable")));
        action.dragAndDrop(source,target).build().perform();

        //step to perform normal operation after doing iframe
        //driver.switchTo().defaultContent();



    }
}
