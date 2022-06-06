package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {
    public TutorialPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Phones & PDAs']")
        public WebElement phonesPDAs;

    @FindBy(xpath = "//h4")
    public List<WebElement> phoneNames;

    @FindBy(xpath = "//div[@class='button-group']")
    public List<WebElement> addCartButton;

    @FindBy(xpath = "//div[@class='btn-group btn-block']")
    public WebElement blackButton;

    @FindBy(xpath = "//td[@class='text-left']")
    public List<WebElement> namaOfList;





}
