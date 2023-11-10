Feature: Zorunlu alanlar Bos Birakildiginda Kayit islemi gerceklesmemeli

  Scenario: Kucuk harf ve rakamlardan olusan Password girildiginde Kayit islemi gerceklesmemesi testi
    Given "Dean" olarak giris yapilir
    And Vice Dean kayit islemi icin URL duzenlenir
    And Vice Dean kayit islemi icin payload duzenlenir(Kucuk harf ve rakamlardan olusan Password girilir)
    When Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir(Password alani icin)
    And Vice Dean kayit isleminin gerceklesmedi dogrulanir(Password icerigi icin)