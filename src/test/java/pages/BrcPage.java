package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButon;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextbox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = " //button[@id='dropdown-basic-button']")
    public WebElement kullaniciProfilIsmi;



}
