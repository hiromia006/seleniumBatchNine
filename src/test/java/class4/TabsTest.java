package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        //  implicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        String parentPage = driver.getWindowHandle();
        driver.getWindowHandles();

        WebElement element=driver.findElement(By.className("text-center"));
//        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.alertIsPresent()).getText();
//        System.out.println("Main Window : " + element.getText());
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        System.out.println("Main Window : " + wait.until(ExpectedConditions.visibilityOf(element)).getText());

        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println("Inside Child : " + driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(parentPage);
        Thread.sleep(3000);

        System.out.println("Second Time : " + driver.findElement(By.className("text-center")).getText());
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");
        System.out.println("Inside Child : " + driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(parentPage);
        Thread.sleep(3000);

        driver.quit();
    }
}
