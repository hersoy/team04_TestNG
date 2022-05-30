package tests.day16_notasyon;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_priority extends TestBase {

    @Test(priority = 3)
    public void test01() {
        driver.get("https://www.gittigidiyor.com");
    }

    @Test(priority = 1)
    public void test02() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test03() {
        driver.get("https://www.bestbuy.com");
    }
}
