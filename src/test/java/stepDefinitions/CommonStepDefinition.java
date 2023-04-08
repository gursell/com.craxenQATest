package stepDefinitions;


import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.CompanyManager.PageAdaylar_CM;
import pages.CompanyManager.PageYonetim_CM;
import pages.PageLogout;
import pages.PageUserLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;

import javax.swing.*;

public class CommonStepDefinition {
    PageUserLogin userLoginPage = new PageUserLogin();
    PageAdaylar_CM pageAdaylarCm = new PageAdaylar_CM();
    PageYonetim_CM yonetimCm=new PageYonetim_CM();
    Actions actions=new Actions(Driver.getDriver());


    @Given("Kullanici Cikis yapar ve Sayfayi Kapatir")
    public void user_logout() {
        new PageLogout().logout();
        Driver.closeDriver();
    }


    @Given("Go to {string} url")
    public void go_to_url(String givenUrl) {
        Driver.getDriver().get(givenUrl);
    }



    // _______________________________ Ayse __________________________________________

    @Given("Siteye kullanici bilgileriyle {string} ve {string} giris yapilir")
    public void siteye_kullanici_bilgileriyle_ve_giris_yapilir(String userKey, String passwordKey) {
        userLoginPage.login(userKey, passwordKey);

    }
    @Given("Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir")
    public void menudeki_adaylar_sekmesinde_atanmis_adaylar_tiklanir() {
        pageAdaylarCm.dropDownAdaylar.click();
        pageAdaylarCm.dropDownAtanmisAdaylar.click();
        ReusableMethods.wait(5);
    }
    @Given("Atanmis adaylarin arasindan istenilen aday secilerek Yeniden Ata butonuna tiklanir ve acilan ekranda baska bir operator secilerek atama yapilir")
    public void atanmis_adaylarin_arasindan_istenilen_aday_secilerek_yeniden_ata_butonuna_tiklanir_ve_acilan_ekranda_baska_bir_operator_secilerek_atama_yapilir() {
   pageAdaylarCm.atanmisAdayOperatorDegistirmeMethodu();

    }
    @Given("Atamasi yapilan adayin operatorunun degistigi dogrulanir")
    public void atamasi_yapilan_adayin_operatorunun_degistigi_dogrulanir() {
    pageAdaylarCm.atanmisAdayOperatorDegisikligiDogrulamaMethodu();

    }

    @Given("Atanmis adaylar listesinin gorundugu dogrulanir")
    public void atanmis_adaylar_listesinin_gorundugu_dogrulanir() {
        Assert.assertTrue(pageAdaylarCm.atanmisAdaylarListKontrol.isDisplayed(),"adaylar listesi gorulemiyor");
    }

    @Given("Menudeki Adaylar sekmesinde Atanmamis Adaylar tiklanir")
    public void menudeki_adaylar_sekmesinde_atanmamis_adaylar_tiklanir() {
        pageAdaylarCm.dropDownAdaylar.click();
        pageAdaylarCm.dropDownAtanmamisAdaylar.click();
    }
    @Given("Atanmamis adaylarin arasindan istenilen sayidaki aday secilerek Ata butonuna tiklanir ve acilan ekranda herhangi bir operator secilerek atama yapilir")
    public void atanmamis_adaylarin_arasindan_istenilen_sayidaki_aday_secilerek_ata_butonuna_tiklanir_ve_acilan_ekranda_herhangi_bir_operator_secilerek_atama_yapilir() {
    pageAdaylarCm.atanmamisAdayiAtamaSonrasiKontrolMethodu();

    }
    @Given("Atamasi yapilan adayin atanmis adaylar listesine eklendigi dogrulanir")
    public void atamasi_yapilan_adayin_atanmis_adaylar_listesine_eklendigi_dogrulanir() {
     pageAdaylarCm.atanmisAdayDogrulamaMethodu();
    }
    @Given("Menudeki Yonetim sekmesinden Takimlar sekmesi tiklanir")
    public void menudeki_yonetim_sekmesinden_takimlar_sekmesi_tiklanir() {
    yonetimCm.buttonYonetim.click();
    yonetimCm.buttonTakimlar.click();
    }
    @Given("Listenin dis aktarildigi dogrulanir")
    public void listenin_dis_aktarildigi_dogrulanir() {
    Assert.assertTrue( pageAdaylarCm.buttonAADISAAKTAR.isDisplayed(),"Disa Aktar bolumu mevcut degil");
    }


    // _______________________________ Levent __________________________________________



    // _______________________________ Mehmet __________________________________________



    // _______________________________ Nevzat __________________________________________



    // _______________________________ Gursel __________________________________________



    // _______________________________ Zuhal ___________________________________________




}