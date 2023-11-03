Feature: US_07 Dean kullanicilarin gonderdigi mesajlari gorebilmeli
  Background:
    Given Kullanici "url" sayfasina gider.
    And Kullanici 2 saniye bekler
    Then Kullanici logine tiklar
    And Username alanina Dean'e ait "username" girer
    And Password alanina Dean'e ait "password" girer ve logine tiklar
    And Kullanici 2 saniye bekler
    And Kullanici Menu butonuna tiklar
    And Kullanici 1 saniye bekler
    And Dean Main menuden Contact Get All butonuna tiklar


  Scenario: TC_01 Dean silme butonunu gorebilmeli
    And Dean Contact Message'leri gorur
    And Dean Sil butonunu gorebilmeli
    And Dean Sil butonunun goruldugunu dogrular
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir

  Scenario: TC_02 Dean mesajların yazar, e-mail, tarih ve  subject bilgilerini gorebilmeli
    And Dean Yazar Column gorunur oldugunu dogrular
    And Dean Email Column gorunur oldugunu dogrular
    And Dean Date Column gorunur oldugunu dogrular
    And Dean Subject Column gorunur oldugunu dogrular
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir

  Scenario: TC_03 Dean mesajları silebilmeli
    And Dean sayfada Silme butonunu gorur
    And Dean sayfada Silme butonunu tiklar
    And Dean Mesajin silindigini dogrular
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir



