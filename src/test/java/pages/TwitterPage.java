package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TwitterPage {
    public TwitterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Telefon numarası veya e-posta adresiyle kaydol']")
    public WebElement kayitButonu;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-mk0yit r-1f1sjgu'])[1]")
    public WebElement isimKutusu;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-mk0yit r-1f1sjgu'])[2]")
    public WebElement telefonKutusu;

    @FindBy(xpath = "(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")
    public WebElement ileriButonu;


}
