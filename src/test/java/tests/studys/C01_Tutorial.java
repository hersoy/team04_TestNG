package tests.studys;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_Tutorial {

    /*
    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
    ~ click on Phones & PDAs
    ~ get the brandName of phones
    ~ click on add to button for all elements
    ~ click on black total added cart button
    ~ get the names of list from the cart
    ~ compare the names from displaying list and cart list
*/

    @Test
    public void test01() throws InterruptedException {
        TutorialPage tutorialPage = new TutorialPage();

        //    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        Driver.getDriver().get(ConfigReader.getProperty("tutorialUrl"));

        //    ~ click on Phones & PDAs
        tutorialPage.phonesPDAs.click();

        //    ~ get the brandName of phones
        List<String> phoneNamesStr=new ArrayList<>();
        for (WebElement each:tutorialPage.phoneNames
             ) {
            phoneNamesStr.add(each.getText());
        }
        System.out.println(phoneNamesStr);

        //    ~ click on add to button for all elements
        for (WebElement each:tutorialPage.addCartButton
             ) {
            each.click();
            Thread.sleep(3000);
        }
        //    ~ click on black total added cart button
        tutorialPage.blackButton.click();

        //    ~ get the names of list from the cart
        List<String> nameOfListStr=new ArrayList<>();
        for (WebElement each:tutorialPage.namaOfList
             ) {
            nameOfListStr.add(each.getText());
        }

        //    ~ compare the names from displaying list and cart list
        Collections.sort(phoneNamesStr);
        Collections.sort(nameOfListStr);
        Assert.assertEquals(nameOfListStr,phoneNamesStr);

            Driver.closeDriver();
    }
}
