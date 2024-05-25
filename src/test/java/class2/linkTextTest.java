package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkTextTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

       driver.findElement(By.linkText("Register")).click();
       Thread.sleep(2000);

       driver.findElement(By.partialLinkText("got log")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
