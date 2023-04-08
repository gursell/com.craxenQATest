package pages.CompanyManager;

import org.json.XML;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

public class PageAdaylar_CM {
    public PageAdaylar_CM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    String adayMail;
    String ilkAdayText;
    //https://test.craxen.com/home/
    @FindBy(xpath = "(//div[@class='MuiBox-root css-1dqc8eu'])[1]")
    public WebElement dropDownAdaylar;

    //https://test.craxen.com/leads/all-assigned-leads/
    @FindBy(xpath = "//a[@href='/leads/all-assigned-leads/']")
    public WebElement dropDownAtanmisAdaylar;

    //https://test.craxen.com/leads/unassigned-leads/
    @FindBy(xpath = "//a[@href='/leads/unassigned-leads/']")
    public WebElement dropDownAtanmamisAdaylar;

    //https://test.craxen.com/leads/appointments/
    @FindBy(xpath = "//a[@href='/leads/appointments/']")
    public WebElement dropDownRandevular;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar
    @FindBy(xpath = "//button[@aria-label='Export']")
    public WebElement buttonAADISAAKTAR;

    //home/DDMAdaylar/AtanmisAdaylar/DISAAKTAR
    @FindBy(xpath = "//li[normalize-space()='CSV olarak indir']")
    public WebElement buttonAADisaAktar_CSV;

    //home/DDMAdaylar/AtanmisAdaylar/DISAAKTAR
    @FindBy(xpath = "//li[contains(text(),'Yazdır')]")
    public WebElement buttonAADisaAktar_Yazdir;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar
    @FindBy(xpath = "//button[text()='Durum Değiştir']")
    public WebElement buttonAADurumDegistir;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar
    @FindBy(xpath = "//button[text()='Yeniden Ata']")
    public WebElement buttonAAYenidenAta;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar
    @FindBy(xpath = "(//button[text()='Ekle'])[1]")
    public WebElement buttonAAEkle;

    //home/DDMAdaylar/AtanmisAdaylar/Ekle
    @FindBy(xpath = "(//button[text()='Ekle'])[2]")
    public WebElement buttonAAEkle_Ekle;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar/Filtreler
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[1]")
    public WebElement listBoxFiltreAADurumSec;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar/Filtreler
    @FindBy(xpath = "(//*[@data-testid='ArrowDropDownIcon'])[6]")
    public WebElement listBoxFiltreAAOperatorSec;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar/1.LeadChechBox
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkBoxAA_1_Lead;

    //https://test.craxen.com/home/DDMAdaylar/AtanmisAdaylar
    @FindBy(xpath = "//button[@aria-label='Go to next page']")
    public WebElement buttonAANextPage;

    //https://test.craxen.com/home/DDMAdaylar/AtanmamisAdaylar
    @FindBy(xpath = "//button[text()='Durum Değiştir']")
    public WebElement buttonAtmmsADurumDegistir;

    //https://test.craxen.com/home/DDMAdaylar/AtanmamisAdaylar
    @FindBy(xpath = "//button[text()='Ata']")
    public WebElement buttonAtmmsAYenidenAta;

    //https://test.craxen.com/home/DDMAdaylar/AtanmamisAdaylar/Filtreler
    @FindBy(xpath = "(//button[text()='Ekle'])[1]")
    public WebElement buttonAtmmsAEkle;

    //home/DDMAdaylar/AtanmamisAdaylar/Ekle/Durum
    @FindBy(xpath = "(//fieldset[@class='MuiOutlinedInput-notchedOutline css-igs3ac'])[11]")
    public WebElement butdropDownDurum;

    //https://test.craxen.com/home/DDMAdaylar/AtanmamisAdaylar/Filtreler
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[1]")
    public WebElement listBoxFiltreAtmmsADurumSec;

    //https://test.craxen.com/home/DDMAdaylar/AtanmamisAdaylar/1.LeadChechBox
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkBoxAtmmsA_1_Lead;

    //home/DDMAdaylar/AtanmamisAdaylar/1.LeadChechBox/Ata ve Atanmışlar için YenidenAta aynı locate
    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-16ybb4f']")
    public WebElement buttonAtamayiTamamla;

    //home/DDMAdaylar/AtanmisAdaylar/LeadCiftTık
    @FindBy(xpath = "//button[contains(@title,'Hesap Aç')]//*[name()='svg']//*[name()='path' and contains(@d,'M15 12c2.2')]")
    public WebElement buttonHesapAc;

    //home/DDMAdaylar/AtanmisAdaylar/LeadCiftTık
    @FindBy(xpath = "//button[@title='Ara']")
    public WebElement buttonLeadAra;

    //home/DDMAdaylar/AtanmisAdaylar/LeadCiftTık
    @FindBy(xpath = "//button[@title='Düzenle']")
    public WebElement buttonLeadDuzenle;

    //home/DDMaAdaylar/AtanmisAdaylar/AdaylarList
    @FindBy(xpath = "//div[@class='MuiDataGrid-root MuiDataGrid-autoHeight MuiDataGrid-root--densityStandard css-15b01iv']")
    public WebElement atanmisAdaylarListKontrol;

