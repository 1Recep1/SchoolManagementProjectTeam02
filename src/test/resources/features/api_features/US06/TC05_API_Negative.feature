Feature: Zorunlu alanlar Bos Birakildiginda Kayit islemi gerceklesmemeli

  Scenario: 7 haneli Password girildiginde Kayit islemi gerceklesmemesi testi
    Given "Dean" olarak giris yapilir
    And Vice Dean kayit islemi icin URL duzenlenir
    And Vice Dean kayit islemi icin payload duzenlenir(Yedi haneli password girilir)
    When Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir(Password alani icin)
    And Vice Dean kayit isleminin gerceklesmedi dogrulanir(Password alani icin)