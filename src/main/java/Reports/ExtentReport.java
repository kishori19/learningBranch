package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReport {
    ExtentReports extentReport;
    @BeforeTest
    public void config()
    {
        String path=System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter= new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extentReport= new ExtentReports();
        extentReport.attachReporter(reporter);
        extentReport.setSystemInfo("Tester Name:","Kishori Patil");


    }


    @Test
    public void invokeBrowser()
    {
      ExtentTest test= extentReport.createTest("invokeBrowser");
        System.setProperty("webdriver.edge.driver", "/Users/kisho/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.close();
        test.fail("Result do not match");
        extentReport.flush();
    }
}