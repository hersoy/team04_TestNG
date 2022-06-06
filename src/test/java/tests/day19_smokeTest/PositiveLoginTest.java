package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class PositiveLoginTest extends TestBaseRapor {

    BrcPage brcPage=new BrcPage();

    @Test
    public void positiveLoginTest() {
        extentTest=extentReports.createTest("rentalCarSayfasi","dogru sifre ve kullanici adi ile bu sayfaya basarıyla girilebilmeli");
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        utilities.Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("dogru url ile sayfaya girildi");
        //      login butonuna bas
        brcPage.ilkLoginButon.click();
        extentTest.info("login butonuna tiklandi");
        //test data user email: customer@bluerentalcars.com,
        brcPage.emailTextbox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("gecerli email yazildi");
        //test data password : 12345
        brcPage.passwordTextbox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        extentTest.info("gecerli password yazildi");
        // login butonuna tıklayin
        brcPage.ikinciLoginButonu.click();
        extentTest.info("login butonuna tıklandi");
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUserName=brcPage.kullaniciProfilIsmi.getText();
        String expectedUserName=ConfigReader.getProperty("brcValidUserName");

        Assert.assertEquals(actualUserName,expectedUserName);
        extentTest.pass("siteye basarili bir sekilde girildigi dogrulandi");
        Driver.closeDriver();
    }

}
