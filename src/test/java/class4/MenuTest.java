package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MenuTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        new Actions(driver).moveToElement(driver.findElement(By.linkText("Main Item 2")))
                .click().perform();
        Thread.sleep(2000);

        new Actions(driver).moveToElement(driver.findElement(By.linkText("SUB SUB LIST »")))
                .click().perform();
        Thread.sleep(2000);
        new Actions(driver).moveToElement(driver.findElement(By.linkText("Sub Sub Item 2")))
                .click().perform();
        Thread.sleep(2000);

        driver.quit();

    }
}