    @FindBy(xpath = "(//*[@class='MuiCheckbox-root MuiCheckbox-colorPrimary MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary PrivateSwitchBase-root MuiDataGrid-checkboxInput css-1u1597f'])[2]")
    public WebElement atanmamisAdaySecmeKutucuk1;

    @FindBy(xpath = "(//a[@class='MuiTypography-root MuiTypography-caption MuiTypography-noWrap css-h43xt4'])[1]")
    public WebElement atanmamisIlkAdayMail;

    @FindBy(xpath = "(//*[@data-testid='ArrowDropDownIcon'])[2]")
    public WebElement atanmisAdayOperatorFiltre;

    @FindBy(xpath = "(//a[@class='MuiTypography-root MuiTypography-caption MuiTypography-noWrap css-h43xt4'])[1]")
    public WebElement atanmisSonAdayMail;

    @FindBy(xpath = "//div[@class='MuiDataGrid-cellCheckbox MuiDataGrid-cell--withRenderer MuiDataGrid-cell MuiDataGrid-cell--textCenter']")
    public WebElement atanmisAdaySecmeKutucuk1;

    @FindBy(xpath = "(//*[@data-testid='ArrowDropDownIcon'])[8]")
    public WebElement listBoxFiltreAtanmisAdayOperatorSec;

    @FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-cv5mss']")
    public WebElement buttonAAHesapAcEVET;
    //home/DDMaAdaylar/AtanmisAdaylar/LeadCiftTık/HesapAc/EVET
    @FindBy(xpath = "//a[normalize-space()='TEST@TESTn.com']")
    public WebElement textIlkAdaymail;
    //home/DDMaAdaylar/AtanmisAdaylar/Ilkadaymail/

    //***********************************************************************************************//

    //***************************************MBİCERLocations*****************************************//
    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-1074uzr']")
    public WebElement stringSonucAAList;
    //home/DDMAdaylar/AtanmisAdaylar/Sonuc=1–20 of 367846

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-1074uzr']")
    public WebElement stringSonucAtanmamisAList;
    //home/DDMAdaylar/AtanmamisAdaylar/Sonuc=1–20 of 389
    @FindBy(xpath = "(//*[@data-testid='ArrowDropDownIcon'])[4]")
    public WebElement ddmLeadDuzenlemeDurum;
    //home/DDMAdaylar/AtanmışAdaylar/CiftTık/Edit/Durum

    @FindBy(xpath = "(//span[@class='MuiChip-label MuiChip-labelSmall css-tavflp'])[1]")
    public WebElement labelEditAdayDurum;
    //home/DDMAdaylar/AtanmışAdaylar/CiftTık/

    @FindBy(xpath = "(//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButtonBase-root  css-1bz1cxz'])[2]")
    public WebElement buttonTamamEditAday;
    //home/DDMAdaylar/AtanmışAdaylar/CiftTık/Edit/Tamam


    /*********************************************************************************************************/
    Actions actions = new Actions(Driver.getDriver());

    public void atanmamisAdayiAtamaSonrasiKontrolMethodu() {
        atanmamisAdaySecmeKutucuk1.click();
        adayMail = atanmamisIlkAdayMail.getText();
        buttonAtmmsAYenidenAta.click();
        listBoxFiltreAAOperatorSec.click();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        buttonAtamayiTamamla.click();

    }

    public void atanmisAdayDogrulamaMethodu() {
        dropDownAtanmisAdaylar.click();
        ReusableMethods.wait(2);
        atanmisAdayOperatorFiltre.click();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(2);
        String atanmisAdayMail = atanmisSonAdayMail.getText();
        Assert.assertEquals(adayMail, atanmisAdayMail);
        atanmisAdaySecmeKutucuk1.click();
        buttonAAYenidenAta.click();
        listBoxFiltreAtanmisAdayOperatorSec.click();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        buttonAtamayiTamamla.click();
    }

    public void atanmisAdayOperatorDegistirmeMethodu() {

            atanmisAdaySecmeKutucuk1.click();
            ilkAdayText = atanmamisIlkAdayMail.getText();
            buttonAAYenidenAta.click();
            listBoxFiltreAtanmisAdayOperatorSec.click();
            ReusableMethods.wait(2);
            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            ReusableMethods.wait(2);
            buttonAtamayiTamamla.click();
        }

        public void atanmisAdayOperatorDegisikligiDogrulamaMethodu () {
            atanmisAdayOperatorFiltre.click();
            ReusableMethods.wait(2);
            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            ReusableMethods.wait(2);
            String degisenOperatorTEXT = atanmisSonAdayMail.getText();
            Assert.assertEquals(ilkAdayText, degisenOperatorTEXT);
            buttonAAYenidenAta.click();
            listBoxFiltreAtanmisAdayOperatorSec.click();
            ReusableMethods.wait(2);
            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            buttonAtamayiTamamla.click();
        }
    }

