Feature: Vice Dean Bilgisi Dogrulama
  Scenario: Kayitli Vice Dean bilgisini dogrulama testi
    Given Database baglantisi kurulur(Admin)
    And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir(Admin)
    When Kayitli Vice Dean bilgisini almak icin Query gonderilir(Admin)
    Then Kayitli Vice Dean bilgisi dogrulanir(Admin)
    And Baglanti kesilir(Admin)