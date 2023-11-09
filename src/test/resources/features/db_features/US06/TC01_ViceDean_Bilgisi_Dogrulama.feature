@DB
  Feature: Vice Dean Bilgisi Dogrulama
    Scenario: Kayitli Vice Dean bilgisini dogrulama testi
      Given Database baglantisi kurulurRB
      And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir
      When Kayitli Vice Dean bilgisini almak icin Query gonderilirRB
      Then Kayitli Vice Dean bilgisi dogrulanirRB
      And Baglanti kesilirRB