package pages.CompanyManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageRaporlar_CM {
    public PageRaporlar_CM() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://test.craxen.com/home/
    @FindBy(xpath = "//p[normalize-space()='Raporlar']")
    public WebElement dropDownRaporlar;

    //home/Raporlar
    @FindBy(xpath = "//p[normalize-space()='Genel raporlar']")
    public WebElement dropDownGenelRaporlar;

    //home/Raporlar
    @FindBy(xpath = "//p[normalize-space()='Dinamik raporlar']")
    public WebElement dropDownDinamikRaporlar;

    //home/Raporlar/GenelRaporlar
    @FindBy(xpath = "//h4[@class='MuiTypography-root MuiTypography-h4 css-1dmzams']")
    public WebElement labelKarlilik;

    //home/Raporlar/GenelRaporlar
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-szgxzq']")
    public WebElement labelEnvanteIstatistikleri;

    //home/Raporlar/GenelRaporlar
    @FindBy(xpath = "//div[@class='MuiCardContent-root css-yz40z']")
    public WebElement labelGenelBakis;

    //home/Raporlar/GenelRaporlar
    @FindBy(xpath = "//div[@class='MuiDataGrid-main css-opb0c2']")
    public WebElement labelKampanyalar;

    //home/Raporlar/GenelRaporlar
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-16 css-1t8zptu']")
    public WebElement labelLokasyonBazliTrader;

    //home/Raporlar/GenelRaporlar
    @FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-1mcxxmv'])[2]")
    public WebElement labelOperatorBazliPerformans;

    //home/Raporlar/GenelRaporlar
    @FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-1mcxxmv'])[3]")
    public WebElement labelLogRaporlari;

    //home/Raporlar/DinamikRaporlar
    @FindBy(xpath = "//div[contains(@class,'MuiDataGrid-virtualScrollerRenderZone css-1bmj290')]//div[1]//div[3]//div[1]//button[1]")
    public WebElement buttonDetay1;

    //home/Raporlar/DinamikRaporlar
    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButtonBase-root  css-15h5aml']")
    public WebElement buttonRaporDetayGoster1;








}
