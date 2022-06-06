package tests.practice;

import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q1_Priority {


    /*
      ●TestNG (default ) olarak @Test methodları ni alfabetik sıraya gore run eder ..(Yukardan asagi degil)
      ●priority annotation Testlere öncelik vermek icin kullanilir, Kucuk olan Numara daha once calisir.
      priority:  TestNG testlerinde, testler konsola alfabetik sira ile yazdirilir.
      priority-> default sifirdir..

      enabled = false  methodu : Testi gormezden gelmek icin @Test in yanina    '(enabled = false)' fonksiyonunu kullaniriz.
     */

    @Test(priority = 5)
    public void test01() {
       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        Driver.closeDriver();
    }

    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        Driver.closeDriver();
    }

    @Test(priority = 1)
    public void test03() {
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));

        Driver.closeDriver();
    }


}
