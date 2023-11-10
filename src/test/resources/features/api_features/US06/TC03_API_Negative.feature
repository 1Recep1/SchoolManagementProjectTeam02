Feature: Zorunlu alanlar Bos Birakildiginda Kayit islemi gerceklesmemeli

  Scenario: Hatali Ssn girildiginde Kayit isleminin gerceklesmemesi testi
    Given "Dean" olarak giris yapilir
    And Vice Dean kayit islemi icin URL duzenlenir
    And Vice Dean kayit islemi icin payload duzenlenir(Hatali Ssn girilir)
    When Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir(Hatali Ssn icin)
    And Vice Dean kayit isleminin gerceklesmedi dogrulanir(Hatali Ssn icin)