package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MotelPage;
import utilities.Driver;

public class C02_MotelClass {
    @Test
    public void MotelPageTest() {

        MotelPage motelPage=new MotelPage();

        // 1) Bir test method olustur positiveLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com");
        // login butonuna bas
        motelPage.login.click();
        // test data username: manager
        motelPage.userName.sendKeys("manager");
        // test data password : Manager1!
        motelPage.password.sendKeys("Manager1!");
        motelPage.LoginGiris.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(motelPage.sonucYazıElementi.isDisplayed());

        Driver.closeDriver();

    }




}
