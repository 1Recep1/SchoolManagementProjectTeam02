Feature: Admin, Vice Dean olusturabilmeliRB
  Scenario: Admin kullanicisi ile Vice Dean hesabi olusturma testi
    Given "Admin" olarak giris yapilir
    And Vice Dean kayit islemi icin URL duzenlenir
    And Vice Dean kayit islemi icin payload duzenlenir(Admin)
    When Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir(Admin)
    Then Status kodun 200 oldugu dogrulanir(Admin)
    And Vice Dean kayit islemi icin gelen Response body dogrulanir(Admin)

  Scenario: Olusturulan Vice Dean hesap bilgisini alma testi
    Given "Admin" olarak giris yapilir
    And Kayitli Vice Dean hesab bilgisinin ID nosu alinir(Admin)
    And Vice Dean GetViceDeanById icin URL duzenlenir(Admin)
    And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir(Admin)
    When Vice Dean GetViceDeanById icin GET Request gonderilir ve Response alinir(Admin)
    Then Status kodun 200 oldugu dogrulanir(Admin)
    And Vice Dean GetViceDeanById icin gelen Response body dogrulanir(Admin)