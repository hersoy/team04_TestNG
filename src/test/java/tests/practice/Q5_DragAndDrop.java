package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.CapitalsCauntry;
import utilities.Driver;
import utilities.TestBase;

public class Q5_DragAndDrop extends TestBase {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.


      @Test
      public void testCapitalCauntry() {
            CapitalsCauntry capitalsCauntry=new CapitalsCauntry();
            Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
            Actions actions=new Actions(Driver.getDriver());
            actions.dragAndDrop(capitalsCauntry.oslo,capitalsCauntry.norway).perform();
            actions.dragAndDrop(capitalsCauntry.stockholm,capitalsCauntry.sweden).perform();
            actions.dragAndDrop(capitalsCauntry.washington,capitalsCauntry.unitedstates).perform();
            actions.dragAndDrop(capitalsCauntry.copenhagen,capitalsCauntry.denmark).perform();
            actions.dragAndDrop(capitalsCauntry.seoul,capitalsCauntry.southKorea).perform();
            actions.dragAndDrop(capitalsCauntry.rome,capitalsCauntry.italy).perform();
            actions.dragAndDrop(capitalsCauntry.madrid,capitalsCauntry.spain).perform();

           Driver.closeDriver();
      }
}