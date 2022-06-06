package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UniversityPage {

    public UniversityPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "button1")
    public WebElement jSAlertButon;

}
