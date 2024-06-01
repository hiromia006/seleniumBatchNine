package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MethodAnnotationTest extends BaseMethodTest {
    @Test
    public void checkTittle() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test
    public void checkUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
    }

    @Test
    public void loginFail() {
        driver.findElement(By.id("user-name")).sendKeys("sadsadsa");
        driver.findElement(By.id("login-button")).click();
        int count = driver.findElements(By.className("error-message-container")).size();
        Assert.assertEquals(count, 1);

    }

    @Test
    public void loginPass() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();

        String logoutText = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(logoutText, "Logout");

    }
}
