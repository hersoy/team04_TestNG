package tests.day17_pom;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoGuruPage;
import utilities.Driver;

public class C03 {

    /*
    http://demo.guru99.com/test/drag_drop.html url e git
    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    Perfect butonun goruntulendigini dogrulayin
     */

    @Test
    public void test01() {
        DemoGuruPage demoGuruPage=new DemoGuruPage();

        Driver.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        Actions action=new Actions(Driver.getDriver());

      action.dragAndDrop(demoGuruPage.bankButon,demoGuruPage.accountButon).perform();

      action.dragAndDrop(demoGuruPage.salesButon,demoGuruPage.creditAccountButon).perform();

      action.dragAndDrop(demoGuruPage.besbinButon,demoGuruPage.debitAmauntButon).perform();

      action.dragAndDrop(demoGuruPage.ikinciBesbin,demoGuruPage.creditAmountButon).perform();

      Assert.assertTrue(demoGuruPage.perfectButon.isDisplayed());

      Driver.closeDriver();








    }

}
