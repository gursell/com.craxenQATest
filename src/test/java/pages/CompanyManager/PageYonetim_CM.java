package pages.CompanyManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageYonetim_CM {
    public PageYonetim_CM() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://test.craxen.com/home/
    @FindBy (xpath = "(//div[@class='menu-item-meta MuiBox-root css-1413r36'])[3]")
    public WebElement buttonYonetim;

    //https://test.craxen.com/administration/
    @FindBy (xpath = "//button[text()='Kullanıcılar']")
    public WebElement buttonKullanicilar;

    //https://test.craxen.com/administration/
    @FindBy (xpath = "//button[@id=':r1t:']")
    public  WebElement buttonDisaAktar;

    //https://test.craxen.com/teams/
    @FindBy (xpath = "//*[text()='Takımlar'][1]")
    public WebElement buttonTakimlar ;

    //https://test.craxen.com/teams/
    @FindBy (xpath = "//button[ text()='Ekle']")
    public WebElement buttonEkle;

    //home/Yönetim/Kullanıcılar/Ekle
    @FindBy(xpath = "(//button[text()='Ekle'])[1]")
    public WebElement dropDownRaporlar;

    //home/Yönetim/Kullanıcılar/Filtreler
    @FindBy(xpath = "//div[normalize-space()='Tümü']")
    public WebElement dropDownRolSec;

    //home/Yönetim/Kullanıcılar/TümKullanıcılar/1.LEadOperator locate
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkBoxLeadOperator;

    //home/Yönetim/Kullanıcılar/DISAAKTAR
    @FindBy (xpath = "//li[normalize-space()='CSV olarak indir']")
    public WebElement buttonYonetimDisaAktar_CSV;

    //home/Yönetim/Kullanıcılar/DISAAKTAR
    @FindBy (xpath = "//li[contains(text(),'Yazdır')]")
    public WebElement buttonYonetimDisaAktar_Yazdir;

    //home/Yönetim/Kullanıcılar/LeadOperatorCiftTık/Düzenle
    @FindBy (xpath = "//button[@title='Düzenle']")
    public WebElement buttonLeadOperatorEdit;

    //home/Yönetim/Kullanıcılar/RolSec/Ekle/Ekle
    @FindBy (xpath = "(//button[text()='Ekle'])[2]")
    public WebElement buttonAAEkle_Ekle;

    //home/Yönetim/Kullanıcılar/Filtreler
    @FindBy(xpath = "//li[text()='Trader Operator']")
    public WebElement dropDownRolSecTraderOperator;

    //home/Yönetim/Kullanıcılar/FiltrelerTümü
    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-1074uzr']")
    public WebElement labelUserSonuc;



    /********************************************************************************************************/


    //https://test.craxen.com/teams/     (dinamik yapılabilir)
    @FindBy (xpath = "(//div[@class='MuiGrid-root css-od7ylr'])[1]")
    public  WebElement buttonDuzenle;

    //https://test.craxen.com/teams/     (dinamik yapılabilir)
    @FindBy (xpath ="(//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-cpy7sg'])[1]")
    public WebElement buttonDelete;

    //https://test.craxen.com/teams/     (dinamik yapılabilir)
    @FindBy  (xpath ="(//div[@class='MuiGrid-root css-rfnosa'])[1]")
    public WebElement buttonKullanicilariYonet;

    //https://test.craxen.com/teams/    kullanici yonete tıklayınca Kullanıcı yazan checkbox
    @FindBy  (xpath ="((//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
    public WebElement checkboxKullanici;

    //https://test.craxen.com/teams/    kullanici yonete tıklayınca  Kullancıdaki ilk sıradaki isim dinamik yapılabilir
    @FindBy (xpath ="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
    public WebElement  checkboxKullaniciIlkSira;

    //https://test.craxen.com/teams/    kullanici yonete tıklayınca kullanici seçilince çıkıyor
    @FindBy(xpath ="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1qzh0e6']")
    public WebElement buttonYoneticiYap;

    //https://test.craxen.com/teams/    kullanici yonete tıklayınca  çıkıyor
    @FindBy(xpath = "//input[@id='add-members']")
    public WebElement dropdownKulaniciEkle;

    //dropdown listesinin locate kaldı alamadım

    //https://test.craxen.com/teams/    kullanici yonete tıklayınca  çıkıyor
    @FindBy (xpath= "//span[ text()='Ekle']")
    public  WebElement buttonkullaniciYonetteEkle;



}
