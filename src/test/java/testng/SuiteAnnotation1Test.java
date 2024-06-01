package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteAnnotation1Test extends BaseSuiteAnnotationTest{
    @Test(priority = 0)
    public void checkTittle() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test(priority = 1)
    public void checkUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
    }

}
