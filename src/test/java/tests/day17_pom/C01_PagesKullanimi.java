package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesKullanimi {


    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazon sayfasina gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // arama kutusuna Nutella yazdirip aratalim
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sayfayi kapatalim

        Driver.closeDriver();



    }



}
