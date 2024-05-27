package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.saucedemo.com/");
        Thread.sleep(2000);
        navigate.back();
        Thread.sleep(2000);
        navigate.forward();
        Thread.sleep(2000);
        navigate.refresh();


        driver.quit();
    }
}
