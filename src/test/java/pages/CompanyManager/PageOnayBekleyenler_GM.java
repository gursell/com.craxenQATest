package pages.CompanyManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageOnayBekleyenler_GM {
    public PageOnayBekleyenler_GM() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://test.craxen.com/home/
    @FindBy(xpath = "//p[normalize-space()='Onay Bekleyenler']")
    public WebElement linkOnayBekleyenler;

    //https://test.craxen.com/home/OnayBekleyenler/
    @FindBy(xpath = "//button[@id=':r1p:']")
    public WebElement buttonDisaAktar;

    //https://test.craxen.com/home/OnayBekleyenler
    @FindBy(xpath = "//button[contains(text(),'İncele')]")
    public WebElement buttonIncele;

    //https://test.craxen.com/home/OnayNekleyenler
    @FindBy (xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkBoxAA_1_OBTrader;

    //https://test.craxen.com/home/OnayBekleyenler/İncele/
    @FindBy (xpath = "//span[.='Kimlik Belgesi (Ön)']")
    public WebElement imageProfileKimlikOn;

    //https://test.craxen.com/home/OnayBekleyenler/İncele/KimlikBelgesi(On vs.)
    @FindBy (xpath = "//input[@type='file']")
    public WebElement imageProfileEksikDosyaYukleme;

    //https://test.craxen.com/home/OnayBekleyenler/İncele/KimlikBelgesi(On vs.)
    @FindBy (xpath = "//button[text()='Onay']")
    public WebElement imageProfileOnay;

    //home/OnayBekleyenYatirimciler
    @FindBy (xpath = "//a[normalize-space()='MEHMET EMIN ÇAKIR']")
    public WebElement labelOnayBekleyenyatirimciler;


}
