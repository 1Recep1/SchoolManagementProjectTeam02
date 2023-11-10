Feature: Zorunlu alanlar Bos Birakildiginda Kayit islemi gerceklesmemeli

  Scenario: Tum alanlarin bos birakilmasi testi
    Given "Dean" olarak giris yapilir
    And Vice Dean kayit islemi icin URL duzenlenir
    And Vice Dean kayit islemi icin payload duzenlenir(Tum alanlar bos birakilr)
    When Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir(Tum bos alanlar icin)
    And Vice Dean kayit isleminin gerceklesmedi dogrulanir(Tum bos alanlar icin)