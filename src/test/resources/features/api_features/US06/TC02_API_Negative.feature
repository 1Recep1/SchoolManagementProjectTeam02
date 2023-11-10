Feature: Zorunlu alanlar Bos Birakildiginda Kayit islemi gerceklesmemeli

  Scenario: Gender alani bos birakilmasi testi
    Given "Dean" olarak giris yapilir
    And Vice Dean kayit islemi icin URL duzenlenir
    And Vice Dean kayit islemi icin payload duzenlenir(Gender bos birakilr)
    When Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir(Gender bos birakilr)
    And Vice Dean kayit isleminin gerceklesmedi dogrulanir

