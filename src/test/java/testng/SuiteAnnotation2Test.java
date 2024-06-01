package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteAnnotation2Test extends BaseSuiteAnnotationTest{
    @Test(priority = 0, enabled = true)
    public void loginFail() {
        driver.findElement(By.id("user-name")).sendKeys("sadsadsa");
        driver.findElement(By.id("login-button")).click();
        int count = driver.findElements(By.className("error-message-container")).size();
        Assert.assertEquals(count, 1);

    }

    @Test(priority = 1)
    public void loginPass() throws InterruptedException {
        driver.navigate().refresh();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        String logoutText = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(logoutText, "Logout");

    }
}
