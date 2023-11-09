@E2E
  Feature: Dean, Vice Dean Ekleyebilmeli

    @Ui
    Scenario: TC01 Dean Web Sitesinde Vice Dean olusturabilmeliRB
      Given Kullanici web sitesine giderRB
      When Kullanici kayitli bir Dean hesabi ile giris yaparRB
      And Kullanici Vice Dean Management sayfasinda Name alanina "Ibrahim" girerRB
      And Surname alanina "Mardinli" girerRB
      And Birth Place alanina "Mardin" girerRB
      And Gender alaninda 'Male' cinsiyet secerRB
      And Date Of Birth alanina "05031973"girerRB
      And Phone alanina "312-562-9845" girerRB
      And Ssn alanina "312-52-3623" girerRB
      And Username alanina "Mardinli47" girerRB
      And Password alanina bir sifre girerRB
      And Submit butonuna tiklarRB
      And Vice dean saved mesajinin gorundugunu dogrularRB
      Then Sayfayi kapatirRB

    Scenario: Olusturulan Vice Dean hesap bilgisini alma testi
      Given "Dean" olarak giris yapilir
      And Kayitli Vice Dean hesab bilgisinin ID nosu alinir
      And Vice Dean GetViceDeanById icin URL duzenlenir
      And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir
      When Vice Dean GetViceDeanById icin GET Request gonderilir ve Response alinir
      Then Status kodun 200 oldugu dogrulanir
      And Vice Dean GetViceDeanById icin gelen Response body dogrulanir


    Scenario: Kayitli Vice Dean bilgisini dogrulama testi
      Given Database baglantisi kurulurRB
      And Vice Dean GetViceDeanById icin beklenen veriler duzenlenir
      When Kayitli Vice Dean bilgisini almak icin Query gonderilirRB
      Then Kayitli Vice Dean bilgisi dogrulanirRB
      And Baglanti kesilirRB

    Scenario: Kayitli Vice Dean hesabi silme testi
      Given "Dean" olarak giris yapilir
      And Vice Dean Delete icin URL duzenlenirRB
      When Vice Dean Delete icin DELETE Request gonderilir ve Response alinirRB
      Then Status kodun 200 oldugu dogrulanirRB

