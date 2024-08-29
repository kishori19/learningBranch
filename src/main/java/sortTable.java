import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class sortTable {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(" https://rahulshettyacademy.com/seleniumPractise/#/offers");
        Thread.sleep(1000l);
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> itemList=driver.findElements(By.xpath("//tr/td[1]"));
       List<String> originalList= itemList.stream().map(s->s.getText()).collect(Collectors.toList());
       List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originalList.equals(sortedList));
        System.out.println(sortedList);
      List<String >price;

        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream().filter(s -> s.getText().contains("Mango")).
                    map(s -> getVeggies(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a));

            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }while (price.size()<1);
    }

    private static String getVeggies(WebElement s) {
        String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;
    }
}
