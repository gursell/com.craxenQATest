package pages.CompanyManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageYatirimciler_CM {
    public PageYatirimciler_CM() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://test.craxen.com/customers/
    @FindBy(xpath = "//button[@aria-label='Export']")
    public WebElement buttonYDISAAKTAR;

    //https://test.craxen.com/home/Yatırımcılar
    @FindBy (xpath = "(//button[text()='Ekle'])[1]")
    public WebElement buttonYEkle;

    //https://test.craxen.com/home/Yatırımcılar
    @FindBy (xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkBoxY_1_Treader;
}
