package EndToEnd.com.seleniumpractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void mytestone() {
        // Set report file path
        ExtentSparkReporter spark = new ExtentSparkReporter("src/test/resources/ExtentReports/index.html");

        // Create ExtentReports instance and attach reporter
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);

        // Create a test in the report
        ExtentTest test = extent.createTest("mytestone");
        test.pass("This is my first test - PASSED");

        // Print to console (optional)
        System.out.println("this is my first test");

        // Finalize the report
        extent.flush();
    }
}
