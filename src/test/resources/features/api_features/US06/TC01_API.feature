@API_RB
  Feature: Dean, Vice Dean olusturabilmeliRB
    Scenario: Dean kullanicisi ile Vice Dean hesabi olusturma testi
      Given "Dean" olarak giris yapilir
      And Vice Dean kayit islemi icin URL duzenlenir
      And Vice Dean kayit islemi icin payload duzenlenir
      When Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir
      Then Status kodun 200 oldugu dogrulanir
      And Vice Dean kayit islemi icin gelen Response body dogrulanir

    Scenario: Olusturulan Vice Dean hesap bilgisini alma testi
      Given "Dean" olarak giris yapilir
      And Kayitli Vice Dean hesab bilgisinin ID nosu alinir
      And Vice Dean GetViceDeanById icin URL duzenlenir
      And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir
      When Vice Dean GetViceDeanById icin GET Request gonderilir ve Response alinir
      Then Status kodun 200 oldugu dogrulanir
      And Vice Dean GetViceDeanById icin gelen Response body dogrulanir
