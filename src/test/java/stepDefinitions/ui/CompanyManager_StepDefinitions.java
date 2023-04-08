package stepDefinitions.ui;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.CompanyManager.PageAdaylar_CM;
import pages.CompanyManager.PageOnayBekleyenler_GM;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;

import java.util.List;


public class CompanyManager_StepDefinitions {
    PageAdaylar_CM adaylar = new PageAdaylar_CM();

    PageOnayBekleyenler_GM pageOnayBekleyenler_gm = new PageOnayBekleyenler_GM();

    Actions actions = new Actions(Driver.getDriver());


     @Given("Ekle butonuna tiklanir ve acilan ekranda aday bilgileri ve operator girilere ekleme yapilir")
    public void ekle_butonuna_tiklanir_ve_acilan_ekranda_aday_bilgileri_ve_operator_girilere_ekleme_yapilir() {
        ReusableMethods.wait(2);
        adaylar.buttonAAYenidenAta.click();
    }



    @Given("Olusturulan adayin atanmis adaylar listesine eklendigi dogrulanir")
    public void olusturulan_adayin_atanmis_adaylar_listesine_eklendigi_dogrulanir() {
        adaylar.dropDownAdaylar.click();
        adaylar.dropDownAtanmisAdaylar.click();
        adaylar.listBoxFiltreAAOperatorSec.sendKeys("test");
    }

    @Given("Disa Aktar butonunun eriselebilir oldugunu dogrular")
    public void disa_aktar_butonunun_eriselebilir_oldugunu_dogrular() {
        ReusableMethods.wait(2);
        adaylar.buttonAADISAAKTAR.click();
        Assert.assertTrue(adaylar.buttonAADISAAKTAR.isEnabled());

    }

    @Given("CSV olarak Indir butonunun ersilebilir oldugunu dogrular")
    public void csv_olarak_indir_butonunun_ersilebilir_oldugunu_dogrular() {
        Assert.assertTrue(adaylar.buttonAADisaAktar_CSV.isEnabled(), "CSV butonuna erisilemiyor");
    }



    @Given("Yazdir butonunun erisilebilir oldugunu dogrular")
    public void yazdir_butonunun_erisilebilir_oldugunu_dogrular() {
        Assert.assertTrue(adaylar.buttonAADisaAktar_Yazdir.isEnabled(), "Yazdir butonuna Erisilemiyor");
    }

    @Given("Atanmis adayin uzerine cift tiklanir")
    public void atanmis_adayin_uzerine_cift_tiklanir() {
        String ilkAdayMail = adaylar.textIlkAdaymail.getText();
        actions.doubleClick(adaylar.textIlkAdaymail).perform();
    }

    @Given("Hesap ac butonuna tiklanir ve gerekli evraklar yuklenir ve evete tiklanir")
    public void hesap_ac_butonuna_tiklanir_ve_gerekli_evraklar_yuklenir_ve_evete_tiklanir() {
        ReusableMethods.waitForClickablility(adaylar.buttonHesapAc,2);
        actions.moveToElement(adaylar.buttonHesapAc).click().perform();
        actions.moveToElement(adaylar.buttonAAHesapAcEVET).click().perform();

    }

    @Given("Onay bekleyenler ekraninda bu adayin belirdigi dogrulanir")
    public void onay_bekleyenler_ekraninda_bu_adayin_belirdigi_dogrulanir() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitForClickablility(pageOnayBekleyenler_gm.linkOnayBekleyenler,5);
        pageOnayBekleyenler_gm.linkOnayBekleyenler.click();
        ReusableMethods.wait(3);
        List<WebElement> searchElement = Driver.getDriver().findElements(By.xpath("//a[contains(text(),'.com')]"));
        System.out.println("searchElement = " + searchElement);
        String expSearchText = adaylar.textIlkAdaymail.getText();
        System.out.println("expSearchText = " + expSearchText);
        Assert.assertTrue(searchElement.contains(expSearchText), "Onay bekleyenlerde aday gorulmemektedir");

    }


    //**************************************___MEHMET___********************************************//

    @Given("Atanmis adaylar listesinin gorundugunu dogrularmb")
    public void Atanmis_adaylar_listesinin_gorundugunu_dogrularmb() {
        String sonucText = adaylar.stringSonucAAList.getText();
        System.out.println("sonucText = " + sonucText);
        String sonuc = sonucText.substring(8, 14);
        int actSonuc = Integer.parseInt(sonuc);
        System.out.println("actSonuc = " + actSonuc);
        Assert.assertTrue(actSonuc > 0, "adaylar listesi gorulmuyor");
    }

    @Given("Atanmamis adaylar listesinin gorundugunu dogrularmb")
    public void atanmamis_adaylar_listesinin_gorundugunu_dogrularmb() {
        String sonucText = adaylar.stringSonucAtanmamisAList.getText();
        System.out.println("sonucText = " + sonucText);
        String sonuc = sonucText.substring(8, 14);
        int actSonuc = Integer.parseInt(sonuc);
        System.out.println("actSonuc = " + actSonuc);
        Assert.assertTrue(actSonuc > 0, "adaylar listesi gorulmuyor");
    }

    @Given("Ara butonunun erisilebilir olup olmadigi dogrulanir")
    public void ara_butonunun_erisilebilir_olup_olmadigi_dogrulanir() {
        Assert.assertTrue(adaylar.buttonLeadAra.isEnabled(),"Ara butonu erişilebilir");
    }


    @Given("Edit butonuna tiklanarak istenilen degisiklikler yapilir")
    public void edit_butonuna_tiklanarak_istenilen_degisiklikler_yapilir() {
        adaylar.buttonLeadDuzenle.click();
    }
    @Given("Leadin ozelliklerinde degisiklik yapilip yapilmadigi dogrulanir.")
    public void leadin_ozelliklerinde_degisiklik_yapilip_yapilmadigi_dogrulanir() {
        ReusableMethods.wait(1);
        actions.moveToElement(adaylar.ddmLeadDuzenlemeDurum).click().perform();
        String actAdayDurum=adaylar.labelEditAdayDurum.getText();
        System.out.println("actAdayDurum = " + actAdayDurum);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER).perform();
        adaylar.buttonTamamEditAday.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.wait(5);
        String expAdayDurum= adaylar.labelEditAdayDurum.getText();
        System.out.println("expAdayDurum = " + expAdayDurum);
        Assert.assertTrue(actAdayDurum.contains(expAdayDurum), "Ozellikler degismemistir");
        ReusableMethods.wait(3);
    }

    /*
    @Given("Eklle butonuna tiklanir ve acilan ekranda aday bilgileri girilere ekleme yapilir")
    public void eklle_butonuna_tiklanir_ve_acilan_ekranda_aday_bilgileri_girilere_ekleme_yapilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Olusturulan adayin atanmamis adaylar listesine eklendigi dogrulanir")
    public void olusturulan_adayin_atanmamis_adaylar_listesine_eklendigi_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/
}
