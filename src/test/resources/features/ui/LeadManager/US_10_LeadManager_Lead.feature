@Ayse
Feature: US_10 LeadManager Lead

  Scenario: Lead atayabilir (atanmis bir lead e baska bir lead atama)

  * Siteye kullanici bilgileriyle "leadmanagerphase1" ve "password" giris yapilir
  * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
  * Atanmis adaylarin arasindan istenilen aday secilerek Yeniden Ata butonuna tiklanir ve acilan ekranda baska bir operator secilerek atama yapilir
  * Atamasi yapilan adayin operatorunun degistigi dogrulanir


  Scenario: Atanmış lead listesini çekebilir

  * Siteye kullanici bilgileriyle "leadmanagerphase1" ve "password" giris yapilir
  * Menudeki Adaylar sekmesinde Atanmis Adaylar tiklanir
  * Atanmis adaylar listesinin gorundugu dogrulanir


   Scenario: Atanmamış leadleri atayabilir

   * Siteye kullanici bilgileriyle "leadmanagerphase1" ve "password" giris yapilir
   * Menudeki Adaylar sekmesinde Atanmamis Adaylar tiklanir
   * Atanmamis adaylarin arasindan istenilen sayidaki aday secilerek Ata butonuna tiklanir ve acilan ekranda herhangi bir operator secilerek atama yapilir
   * Atamasi yapilan adayin atanmis adaylar listesine eklendigi dogrulanir
