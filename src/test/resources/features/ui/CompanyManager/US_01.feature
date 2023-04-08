
Feature: US_01 As a Company Manager, Lead menu operations should be possible

  Background: Comman Step For All Scenerios
    * Siteye kullanici bilgileriyle "companymanagerphase1" ve "password" giris yapilir

    Scenario:TC_0101 Company Manager Atanmis Lead listesini cekebilir
      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Atanmis adaylar listesinin gorundugunu dogrularmb


    Scenario:TC_0102 Company Manager Atanmamis Lead listesini Cekebilir
      * Menudeki Adaylar sekmesinde Atanmamis Adaylar tiklanir
      * Atanmamis adaylar listesinin gorundugunu dogrularmb


    Scenario:TC_0103 Company Manager Lead atayabilir
      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Ekle butonuna tiklanir ve acilan ekranda aday bilgileri ve operator girilere ekleme yapilir
      * Olusturulan adayin atanmis adaylar listesine eklendigi dogrulanir

    @mbicer
    Scenario:TC_0104 Company Manager Lead hesabı ekleyebilir
      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Atanmis adayin uzerine cift tiklanir
      * Hesap ac butonuna tiklanir ve gerekli evraklar yuklenir ve evete tiklanir
      * Onay bekleyenler ekraninda bu adayin belirdigi dogrulanir


    Scenario:TC_0105 Company Manager Lead arayabilir
      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Atanmis adayin uzerine cift tiklanir
      * Ara butonunun erisilebilir olup olmadigi dogrulanir
        #(bir pop up cikiyor gerekirse oradan test de yapilabilir)

    Scenario:TC_0106 Company Manager Lead editleyebilir
      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Atanmis adayin uzerine cift tiklanir
      * Edit butonuna tiklanarak istenilen degisiklikler yapilir
      * Leadin ozelliklerinde degisiklik yapilip yapilmadigi dogrulanir.

    Scenario:TC_0107 Company Manager Lead oluşturabilir
      * Menudeki Adaylar sekmesinde Atanmamis Adaylar tiklanir
      * Atanmis adayin uzerine cift tiklanir
      * Eklle butonuna tiklanir ve acilan ekranda aday bilgileri girilere ekleme yapilir
      * Olusturulan adayin atanmamis adaylar listesine eklendigi dogrulanir

    Scenario:TC_0108 Company Manager Lead listesini export edebilir
      *
      *
      *
      *

