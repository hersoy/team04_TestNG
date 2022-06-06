package tests.day19_smokeTest;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ScholasticPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class ScholasticHtmlTest extends TestBaseRapor{

ScholasticPage scp=new ScholasticPage();
    @Test
    public void test01() {
        //open shop.scholastic.com
        Driver.getDriver().get(ConfigReader.getProperty("scholasticUrl"));
       extentTest=extentReports.createTest("scholastic test","scholastik test degerleri girildi");

        //hover over profile icon top right of screen and click register
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(scp.profil).perform();
        extentTest.info("profil üzerine gidildi");
        action.click(scp.register).perform();
        extentTest.info("registraer secenegi secildi");

        //enter valid name and email address then click next
        Faker faker=new Faker();
        Driver.getDriver().switchTo().frame(scp.iframe);
        scp.firstName.sendKeys(faker.name().firstName());
        extentTest.info("kayit icin uygun kullanici adi girildi");
        scp.lastName.sendKeys(faker.name().lastName());
        extentTest.info("kayit icin uygun kullanici soyadi girildi");
        scp.email.sendKeys(faker.internet().emailAddress());
        extentTest.info("kayit icin uygun kullanici email girildi");
        scp.nextButonIlk.click();
        extentTest.info("next butonuna tiklandi");

        //enter valid password, click box then click next
        scp.password.sendKeys("a123456Z");
        extentTest.pass("uygun bir sifre girildi");
        scp.conPassword.sendKeys("a123456Z");
        extentTest.pass("uygun sifre tekrar girildi");
        scp.tik.click();
        scp.nextButSon.click();
        extentTest.pass("next butonuna tiklandi");

        // select "parent" then click next

        //Click "skip this step"
        //click "contıune" buton
        //hover over/click profil icon


    }





}
