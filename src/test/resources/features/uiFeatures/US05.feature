@US05
Feature:US_05 Admin Dean'leri gorebilmeli ve silebilmelidir
  Background:
    Given Kullanici "url" sayfasina gider.
    And Kullanici 2 saniye bekler
    Then Kullanici logine tiklar
    And Username alanina Admin'e ait "username" girer
    And Password alanina Admin'e ait "password" girer ve logine tiklar
    And Kullanici 2 saniye bekler

    And Kullanici Sayfaya giris yaptigini dogrular
    And Kullanici 2 saniye bekler
    And Kullanici Menu butonuna tiklar
    And Kullanici 1 saniye bekler
    And Admin Main Menuden Dean Management'i secer


  Scenario: TC_01 Admin, Dean leri görebilmeli ve silebilmeli
    And Admin Dean Management sayfasina girdigini dogrular
    And Admin Dean List'te Name bilgilerini gorur
    And Admin Dean List'te Gender bilgilerini gorur
    And Admin Dean List'te Phone Number bilgilerini gorur
    And Admin Dean List'te Ssn bilgilerini gorur
    And Admin Dean List'te User Name bilgilerini gorur
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir

  Scenario: TC_02 Admin, Dean leri silebilmeli
    And Admin liste yaninda Sil butonun tiklar
    And Admin Listede kayitli Dean'i silebilmeli
    And Admin Listede kayitli Dean'i silebilmeldigini dogrular
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir

  Scenario: TC_03 Admin, Dean leri silebilmeli
    And Admin liste yaninda Edit butonun tiklar
    And Admin Listede kayitli Dean'i bilgilerini gunceller
    And Admin Sabmit butonuna tiklar
    And Admin Dean'in bilgilerinin guncelledigini gorur
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir



