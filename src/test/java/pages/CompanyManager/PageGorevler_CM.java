package pages.CompanyManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageGorevler_CM {
    public PageGorevler_CM() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://test.craxen.com/home/
    @FindBy(xpath = "//p[.='Görevler']")
    public WebElement gorevler;

    //https://test.craxen.com/home/
    @FindBy(xpath = "//button[normalize-space()='GÖREV EKLE']")
    public WebElement buttonGorevEkle;

    //https://test.craxen.com/home/
    @FindBy(xpath = "//button[@title='list view']")
    public WebElement buttonGorevList;

    //home/Gorevler/GorevEkle
    @FindBy(xpath = "//input[@id='add-members']")
    public WebElement dropDownOperatorSec;

    //home/Gorevler/GorevEkle
    @FindBy(xpath = "(//button[text()='Ekle'])[1]")
    public WebElement buttonGorevEkle_Ekle;

    //home/Gorevler/Herhangi bir Görev
    @FindBy(xpath = "//*[@id='add-members']")
    public WebElement buttonGorevler_OperatorSec;

    //home/Gorevler
    @FindBy(xpath = "//button[text()='Güncelle']")
    public WebElement buttonGorevler_Guncelleme;



}
