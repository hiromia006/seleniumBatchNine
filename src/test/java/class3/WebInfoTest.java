package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebInfoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement webElement=driver.findElement(By.id("user-name"));
        System.out.println("Tag Name: "+ webElement.getTagName());
        System.out.println("X, y Name: "+ webElement.getRect().x + " " +webElement.getRect().y);

        WebElement element=driver.findElement(By.id("login-button"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getAttribute("class"));

        Thread.sleep(2000);
        driver.quit();
    }
}
