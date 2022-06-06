package tests.practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TwitterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Q6_DropDown_FakerClass {
    //twitter a faker class kullanarak mail ile kayit olmaya calisiniz
    //actions class kullanmayin twitteri deneyen instagram i denesin

TwitterPage twitterPage=new TwitterPage();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("twitterUrl"));
        twitterPage.kayitButonu.click();
        Faker faker = new Faker();

        twitterPage.isimKutusu.sendKeys("ammet can");
        twitterPage.telefonKutusu.sendKeys("5322345784");
        twitterPage.ileriButonu.click();

    }
}
