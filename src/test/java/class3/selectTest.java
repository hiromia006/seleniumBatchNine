package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();

        Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));
        select.selectByIndex(3);
        Thread.sleep(2000);

        select.selectByValue("ALGERIA");
        Thread.sleep(2000);

        select.selectByVisibleText("ALBANIA");
        Thread.sleep(2000);

        for (WebElement element : select.getOptions()) {
            System.out.println(element.getText());
        }

        driver.quit();
    }
}
