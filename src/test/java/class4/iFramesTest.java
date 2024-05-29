package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFramesTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        System.out.println("Main iFrame : " + driver.findElement(By.className("text-center")).getText());
        Thread.sleep(2000);
        driver.switchTo().frame("frame1");
        System.out.println("Inside iFrame1 : " + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();

        Thread.sleep(2000);
        driver.switchTo().frame("frame2");
        System.out.println("Inside iFrame2 : " + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        driver.quit();
    }
}
