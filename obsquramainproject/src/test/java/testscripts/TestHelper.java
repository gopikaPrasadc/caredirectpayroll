package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHelper {
	 WebDriver driver;


@BeforeMethod
public void beforeMethod() {
 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\U48342\\Desktop\\Interview\\chromedriver_win32 (2)");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qabible.in/payrollapp/");
		
}
@AfterMethod
public void afterMethod(ITestResult testResult) throws IOException {
driver.quit();
}
}
