Feature: Company Manager

  Background: Comman Step For All Scenerios
    * Siteye kullanici bilgileriyle "companymanagerphase1" ve "password" giris yapilir


    Scenario:TC_0301 Lead Atayabilir (Atanmis Lead Ekleme)

      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Ekle butonuna tiklanir ve acilan ekranda aday bilgileri ve operator girilere ekleme yapilir
      * Olusturulan adayin atanmis adaylar listesine eklendigi dogrulanir


    Scenario:TC_0302 Atanmis Lead Listesini Cekebilir

      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Atanmis adaylar listesinin gorundugu dogrulanir


    Scenario:TC_0303 Atanmış lead listesini export edebilir

      * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
      * Disa Aktar butonunun eriselebilir oldugunu dogrular
      * CSV olarak Indir butonunun ersilebilir oldugunu dogrular
      * Yazdir butonunun erisilebilir oldugunu dogrular


    Scenario:TC_0304 Atanmamış leadleri atayabilir (Atanmamis leadlere "operator" atayabilir olmali)*

      * Menudeki Adaylar sekmesinde Atanmamis Adaylar tiklanir
      * Atanmamis adaylarin arasindan istenilen sayidaki aday secilerek Ata butonuna tiklanir ve acilan ekranda herhangi bir operator secilerek atama yapilir
      * Atamasi yapilan adayin atanmis adaylar listesine eklendigi dogrulanir

    Scenario: TC_0305 Lead atayabilir (yeniden atayabilir olarak dikkate aldik)

    * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
    * Atanmis adaylarin arasindan istenilen aday secilerek Yeniden Ata butonuna tiklanir ve acilan ekranda baska bir operator secilerek atama yapilir
    * Atamasi yapilan adayin operatorunun degistigi dogrulanir

    Scenario: TC_0306 Kendine atanmış lead listesini çekebilir
    bu bolum test edilemiyor

