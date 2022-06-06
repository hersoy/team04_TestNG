package tests.day16_notasyon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C02_DependsOnMethod {

    WebDriver driver;
    @BeforeClass
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }


    @Test
    public void test01() {
        driver.get("https://www.gittigidiyor.com");
    }

    @Test(dependsOnMethods = "test01")      // test01'e bagladigimiz icin test01 calismayinca bu testi direk gecer.
    public void test02() {
        driver.get("https://www.amazon.com");
    }

    @Test(dependsOnMethods = "test02")      // test02'ye bagladigimiz icin test02 calismayinca bu testi direk gecer.
    public void test03() {
        driver.get("https://www.bestbuy.com");
    }

    @Test                               // bu test bagimsiz oldugudan diger testlere bakmaksizin calisir.
    public void test04() {
        driver.get("https://www.trendyol.com");
    }


}
