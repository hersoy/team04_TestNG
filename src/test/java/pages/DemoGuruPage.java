package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoGuruPage {

    public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@class='button button-orange'])[5]")
    public WebElement bankButon;
    @FindBy(xpath= "//div[@id='shoppingCart1']")
    public WebElement accountButon;
    @FindBy(xpath = "(//a[@class='button button-orange'])[6]")
    public WebElement salesButon;
    @FindBy(xpath = "(//div[@class='ui-widget-content'])[4]")
    public WebElement creditAccountButon;
    @FindBy(xpath = "(//a[@class='button button-orange'])[2]")
    public WebElement besbinButon;
    @FindBy(xpath = "(//div[@id='shoppingCart4'])[1]")
    public WebElement debitAmauntButon;
    @FindBy(xpath = "(//a[@class='button button-orange'])[4]")
    public WebElement ikinciBesbin;
    @FindBy(xpath = "(//div[@id='shoppingCart4'])[2]")
    public WebElement creditAmountButon;
    @FindBy(className = "table4_result")
    public WebElement perfectButon;




}
