package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseMethodTest {
    WebDriver driver;

    @BeforeMethod
    public void setupBrowser() {
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
